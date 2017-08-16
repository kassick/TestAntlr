// Generated from C:/Users/rodrigo_kassick/IdeaProjects/Test1\TestGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#sexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpr(TestGrammarParser.SexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#slist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlist(TestGrammarParser.SlistContext ctx);
}