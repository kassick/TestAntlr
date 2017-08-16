// Generated from C:/Users/rodrigo_kassick/IdeaProjects/Test1\TestGrammar.g4 by ANTLR 4.7
package uni.ritter;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link TestGrammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class TestGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TestGrammarVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSexpr(TestGrammarParser.SexprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSlist(TestGrammarParser.SlistContext ctx) { return visitChildren(ctx); }
}