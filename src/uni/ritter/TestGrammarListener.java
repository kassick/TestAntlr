// Generated from C:/Users/rodrigo_kassick/IdeaProjects/Test1\TestGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestGrammarParser}.
 */
public interface TestGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void enterSexpr(TestGrammarParser.SexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void exitSexpr(TestGrammarParser.SexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#slist}.
	 * @param ctx the parse tree
	 */
	void enterSlist(TestGrammarParser.SlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#slist}.
	 * @param ctx the parse tree
	 */
	void exitSlist(TestGrammarParser.SlistContext ctx);
}