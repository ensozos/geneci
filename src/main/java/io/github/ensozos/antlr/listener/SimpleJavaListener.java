package io.github.ensozos.antlr.listener;// Generated from C:\Users\zosimadis\IdeaProjects\com.ensozos.classinfo.CILauncher\grammar\SimpleJava.g4 by ANTLR 4.7.2
import io.github.ensozos.antlr.parser.SimpleJavaParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(SimpleJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(SimpleJavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SimpleJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SimpleJavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(SimpleJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(SimpleJavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(SimpleJavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(SimpleJavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(SimpleJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(SimpleJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(SimpleJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(SimpleJavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(SimpleJavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(SimpleJavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SimpleJavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SimpleJavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(SimpleJavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(SimpleJavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(SimpleJavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(SimpleJavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(SimpleJavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(SimpleJavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(SimpleJavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(SimpleJavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(SimpleJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(SimpleJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(SimpleJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(SimpleJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(SimpleJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(SimpleJavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(SimpleJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(SimpleJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(SimpleJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(SimpleJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(SimpleJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(SimpleJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(SimpleJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(SimpleJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(SimpleJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(SimpleJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(SimpleJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(SimpleJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(SimpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(SimpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(SimpleJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(SimpleJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(SimpleJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(SimpleJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(SimpleJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(SimpleJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(SimpleJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(SimpleJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(SimpleJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(SimpleJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(SimpleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(SimpleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(SimpleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(SimpleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(SimpleJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(SimpleJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(SimpleJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(SimpleJavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(SimpleJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(SimpleJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(SimpleJavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(SimpleJavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(SimpleJavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(SimpleJavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(SimpleJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(SimpleJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SimpleJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SimpleJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(SimpleJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(SimpleJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(SimpleJavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(SimpleJavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SimpleJavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SimpleJavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimpleJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimpleJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SimpleJavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SimpleJavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SimpleJavaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SimpleJavaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SimpleJavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SimpleJavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(SimpleJavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(SimpleJavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(SimpleJavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(SimpleJavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(SimpleJavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(SimpleJavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(SimpleJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(SimpleJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(SimpleJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(SimpleJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(SimpleJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(SimpleJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(SimpleJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(SimpleJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(SimpleJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(SimpleJavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(SimpleJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(SimpleJavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(SimpleJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(SimpleJavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(SimpleJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(SimpleJavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SimpleJavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SimpleJavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(SimpleJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(SimpleJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(SimpleJavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(SimpleJavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(SimpleJavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(SimpleJavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(SimpleJavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(SimpleJavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(SimpleJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(SimpleJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(SimpleJavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(SimpleJavaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SimpleJavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SimpleJavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(SimpleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(SimpleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(SimpleJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(SimpleJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SimpleJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SimpleJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(SimpleJavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(SimpleJavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(SimpleJavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(SimpleJavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SimpleJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SimpleJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(SimpleJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(SimpleJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(SimpleJavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(SimpleJavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(SimpleJavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(SimpleJavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(SimpleJavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(SimpleJavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(SimpleJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(SimpleJavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(SimpleJavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(SimpleJavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(SimpleJavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(SimpleJavaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(SimpleJavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(SimpleJavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(SimpleJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(SimpleJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(SimpleJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(SimpleJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(SimpleJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(SimpleJavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(SimpleJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(SimpleJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(SimpleJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(SimpleJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(SimpleJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(SimpleJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(SimpleJavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(SimpleJavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(SimpleJavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(SimpleJavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(SimpleJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(SimpleJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(SimpleJavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(SimpleJavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(SimpleJavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(SimpleJavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(SimpleJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(SimpleJavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SimpleJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SimpleJavaParser.ArgumentsContext ctx);
}