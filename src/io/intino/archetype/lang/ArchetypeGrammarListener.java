// Generated from /Users/oroncal/workspace/infrastructure/archetype/src/io/intino/archetype/lang/ArchetypeGrammar.g4 by ANTLR 4.13.1
package io.intino.archetype.lang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArchetypeGrammar}.
 */
public interface ArchetypeGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ArchetypeGrammar.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ArchetypeGrammar.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ArchetypeGrammar.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ArchetypeGrammar.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(ArchetypeGrammar.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(ArchetypeGrammar.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ArchetypeGrammar.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ArchetypeGrammar.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#starting}.
	 * @param ctx the parse tree
	 */
	void enterStarting(ArchetypeGrammar.StartingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#starting}.
	 * @param ctx the parse tree
	 */
	void exitStarting(ArchetypeGrammar.StartingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ArchetypeGrammar.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ArchetypeGrammar.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#splitted}.
	 * @param ctx the parse tree
	 */
	void enterSplitted(ArchetypeGrammar.SplittedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#splitted}.
	 * @param ctx the parse tree
	 */
	void exitSplitted(ArchetypeGrammar.SplittedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ArchetypeGrammar.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ArchetypeGrammar.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ArchetypeGrammar.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ArchetypeGrammar.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ArchetypeGrammar.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ArchetypeGrammar.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#ownerAndConsumer}.
	 * @param ctx the parse tree
	 */
	void enterOwnerAndConsumer(ArchetypeGrammar.OwnerAndConsumerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#ownerAndConsumer}.
	 * @param ctx the parse tree
	 */
	void exitOwnerAndConsumer(ArchetypeGrammar.OwnerAndConsumerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArchetypeGrammar#uses}.
	 * @param ctx the parse tree
	 */
	void enterUses(ArchetypeGrammar.UsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArchetypeGrammar#uses}.
	 * @param ctx the parse tree
	 */
	void exitUses(ArchetypeGrammar.UsesContext ctx);
}