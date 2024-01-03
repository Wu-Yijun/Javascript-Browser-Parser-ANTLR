import CListener from './CListener.js';

/*
regular replace rule
from:
enter(.*?)\(ctx\) \{
    \}
to:
enter$1(ctx) {
        logout(ctx, "$1");
    }
*/

function logout(ctx, str) {
    console.log(ctx.getChildCount(), ctx.getText(), str,
        ctx.getSourceInterval().start + ":" + ctx.getSourceInterval().stop);
}

export default class JSListener extends CListener {

    // Enter a parse tree produced by CParser#primaryExpression.
    enterPrimaryExpression(ctx) {
        logout(ctx, "PrimaryExpression");
    }

    // Exit a parse tree produced by CParser#primaryExpression.
    exitPrimaryExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#genericSelection.
    enterGenericSelection(ctx) {
        logout(ctx, "GenericSelection");
    }

    // Exit a parse tree produced by CParser#genericSelection.
    exitGenericSelection(ctx) {
    }


    // Enter a parse tree produced by CParser#genericAssocList.
    enterGenericAssocList(ctx) {
        logout(ctx, "GenericAssocList");
    }

    // Exit a parse tree produced by CParser#genericAssocList.
    exitGenericAssocList(ctx) {
    }


    // Enter a parse tree produced by CParser#genericAssociation.
    enterGenericAssociation(ctx) {
        logout(ctx, "GenericAssociation");
    }

    // Exit a parse tree produced by CParser#genericAssociation.
    exitGenericAssociation(ctx) {
    }


    // Enter a parse tree produced by CParser#postfixExpression.
    enterPostfixExpression(ctx) {
        logout(ctx, "PostfixExpression");
    }

    // Exit a parse tree produced by CParser#postfixExpression.
    exitPostfixExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#argumentExpressionList.
    enterArgumentExpressionList(ctx) {
        logout(ctx, "ArgumentExpressionList");
    }

    // Exit a parse tree produced by CParser#argumentExpressionList.
    exitArgumentExpressionList(ctx) {
    }


    // Enter a parse tree produced by CParser#unaryExpression.
    enterUnaryExpression(ctx) {
        logout(ctx, "UnaryExpression");
    }

    // Exit a parse tree produced by CParser#unaryExpression.
    exitUnaryExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#unaryOperator.
    enterUnaryOperator(ctx) {
        logout(ctx, "UnaryOperator");
    }

    // Exit a parse tree produced by CParser#unaryOperator.
    exitUnaryOperator(ctx) {
    }


    // Enter a parse tree produced by CParser#castExpression.
    enterCastExpression(ctx) {
        logout(ctx, "CastExpression");
    }

    // Exit a parse tree produced by CParser#castExpression.
    exitCastExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#multiplicativeExpression.
    enterMultiplicativeExpression(ctx) {
        logout(ctx, "MultiplicativeExpression");
    }

    // Exit a parse tree produced by CParser#multiplicativeExpression.
    exitMultiplicativeExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#additiveExpression.
    enterAdditiveExpression(ctx) {
        logout(ctx, "AdditiveExpression");
    }

    // Exit a parse tree produced by CParser#additiveExpression.
    exitAdditiveExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#shiftExpression.
    enterShiftExpression(ctx) {
        logout(ctx, "ShiftExpression");
    }

    // Exit a parse tree produced by CParser#shiftExpression.
    exitShiftExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#relationalExpression.
    enterRelationalExpression(ctx) {
        logout(ctx, "RelationalExpression");
    }

    // Exit a parse tree produced by CParser#relationalExpression.
    exitRelationalExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#equalityExpression.
    enterEqualityExpression(ctx) {
        logout(ctx, "EqualityExpression");
    }

    // Exit a parse tree produced by CParser#equalityExpression.
    exitEqualityExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#andExpression.
    enterAndExpression(ctx) {
        logout(ctx, "AndExpression");
    }

    // Exit a parse tree produced by CParser#andExpression.
    exitAndExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#exclusiveOrExpression.
    enterExclusiveOrExpression(ctx) {
        logout(ctx, "ExclusiveOrExpression");
    }

    // Exit a parse tree produced by CParser#exclusiveOrExpression.
    exitExclusiveOrExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#inclusiveOrExpression.
    enterInclusiveOrExpression(ctx) {
        logout(ctx, "InclusiveOrExpression");
    }

    // Exit a parse tree produced by CParser#inclusiveOrExpression.
    exitInclusiveOrExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#logicalAndExpression.
    enterLogicalAndExpression(ctx) {
        logout(ctx, "LogicalAndExpression");
    }

    // Exit a parse tree produced by CParser#logicalAndExpression.
    exitLogicalAndExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#logicalOrExpression.
    enterLogicalOrExpression(ctx) {
        logout(ctx, "LogicalOrExpression");
    }

    // Exit a parse tree produced by CParser#logicalOrExpression.
    exitLogicalOrExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#conditionalExpression.
    enterConditionalExpression(ctx) {
        logout(ctx, "ConditionalExpression");
    }

    // Exit a parse tree produced by CParser#conditionalExpression.
    exitConditionalExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#assignmentExpression.
    enterAssignmentExpression(ctx) {
        logout(ctx, "AssignmentExpression");
    }

    // Exit a parse tree produced by CParser#assignmentExpression.
    exitAssignmentExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#assignmentOperator.
    enterAssignmentOperator(ctx) {
        logout(ctx, "AssignmentOperator");
    }

    // Exit a parse tree produced by CParser#assignmentOperator.
    exitAssignmentOperator(ctx) {
    }


    // Enter a parse tree produced by CParser#expression.
    enterExpression(ctx) {
        logout(ctx, "Expression");
    }

    // Exit a parse tree produced by CParser#expression.
    exitExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#constantExpression.
    enterConstantExpression(ctx) {
        logout(ctx, "ConstantExpression");
    }

    // Exit a parse tree produced by CParser#constantExpression.
    exitConstantExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#declaration.
    enterDeclaration(ctx) {
        logout(ctx, "Declaration");
    }

    // Exit a parse tree produced by CParser#declaration.
    exitDeclaration(ctx) {
    }


    // Enter a parse tree produced by CParser#declarationSpecifiers.
    enterDeclarationSpecifiers(ctx) {
        logout(ctx, "DeclarationSpecifiers");
    }

    // Exit a parse tree produced by CParser#declarationSpecifiers.
    exitDeclarationSpecifiers(ctx) {
    }


    // Enter a parse tree produced by CParser#declarationSpecifiers2.
    enterDeclarationSpecifiers2(ctx) {
        logout(ctx, "DeclarationSpecifiers2");
    }

    // Exit a parse tree produced by CParser#declarationSpecifiers2.
    exitDeclarationSpecifiers2(ctx) {
    }


    // Enter a parse tree produced by CParser#declarationSpecifier.
    enterDeclarationSpecifier(ctx) {
        logout(ctx, "DeclarationSpecifier");
    }

    // Exit a parse tree produced by CParser#declarationSpecifier.
    exitDeclarationSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#initDeclaratorList.
    enterInitDeclaratorList(ctx) {
        logout(ctx, "InitDeclaratorList");
    }

    // Exit a parse tree produced by CParser#initDeclaratorList.
    exitInitDeclaratorList(ctx) {
    }


    // Enter a parse tree produced by CParser#initDeclarator.
    enterInitDeclarator(ctx) {
        logout(ctx, "InitDeclarator");
    }

    // Exit a parse tree produced by CParser#initDeclarator.
    exitInitDeclarator(ctx) {
    }


    // Enter a parse tree produced by CParser#storageClassSpecifier.
    enterStorageClassSpecifier(ctx) {
        logout(ctx, "StorageClassSpecifier");
    }

    // Exit a parse tree produced by CParser#storageClassSpecifier.
    exitStorageClassSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#typeSpecifier.
    enterTypeSpecifier(ctx) {
        logout(ctx, "TypeSpecifier");
    }

    // Exit a parse tree produced by CParser#typeSpecifier.
    exitTypeSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#structOrUnionSpecifier.
    enterStructOrUnionSpecifier(ctx) {
        logout(ctx, "StructOrUnionSpecifier");
    }

    // Exit a parse tree produced by CParser#structOrUnionSpecifier.
    exitStructOrUnionSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#structOrUnion.
    enterStructOrUnion(ctx) {
        logout(ctx, "StructOrUnion");
    }

    // Exit a parse tree produced by CParser#structOrUnion.
    exitStructOrUnion(ctx) {
    }


    // Enter a parse tree produced by CParser#structDeclarationList.
    enterStructDeclarationList(ctx) {
        logout(ctx, "StructDeclarationList");
    }

    // Exit a parse tree produced by CParser#structDeclarationList.
    exitStructDeclarationList(ctx) {
    }


    // Enter a parse tree produced by CParser#structDeclaration.
    enterStructDeclaration(ctx) {
        logout(ctx, "StructDeclaration");
    }

    // Exit a parse tree produced by CParser#structDeclaration.
    exitStructDeclaration(ctx) {
    }


    // Enter a parse tree produced by CParser#specifierQualifierList.
    enterSpecifierQualifierList(ctx) {
        logout(ctx, "SpecifierQualifierList");
    }

    // Exit a parse tree produced by CParser#specifierQualifierList.
    exitSpecifierQualifierList(ctx) {
    }


    // Enter a parse tree produced by CParser#structDeclaratorList.
    enterStructDeclaratorList(ctx) {
        logout(ctx, "StructDeclaratorList");
    }

    // Exit a parse tree produced by CParser#structDeclaratorList.
    exitStructDeclaratorList(ctx) {
    }


    // Enter a parse tree produced by CParser#structDeclarator.
    enterStructDeclarator(ctx) {
        logout(ctx, "StructDeclarator");
    }

    // Exit a parse tree produced by CParser#structDeclarator.
    exitStructDeclarator(ctx) {
    }


    // Enter a parse tree produced by CParser#enumSpecifier.
    enterEnumSpecifier(ctx) {
        logout(ctx, "EnumSpecifier");
    }

    // Exit a parse tree produced by CParser#enumSpecifier.
    exitEnumSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#enumeratorList.
    enterEnumeratorList(ctx) {
        logout(ctx, "EnumeratorList");
    }

    // Exit a parse tree produced by CParser#enumeratorList.
    exitEnumeratorList(ctx) {
    }


    // Enter a parse tree produced by CParser#enumerator.
    enterEnumerator(ctx) {
        logout(ctx, "Enumerator");
    }

    // Exit a parse tree produced by CParser#enumerator.
    exitEnumerator(ctx) {
    }


    // Enter a parse tree produced by CParser#enumerationConstant.
    enterEnumerationConstant(ctx) {
        logout(ctx, "EnumerationConstant");
    }

    // Exit a parse tree produced by CParser#enumerationConstant.
    exitEnumerationConstant(ctx) {
    }


    // Enter a parse tree produced by CParser#atomicTypeSpecifier.
    enterAtomicTypeSpecifier(ctx) {
        logout(ctx, "AtomicTypeSpecifier");
    }

    // Exit a parse tree produced by CParser#atomicTypeSpecifier.
    exitAtomicTypeSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#typeQualifier.
    enterTypeQualifier(ctx) {
        logout(ctx, "TypeQualifier");
    }

    // Exit a parse tree produced by CParser#typeQualifier.
    exitTypeQualifier(ctx) {
    }


    // Enter a parse tree produced by CParser#functionSpecifier.
    enterFunctionSpecifier(ctx) {
        logout(ctx, "FunctionSpecifier");
    }

    // Exit a parse tree produced by CParser#functionSpecifier.
    exitFunctionSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#alignmentSpecifier.
    enterAlignmentSpecifier(ctx) {
        logout(ctx, "AlignmentSpecifier");
    }

    // Exit a parse tree produced by CParser#alignmentSpecifier.
    exitAlignmentSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#declarator.
    enterDeclarator(ctx) {
        logout(ctx, "Declarator");
    }

    // Exit a parse tree produced by CParser#declarator.
    exitDeclarator(ctx) {
    }


    // Enter a parse tree produced by CParser#directDeclarator.
    enterDirectDeclarator(ctx) {
        logout(ctx, "DirectDeclarator");
    }

    // Exit a parse tree produced by CParser#directDeclarator.
    exitDirectDeclarator(ctx) {
    }


    // Enter a parse tree produced by CParser#vcSpecificModifer.
    enterVcSpecificModifer(ctx) {
        logout(ctx, "VcSpecificModifer");
    }

    // Exit a parse tree produced by CParser#vcSpecificModifer.
    exitVcSpecificModifer(ctx) {
    }


    // Enter a parse tree produced by CParser#gccDeclaratorExtension.
    enterGccDeclaratorExtension(ctx) {
        logout(ctx, "GccDeclaratorExtension");
    }

    // Exit a parse tree produced by CParser#gccDeclaratorExtension.
    exitGccDeclaratorExtension(ctx) {
    }


    // Enter a parse tree produced by CParser#gccAttributeSpecifier.
    enterGccAttributeSpecifier(ctx) {
        logout(ctx, "GccAttributeSpecifier");
    }

    // Exit a parse tree produced by CParser#gccAttributeSpecifier.
    exitGccAttributeSpecifier(ctx) {
    }


    // Enter a parse tree produced by CParser#gccAttributeList.
    enterGccAttributeList(ctx) {
        logout(ctx, "GccAttributeList");
    }

    // Exit a parse tree produced by CParser#gccAttributeList.
    exitGccAttributeList(ctx) {
    }


    // Enter a parse tree produced by CParser#gccAttribute.
    enterGccAttribute(ctx) {
        logout(ctx, "GccAttribute");
    }

    // Exit a parse tree produced by CParser#gccAttribute.
    exitGccAttribute(ctx) {
    }


    // Enter a parse tree produced by CParser#nestedParenthesesBlock.
    enterNestedParenthesesBlock(ctx) {
        logout(ctx, "NestedParenthesesBlock");
    }

    // Exit a parse tree produced by CParser#nestedParenthesesBlock.
    exitNestedParenthesesBlock(ctx) {
    }


    // Enter a parse tree produced by CParser#pointer.
    enterPointer(ctx) {
        logout(ctx, "Pointer");
    }

    // Exit a parse tree produced by CParser#pointer.
    exitPointer(ctx) {
    }


    // Enter a parse tree produced by CParser#typeQualifierList.
    enterTypeQualifierList(ctx) {
        logout(ctx, "TypeQualifierList");
    }

    // Exit a parse tree produced by CParser#typeQualifierList.
    exitTypeQualifierList(ctx) {
    }


    // Enter a parse tree produced by CParser#parameterTypeList.
    enterParameterTypeList(ctx) {
        logout(ctx, "ParameterTypeList");
    }

    // Exit a parse tree produced by CParser#parameterTypeList.
    exitParameterTypeList(ctx) {
    }


    // Enter a parse tree produced by CParser#parameterList.
    enterParameterList(ctx) {
        logout(ctx, "ParameterList");
    }

    // Exit a parse tree produced by CParser#parameterList.
    exitParameterList(ctx) {
    }


    // Enter a parse tree produced by CParser#parameterDeclaration.
    enterParameterDeclaration(ctx) {
        logout(ctx, "ParameterDeclaration");
    }

    // Exit a parse tree produced by CParser#parameterDeclaration.
    exitParameterDeclaration(ctx) {
    }


    // Enter a parse tree produced by CParser#identifierList.
    enterIdentifierList(ctx) {
        logout(ctx, "IdentifierList");
    }

    // Exit a parse tree produced by CParser#identifierList.
    exitIdentifierList(ctx) {
    }


    // Enter a parse tree produced by CParser#typeName.
    enterTypeName(ctx) {
        logout(ctx, "TypeName");
    }

    // Exit a parse tree produced by CParser#typeName.
    exitTypeName(ctx) {
    }


    // Enter a parse tree produced by CParser#abstractDeclarator.
    enterAbstractDeclarator(ctx) {
        logout(ctx, "AbstractDeclarator");
    }

    // Exit a parse tree produced by CParser#abstractDeclarator.
    exitAbstractDeclarator(ctx) {
    }


    // Enter a parse tree produced by CParser#directAbstractDeclarator.
    enterDirectAbstractDeclarator(ctx) {
        logout(ctx, "DirectAbstractDeclarator");
    }

    // Exit a parse tree produced by CParser#directAbstractDeclarator.
    exitDirectAbstractDeclarator(ctx) {
    }


    // Enter a parse tree produced by CParser#typedefName.
    enterTypedefName(ctx) {
        logout(ctx, "TypedefName");
    }

    // Exit a parse tree produced by CParser#typedefName.
    exitTypedefName(ctx) {
    }


    // Enter a parse tree produced by CParser#initializer.
    enterInitializer(ctx) {
        logout(ctx, "Initializer");
    }

    // Exit a parse tree produced by CParser#initializer.
    exitInitializer(ctx) {
    }


    // Enter a parse tree produced by CParser#initializerList.
    enterInitializerList(ctx) {
        logout(ctx, "InitializerList");
    }

    // Exit a parse tree produced by CParser#initializerList.
    exitInitializerList(ctx) {
    }


    // Enter a parse tree produced by CParser#designation.
    enterDesignation(ctx) {
        logout(ctx, "Designation");
    }

    // Exit a parse tree produced by CParser#designation.
    exitDesignation(ctx) {
    }


    // Enter a parse tree produced by CParser#designatorList.
    enterDesignatorList(ctx) {
        logout(ctx, "DesignatorList");
    }

    // Exit a parse tree produced by CParser#designatorList.
    exitDesignatorList(ctx) {
    }


    // Enter a parse tree produced by CParser#designator.
    enterDesignator(ctx) {
        logout(ctx, "Designator");
    }

    // Exit a parse tree produced by CParser#designator.
    exitDesignator(ctx) {
    }


    // Enter a parse tree produced by CParser#staticAssertDeclaration.
    enterStaticAssertDeclaration(ctx) {
        logout(ctx, "StaticAssertDeclaration");
    }

    // Exit a parse tree produced by CParser#staticAssertDeclaration.
    exitStaticAssertDeclaration(ctx) {
    }


    // Enter a parse tree produced by CParser#statement.
    enterStatement(ctx) {
        logout(ctx, "Statement");
    }

    // Exit a parse tree produced by CParser#statement.
    exitStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#labeledStatement.
    enterLabeledStatement(ctx) {
        logout(ctx, "LabeledStatement");
    }

    // Exit a parse tree produced by CParser#labeledStatement.
    exitLabeledStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#compoundStatement.
    enterCompoundStatement(ctx) {
        logout(ctx, "CompoundStatement");
    }

    // Exit a parse tree produced by CParser#compoundStatement.
    exitCompoundStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#blockItemList.
    enterBlockItemList(ctx) {
        logout(ctx, "BlockItemList");
    }

    // Exit a parse tree produced by CParser#blockItemList.
    exitBlockItemList(ctx) {
    }


    // Enter a parse tree produced by CParser#blockItem.
    enterBlockItem(ctx) {
        logout(ctx, "BlockItem");
    }

    // Exit a parse tree produced by CParser#blockItem.
    exitBlockItem(ctx) {
    }


    // Enter a parse tree produced by CParser#expressionStatement.
    enterExpressionStatement(ctx) {
        logout(ctx, "ExpressionStatement");
    }

    // Exit a parse tree produced by CParser#expressionStatement.
    exitExpressionStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#selectionStatement.
    enterSelectionStatement(ctx) {
        logout(ctx, "SelectionStatement");
    }

    // Exit a parse tree produced by CParser#selectionStatement.
    exitSelectionStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#iterationStatement.
    enterIterationStatement(ctx) {
        logout(ctx, "IterationStatement");
    }

    // Exit a parse tree produced by CParser#iterationStatement.
    exitIterationStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#forCondition.
    enterForCondition(ctx) {
        logout(ctx, "ForCondition");
    }

    // Exit a parse tree produced by CParser#forCondition.
    exitForCondition(ctx) {
    }


    // Enter a parse tree produced by CParser#forDeclaration.
    enterForDeclaration(ctx) {
        logout(ctx, "ForDeclaration");
    }

    // Exit a parse tree produced by CParser#forDeclaration.
    exitForDeclaration(ctx) {
    }


    // Enter a parse tree produced by CParser#forExpression.
    enterForExpression(ctx) {
        logout(ctx, "ForExpression");
    }

    // Exit a parse tree produced by CParser#forExpression.
    exitForExpression(ctx) {
    }


    // Enter a parse tree produced by CParser#jumpStatement.
    enterJumpStatement(ctx) {
        logout(ctx, "JumpStatement");
    }

    // Exit a parse tree produced by CParser#jumpStatement.
    exitJumpStatement(ctx) {
    }


    // Enter a parse tree produced by CParser#compilationUnit.
    enterCompilationUnit(ctx) {
        logout(ctx, "CompilationUnit");
    }

    // Exit a parse tree produced by CParser#compilationUnit.
    exitCompilationUnit(ctx) {
    }


    // Enter a parse tree produced by CParser#translationUnit.
    enterTranslationUnit(ctx) {
        logout(ctx, "TranslationUnit");
    }

    // Exit a parse tree produced by CParser#translationUnit.
    exitTranslationUnit(ctx) {
    }


    // Enter a parse tree produced by CParser#externalDeclaration.
    enterExternalDeclaration(ctx) {
        logout(ctx, "ExternalDeclaration");
    }

    // Exit a parse tree produced by CParser#externalDeclaration.
    exitExternalDeclaration(ctx) {
    }


    // Enter a parse tree produced by CParser#functionDefinition.
    enterFunctionDefinition(ctx) {
        logout(ctx, "FunctionDefinition");
    }

    // Exit a parse tree produced by CParser#functionDefinition.
    exitFunctionDefinition(ctx) {
    }


    // Enter a parse tree produced by CParser#declarationList.
    enterDeclarationList(ctx) {
        logout(ctx, "DeclarationList");
    }

    // Exit a parse tree produced by CParser#declarationList.
    exitDeclarationList(ctx) {
    }


    // Enter a parse tree produced by CParser#macroDefines.
    enterMacroDefines(ctx) {
        logout(ctx, "MacroDefines");
    }

    // Exit a parse tree produced by CParser#macroDefines.
    exitMacroDefines(ctx) {
    }


    // Enter a parse tree produced by CParser#includePath.
    enterIncludePath(ctx) {
        logout(ctx, "IncludePath");
    }

    // Exit a parse tree produced by CParser#includePath.
    exitIncludePath(ctx) {
    }


    // Enter a parse tree produced by CParser#defineMacro.
    enterDefineMacro(ctx) {
        logout(ctx, "DefineMacro");
    }

    // Exit a parse tree produced by CParser#defineMacro.
    exitDefineMacro(ctx) {
    }




};