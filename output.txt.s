	.def	 _main;
	.scl	2;
	.type	32;
	.endef
	.text
	.globl	_main
	.align	16, 0x90
_main:                                  # @main
# BB#0:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$12, %esp
	calll	___main
	movl	$10, -4(%ebp)
	movl	$10, 4(%esp)
	movl	$L_.format_str, (%esp)
	calll	_printf
	movl	$5, 4(%esp)
	movl	$L_.format_str, (%esp)
	calll	_printf
	xorl	%eax, %eax
	addl	$12, %esp
	popl	%ebp
	ret

	.data
L_.format_str:                          # @.format_str
	.asciz	 "%d\n"


