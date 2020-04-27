// Generated from D:/lfa/BDL-Board-Description-Language/ABDLCompilerSource/src\Abdl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbdlParser}.
 */
public interface AbdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbdlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AbdlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AbdlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(AbdlParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(AbdlParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#functDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctDef(AbdlParser.FunctDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#functDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctDef(AbdlParser.FunctDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AbdlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AbdlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(AbdlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(AbdlParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AbdlParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AbdlParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AbdlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AbdlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AbdlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AbdlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(AbdlParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(AbdlParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#varAttrib}.
	 * @param ctx the parse tree
	 */
	void enterVarAttrib(AbdlParser.VarAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#varAttrib}.
	 * @param ctx the parse tree
	 */
	void exitVarAttrib(AbdlParser.VarAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AbdlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AbdlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(AbdlParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(AbdlParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EpxrFunctionCall}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EpxrFunctionCall}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCondition(AbdlParser.ExprConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCondition(AbdlParser.ExprConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParent(AbdlParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParent(AbdlParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(AbdlParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(AbdlParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPoint}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPoint(AbdlParser.ExprPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPoint}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPoint(AbdlParser.ExprPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(AbdlParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(AbdlParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOp(AbdlParser.ExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOp(AbdlParser.ExprOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCurrPlayer}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCurrPlayer}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNull(AbdlParser.ExprNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNull(AbdlParser.ExprNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprHeight}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprHeight(AbdlParser.ExprHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprHeight}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprHeight(AbdlParser.ExprHeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprWidth}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprWidth(AbdlParser.ExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprWidth}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprWidth(AbdlParser.ExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(AbdlParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(AbdlParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(AbdlParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(AbdlParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#typedArgs}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgs(AbdlParser.TypedArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#typedArgs}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgs(AbdlParser.TypedArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(AbdlParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(AbdlParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#board}.
	 * @param ctx the parse tree
	 */
	void enterBoard(AbdlParser.BoardContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#board}.
	 * @param ctx the parse tree
	 */
	void exitBoard(AbdlParser.BoardContext ctx);
}