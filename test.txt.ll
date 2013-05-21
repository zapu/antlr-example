@.format_str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
declare i32 @printf(i8*, ...) nounwind
define i32 @main() nounwind {
%a = alloca i32, align 4
%1 = add i32 0, 10
store i32 %1, i32* %a, align 4
%2 = add i32 0, 10
%3 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.format_str, i32 0, i32 0), i32 %2) nounwind
%4 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.format_str, i32 0, i32 0), i32 %0) nounwind
ret i32 0
}
