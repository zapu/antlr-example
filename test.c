//#include <stdio.h>



int main() {
	int a;
	a = 10 + 0;
	return a;
}













// clang -S -emit-llvm test.c
// llc test.s
// ld -lmsvcrt test.s.s
// newline = 0x0A