grammar jfkgrammar;

@header {
package jfk;
import jfk.Compiler;
}

program returns [Compiler.Program ret] :
    { $ret =new Compiler.Program(); }
    (s = statement { $ret.add($s.ret); } ';')*
    ;

statement returns [Compiler.Statement ret] :
    'var' ID { $ret = new Compiler.VariableDeclaration($ID.text); } |
    a = ID '=' e = expression { $ret = new Compiler.Assignment($a.text, $e.ret); } |
    'ret' e = expression { $ret = new Compiler.Return($e.ret); }
    ;

expression returns [Compiler.Expression ret] :
    INT { $ret = new Compiler.IntExpression($INT.text); } |
    ID { $ret = new Compiler.RefExpression($ID.text); }
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


