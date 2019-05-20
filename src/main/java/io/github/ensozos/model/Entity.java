package io.github.ensozos.model;


import java.util.*;

public class Entity {

    /**
     * The name of the entity.
     */
    private String entityName;

    /**
     * The type of the entity defined enum EntityType
     */
    private EntityType entityType;

    /**
     * The list into which the names of the classes that
     * entity extends are stored.
     */
    private List<String> extendClass;

    /**
     * The list into which the names of the interfaces that
     * entity impliments are stored.
     */
    private List<String> implementClass;

    /**
     * The list with names of inner entities.
     */
    private List<String> innerEntity;

    /**
     * The list into which methods are stored.
     */
    private List<Method> methods;

    /**
     * The list into which attributes are stored.
     */
    private List<Attribute> attributes;

    /**
     * Constructs an empty entity with the specified entity name and
     * entity type (i.e Class/Interface/etc.).
     *
     * @param entityName the name of the entity
     * @param entityType the type of the entity
     */
    public Entity(String entityName, EntityType entityType) {
        this.entityName = entityName;
        this.entityType = entityType;

        extendClass = new ArrayList<>();
        implementClass = new ArrayList<>();
        innerEntity = new ArrayList<>();
        attributes = new ArrayList<>();
        methods = new ArrayList<>();
    }

    /**
     * Get the entity name.
     *
     * @return Entity Name
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * Set inner Entities of the current entity.
     * Inner entities can be Class, Interface etc.
     *
     * @param innerEntityName the name of the inner entity
     */
    public void setInnerEntity(String innerEntityName) {
        this.innerEntity.add(innerEntityName);
    }

    /**
     * Set the parent name of entity.
     *
     * @param className The name of the class that entity extends to.
     */
    public void setExtendClass(String className) {
        this.extendClass.add(className);
    }

    /**
     * Set the name of interface that entity impliments.
     *
     * @param className the name of interface
     */
    public void setImplementClass(String className) {
        this.implementClass.add(className);
    }

    /**
     * Set method call given the caller method id (i.e the index in method list)
     * and the callee method name. This method assumes that the caller method
     * id exists in the collection
     *
     * @param callerMethodID   the caller method id
     * @param calleeMethodName the callee method name
     */
    public void setMethodCallee(int callerMethodID, String calleeMethodName) {
        this.methods.get(callerMethodID - 1).setCallee(calleeMethodName);
    }

    /**
     * Set attribute of current entity. You need to specify the name of
     * the attribute, modifier (i.e privite/public/etc.) and attribute type
     * (i.e String/Int/etc.)
     *
     * @param attributeName     name of attribute
     * @param attributeModifier modifier of attribute
     * @param attributeType     type of attribute
     */
    public void setAttribute(String attributeName, String attributeModifier, String attributeType) {
        Attribute attribute = new Attribute(attributeName);
        attribute.setVisibility(attributeModifier);
        attribute.setType(attributeType);

        this.attributes.add(attribute);
    }

    /**
     * Set method of entity. If there are no method parameters you
     * need to pass a null value as params.
     *
     * @param methodName    the method name
     * @param params        List with the method parameters
     * @param returnType    the return type of the method
     * @param isConstructor indicates if the method is constructor
     */
    public void setMethod(String methodName, List<String> params, String returnType, boolean isConstructor) {
        Method method = new Method.MethodBuilder(methodName)
                .withParameters(params)
                .withReturnType(returnType)
                .isConstructor(isConstructor)
                .build();

        this.methods.add(method);
    }

}
