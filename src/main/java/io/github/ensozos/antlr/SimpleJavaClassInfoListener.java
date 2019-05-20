package io.github.ensozos.antlr;

import io.github.ensozos.antlr.listener.ILanguageListener;
import io.github.ensozos.antlr.listener.SimpleJavaBaseListener;
import io.github.ensozos.antlr.parser.SimpleJavaParser;
import io.github.ensozos.model.EntityType;
import io.github.ensozos.util.GlobalGson;
import io.github.ensozos.model.Entity;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class SimpleJavaClassInfoListener extends SimpleJavaBaseListener implements ILanguageListener {
    /**
     * Basic hashmap used to store all the source entities. The key is the name of current
     * entity and value an Entity object.
     */
    private HashMap<String, Entity> sourceEntities;

    /**
     * The current entity object. This object may change for inner classes,
     * interfaces or enums.
     */
    private Entity currentEntity;

    /**
     * Stack into which entity names are stored. This data structure helps
     * to handle nested entities.
     */
    private Stack<String> entityNameStack;

    /**
     * Stack into which method position is stored. The stack is used to handle
     * nested methods in current entity.
     */
    private Stack<Integer> currentMethodIDStack;

    /**
     * Method position that is used in currentMethodIDStack.
     */
    private int methodID = 0;

    /**
     * Constructs an empty simpleJavaClassInfo listener.
     */
    public SimpleJavaClassInfoListener() {
        sourceEntities = new HashMap<>();
        entityNameStack = new Stack<>();
        currentMethodIDStack = new Stack<>();
    }

    public void enterTypeDeclaration(SimpleJavaParser.TypeDeclarationContext ctx) {
        if (ctx.classDeclaration() != null) {
            SimpleJavaParser.ClassDeclarationContext classDeclaration = ctx.classDeclaration();
            String currentClassName = classDeclaration.IDENTIFIER().getText();
            entityNameStack.push(currentClassName);

            currentEntity = new Entity(currentClassName, EntityType.CLASS);

            SimpleJavaParser.TypeTypeContext extendClass = classDeclaration.typeType();
            List<SimpleJavaParser.TypeTypeContext> imlementClassList = classDeclaration.typeList() != null ? classDeclaration.typeList().typeType() : null;

            if (extendClass != null)
                currentEntity.setExtendClass(extendClass.getText());
            if (imlementClassList != null)
                for (SimpleJavaParser.TypeTypeContext implementClass : imlementClassList) {
                    currentEntity.setImplementClass(implementClass.getText());
                }
        } else if (ctx.interfaceDeclaration() != null) {
            SimpleJavaParser.InterfaceDeclarationContext interfaceDeclaration = ctx.interfaceDeclaration();
            String currentInterfaceName = interfaceDeclaration.IDENTIFIER().getText();
            entityNameStack.push(currentInterfaceName);

            currentEntity = new Entity(interfaceDeclaration.IDENTIFIER().getText(), EntityType.INTERFACE);

            List<SimpleJavaParser.TypeTypeContext> extendClassList = interfaceDeclaration.typeList() != null ? interfaceDeclaration.typeList().typeType() : null;
            if (extendClassList != null) {
                for (SimpleJavaParser.TypeTypeContext extendedClass : extendClassList) {
                    currentEntity.setExtendClass(extendedClass.getText());
                }
            }

        }

    }

    public void exitTypeDeclaration(SimpleJavaParser.TypeDeclarationContext ctx) {
        if (ctx.classDeclaration() != null) {
            String currentEntityName = entityNameStack.pop();
            sourceEntities.put(currentEntityName, currentEntity);
        }

        //reset currentMethodIDStack
        currentMethodIDStack.clear();
        methodID = 0;
    }

    public void enterMemberDeclaration(SimpleJavaParser.MemberDeclarationContext ctx) {
        if (ctx.classDeclaration() != null) {
            String className = ctx.classDeclaration().IDENTIFIER().getText();
            currentEntity.setInnerEntity(className);

            //save current entity and push the new one to Stack
            sourceEntities.put(currentEntity.getEntityName(), currentEntity);
            entityNameStack.push(className);
        } else if (ctx.interfaceDeclaration() != null) {
            String interfaceName = ctx.interfaceDeclaration().IDENTIFIER().getText();
            currentEntity.setInnerEntity(interfaceName);

            sourceEntities.put(currentEntity.getEntityName(), currentEntity);
            entityNameStack.push(interfaceName);
        } else if (ctx.enumDeclaration() != null) {
            String enumName = ctx.enumDeclaration().IDENTIFIER().getText();
            currentEntity.setInnerEntity(enumName);

            sourceEntities.put(currentEntity.getEntityName(), currentEntity);
            entityNameStack.push(enumName);
        }
    }

    public void exitMemberDeclaration(SimpleJavaParser.MemberDeclarationContext ctx) {
        if (ctx.classDeclaration() != null || ctx.interfaceDeclaration() != null) {
            //remove and save the last entity
            String lastEntityName = entityNameStack.pop();
            sourceEntities.put(lastEntityName, currentEntity);

            //restore the previous entity
            currentEntity = sourceEntities.get(entityNameStack.lastElement());
        }

    }

    public void enterInterfaceDeclaration(SimpleJavaParser.InterfaceDeclarationContext ctx) {
        String interfaceName = ctx.IDENTIFIER().getText();
        if (interfaceName == currentEntity.getEntityName()) return;

        currentEntity = new Entity(interfaceName, EntityType.INTERFACE);
        List<SimpleJavaParser.TypeTypeContext> extendClassList = ctx.typeList() != null ? ctx.typeList().typeType() : null;
        if (extendClassList != null) {
            for (SimpleJavaParser.TypeTypeContext extendedClass : extendClassList) {
                currentEntity.setExtendClass(extendedClass.getText());
            }
        }

    }

    public void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        if (className == currentEntity.getEntityName()) return;

        currentEntity = new Entity(className, EntityType.CLASS);

        SimpleJavaParser.TypeTypeContext extendClass = ctx.typeType();
        List<SimpleJavaParser.TypeTypeContext> imlementClassList = ctx.typeList() != null ? ctx.typeList().typeType() : null;

        if (extendClass != null)
            currentEntity.setExtendClass(extendClass.getText());
        if (imlementClassList != null)
            for (SimpleJavaParser.TypeTypeContext implementClass : imlementClassList) {
                currentEntity.setImplementClass(implementClass.getText());
            }

        //reset and store current method id
        currentMethodIDStack.push(methodID);
        methodID = 0;

    }

    public void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        //restore previous state of methodID
        methodID = currentMethodIDStack.pop();
    }

    public void enterConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx) {
        String currentMethodName = ctx.IDENTIFIER().getText();
        String returnType = "void";
        List<String> parameters = getFormalParamateres(ctx.formalParameters());
        methodID++;

        currentMethodIDStack.push(methodID);
        currentEntity.setMethod(currentMethodName, parameters, returnType, true);
    }

    public void enterMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx) {
        String currentMethodName = ctx.IDENTIFIER().getText();
        String returnType = ctx.typeTypeOrVoid().getText();
        List<String> parameters = getFormalParamateres(ctx.formalParameters());
        methodID++;

        currentMethodIDStack.push(methodID);
        currentEntity.setMethod(currentMethodName, parameters, returnType, false);
    }

    public void exitConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx) {
        currentMethodIDStack.pop();
    }

    public void exitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx) {
        currentMethodIDStack.pop();
    }

    public void exitMethodCall(SimpleJavaParser.MethodCallContext ctx) {
        Integer currentMethodID = currentMethodIDStack.lastElement();
        if (currentMethodID == null) return;

        TerminalNode identifier = ctx.IDENTIFIER();
        if (identifier != null)
            currentEntity.setMethodCallee(currentMethodID, identifier.getText());
    }

    public void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx) {
        SimpleJavaParser.ClassBodyDeclarationContext bodyDeclarationContext = (SimpleJavaParser.ClassBodyDeclarationContext) ctx.getParent().getParent();

        String fieldModifier = bodyDeclarationContext.modifier().size() != 0 ? bodyDeclarationContext.modifier().get(0).getText() : "public"; //default value in java is public
        String fiedType = ctx.typeType().getText();
        List<SimpleJavaParser.VariableDeclaratorContext> variablesContext = ctx.variableDeclarators().variableDeclarator();

        for (SimpleJavaParser.VariableDeclaratorContext variableDeclaratorContext : variablesContext) {
            currentEntity.setAttribute(variableDeclaratorContext.variableDeclaratorId().IDENTIFIER().getText(), fieldModifier, fiedType);
        }

    }

    private List<String> getFormalParamateres(SimpleJavaParser.FormalParametersContext ctx) {
        List<SimpleJavaParser.FormalParameterContext> parametersContexts = ctx.formalParameterList() != null ? ctx.formalParameterList().formalParameter() : null;
        if (parametersContexts == null) return null;

        List<String> parameters = new ArrayList<>();
        for (SimpleJavaParser.FormalParameterContext parameterContext : parametersContexts) {
            parameters.add(parameterContext.typeType().getText() + " " + parameterContext.variableDeclaratorId().IDENTIFIER().getText());
        }

        return parameters;
    }

    @Override
    public String getSourceInfoToJson() {
        return GlobalGson.getInstance().toJson(sourceEntities.values());
    }
}
