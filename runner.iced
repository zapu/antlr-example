fs = require 'fs'
path = require 'path'
spawn = require('child_process').spawn
exec = require('child_process').exec

tests_path = path.normalize path.join __dirname, 'tests'
compiler_path = path.join (path.resolve process.cwd(), path.join __dirname, 'out', 'artifacts', 'jfk2013_jar'), 'jfk2013.jar'

spawnexec = (what, args, cwd, cb) ->
	chp = spawn what, args, {cwd: cwd}
	chp.on 'close', (code) ->
		cb(code)

	chp.stdout.pipe(process.stdout)
	chp.stderr.pipe(process.stderr)

extractSections = (str) ->
	strs = str.split "\n"
	source = []
	expected = []

	state = 0

	for v in strs
		if v.indexOf('###SOURCE') == 0
			state = 1
		else if v.indexOf("###EXPECTED") == 0
			state = 2
		else
			v = v.replace("\r", "")
			if state == 1
				source.push v
			else if state == 2
				expected.push v

	return [source.join("\n"), expected.join("\n")]


runTest = (filename, cb) ->
	process.stdout.write "Running test " + filename + "... "

	str = fs.readFileSync path.join tests_path, filename
	[source, expected] = extractSections str.toString()

	fs.writeFileSync path.join(tests_path, 'tmp'), source

	await spawnexec 'java', ['-jar', compiler_path, 'tmp', 'tmp.ll'], tests_path, defer code
	if code != 0
		console.log "Compile error"
		return cb(false)

	await spawnexec 'llc', ['tmp.ll'], tests_path, defer code
	if code != 0
		console.log "llc error"
		return cb(false)

	await spawnexec 'g++', ['tmp.s'], tests_path, defer code
	if code != 0
		console.log "g++ error"
		return cb(false)

	await exec 'a.exe', {cwd: tests_path}, defer err, stdout, stderr
	if(stdout != expected)
		console.log 'output mismatch'
		console.log 'stdout:', stdout.replace("\r", "\\r")
		console.log 'expected:', expected.replace("\r", "\\r")
		return cb(false)

	console.log "ok"
	return cb(true)

for v in fs.readdirSync(tests_path)
	if path.extname(v) == '.txt'
		await runTest v, defer ret