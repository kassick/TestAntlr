grammar TestGrammar;

sexpr: LPAREN NAME slist RPAREN;

slist : NAME
      | sexpr slist
      |
      ;

NAME: [a-zA-Z]+;
LPAREN : '(' ;
RPAREN : ')' ;
NONONO : 'nonono';
WS: (' ' | '\t' | '\n' ) -> skip;