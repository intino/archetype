// Generated from /Users/oroncal/workspace/infrastructure/archetype/src/io/intino/archetype/lang/ArchetypeGrammar.g4 by ANTLR 4.13.1
package io.intino.archetype.lang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArchetypeGrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArchetypeGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ArchetypeGrammar.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ArchetypeGrammar.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(ArchetypeGrammar.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ArchetypeGrammar.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#starting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarting(ArchetypeGrammar.StartingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ArchetypeGrammar.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#splitted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitted(ArchetypeGrammar.SplittedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ArchetypeGrammar.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ArchetypeGrammar.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ArchetypeGrammar.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#ownerAndConsumer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerAndConsumer(ArchetypeGrammar.OwnerAndConsumerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArchetypeGrammar#uses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUses(ArchetypeGrammar.UsesContext ctx);
}