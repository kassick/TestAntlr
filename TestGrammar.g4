grammar TestGrammar;

sexpr: LPAREN NAME slist RPAREN;

slist : NAME
      | sexpr slist
      |
      ;

NAME: [a-zA-Z]+;
LPAREN : '(' ;
RPAREN : ')' ;
WS: (' ' | '\t' | '\n' ) -> skip;