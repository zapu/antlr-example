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
	pushl	%eax
	calll	___main
	movl	$L_.str, (%esp)
	calll	_printf
	xorl	%eax, %eax
	addl	$4, %esp
	popl	%ebp
	ret

	.data
L_.str:                                 # @.str
	.asciz	 "aa"


