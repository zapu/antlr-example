
grammar jfkgrammar;

@header {
package jfk;
import jfk.Compiler;
}

//blocks are divided by any number of ;
//any number of ; are also allowed at the beginning
//and at the end of a block
program : (';')* program_block*;

program_block : (statement ';'+) | (function ';'*);

body : '{' ((';')* statement ((';') + statement)* (';')+)? '}';
function : 'def' ID '(' (ID (',' ID)*)? ')' body;

statement : invocation | expression | variable_definition;

invocation : ID '(' (expression (',' expression)*)? ')'
{System.out.println("inv: " + $ID.text); };

expression : INT | ID | ar_expression | assignment;

ar_expression : mult_expression (('+' | '-') mult_expression)*;
mult_expression : expression_atom (('*' | '/') expression_atom)*;

expression_atom : INT | ID | '(' expression ')';

assignment : ID '=' expression;

variable_definition returns [Compiler.VariableDefinition val] :
    'var' name = ID { $val = new Compiler.VariableDefinition($name.text); };

type : ('int' | 'float') ;
INT : '0'..'9'+ ;
ID  : 'a'..'z'+ ;
WS : (' '|'\r'|'\n') -> skip;

