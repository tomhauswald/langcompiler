// Generated from E:/Projects/Java/intellij-ws/langparser/grammar\Lang.g4 by ANTLR 4.5.1
package lang.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(LangParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(LangParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(LangParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#returnTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnTypes(LangParser.ReturnTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(LangParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#anonArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonArguments(LangParser.AnonArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(LangParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(LangParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#callArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArguments(LangParser.CallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(LangParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(LangParser.PrimitiveContext ctx);
}