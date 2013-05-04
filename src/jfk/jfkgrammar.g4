
grammar jfkgrammar;

@header {
package jfk;
import jfk.Compiler;
}


//blocks are divided by any number of ;
//any number of ; are also allowed at the beginning
//and at the end of a block
program returns [Compiler.Program val] :
    { $val = new Compiler.Program(); }
    (';')*
    (
        (statement ';'+) { $val.statements.add($statement.val); } |
        (function ';'*) { $val.functions.add($function.val); }
    )*;

body returns [Compiler.Body val] :
    '{'
    ((';')* a = statement { $val = new Compiler.Body(); $val.add($a.val); }
        ((';')+ b = statement { $val.add($b.val); })*
    (';')+)?
    '}'
;

function returns [Compiler.Function val] :
    'def' name = ID { $val = new Compiler.Function($name.text); }
    '('
        (arg1 = ID  { $val.addArg($arg1.text); }
        (',' arg2 = ID { $val.addArg($arg2.text); })*)?
    ')'
    body { $val.setBody($body.val); }
;

statement returns [Compiler.Statement val] :
    a = invocation {$val = new Compiler.StatementExpression($a.val); } |
    b = expression {$val = new Compiler.StatementExpression($b.val); } |
    c = variable_definition { $val = $c.val; }
;

invocation returns [Compiler.Invocation val] :
    a = ID '(' { $val = new Compiler.Invocation($a.text); }
        (e1 = expression { $val.addParam($e1.val); }
        (',' e2 = expression { $val.addParam($e2.val); })*)?
    ')'
;
expression returns [Compiler.Expression val] :
    a = INT { $val = new Compiler.IntExpression($a.text); } |
    a = ID { $val = new Compiler.Reference($a.text); } |
    b = ar_expression { $val = $b.val; } |
    c = invocation { $val = $c.val; } |
    d = assignment { $val = $d.val; }
;

ar_expression returns [Compiler.ArExpression val] :
    a = mult_expression { $val = new Compiler.ArExpression($a.val); }
    (('+' | '-') b = mult_expression { $val.add($b.val); })*
;

mult_expression returns [Compiler.ArExpression val] :
    a = expression_atom { $val = new Compiler.ArExpression($a.val); }
    (('*' | '/') b = expression_atom { $val.add($b.val); })*
;

expression_atom returns [Compiler.Expression val] :
    a = INT { $val = new Compiler.IntExpression($a.text); } |
    a = ID { $val = new Compiler.Reference($a.text); } |
    '(' expression ')' { $val = $expression.val; }
;

assignment returns [Compiler.Assignment val] :
    to = ID '=' what = expression { $val = new Compiler.Assignment($to.text, $what.val); }
;

variable_definition returns [Compiler.VariableDefinition val] :
    'var' name = ID { $val = new Compiler.VariableDefinition($name.text); }
;

COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;

type : ('int' | 'float') ;
INT : '0'..'9'+ ;
ID  : 'a'..'z'+ ;
WS : (' '|'\r'|'\n') -> skip;

