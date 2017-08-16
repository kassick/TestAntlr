package uni.ritter;

import org.antlr.v4.runtime.*;

public class Main {



    public static void main(String[] args) {
	// write your code here

            TestGrammarLexer lexer = new TestGrammarLexer(CharStreams.fromString("(a b c)"));

            Token tk = lexer.nextToken();
            while(tk != null && tk.getType() != Token.EOF) {
                System.out.println("Token: " + tk.toString());
                tk = lexer.nextToken();
            }
    }
}
