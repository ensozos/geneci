package io.github.ensozos.model;

public class Attribute {

    /**
     * The name of the attribute.
     */
    private String name;

    /**
     * The visibility of the attribute.
     */
    private String visibility;

    /**
     * The type of the attribute.
     */
    private String type;

    /**
     * Constructs an attribute with the given name.
     *
     * @param name the name of the attribute
     */
    public Attribute(String name) {
        this.name = name;
    }

    /**
     * Set visibily of the attribute.
     *
     * @param visibility the visibility the attribute
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * Set type of the attibute.
     *
     * @param type the type of the attribute
     */
    public void setType(String type) {
        this.type = type;
    }

}
