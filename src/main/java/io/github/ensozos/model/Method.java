package io.github.ensozos.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Method {
    private String name;
    private String returnType;
    private List<String> parameters;
    private boolean isConstructor;
    private Set<String> calls;


    private Method() {
    }

    public void setCallee(String calleeMethod) {
        this.calls.add(calleeMethod);
    }

    public static class MethodBuilder {

        /**
         * The name of the method.
         */
        private String name;

        /**
         * The return type of the method.
         */
        private String returnType;

        /**
         * The list into which all parameters of the method (if exist) are stored.
         */
        private List<String> parameters;

        /**
         * Indicates if method is constructor.
         */
        private boolean isConstructor;

        /**
         * The set into which all callee methods of the caller method are stored.
         */
        private Set<String> calls;

        /**
         * Constructs a method with the given name.
         *
         * @param name the name of the mehtod.
         */
        public MethodBuilder(String name) {
            this.name = name;
            this.calls = new HashSet<>();

        }

        /**
         * Set the return type of the mehtod
         *
         * @param returnType the return type of the method
         * @return MethodBuilder
         */
        public MethodBuilder withReturnType(String returnType) {
            this.returnType = returnType;

            return this;
        }

        /**
         * Set the constructor indicator for the method.
         *
         * @param isConstructor boolean value that indicates if the method is constructor
         * @return MethodBuilder
         */
        public MethodBuilder isConstructor(boolean isConstructor) {
            this.isConstructor = isConstructor;

            return this;
        }

        /**
         * Set the parameters of the method.
         *
         * @param parameters the list with all parameters of the method
         * @return MethodBuilder
         */
        public MethodBuilder withParameters(List<String> parameters) {
            this.parameters = parameters;

            return this;
        }

        /**
         * Set the name of the callee method
         *
         * @param callee the name of the callee mehtod
         * @return MethodBuilder
         */
        public MethodBuilder setCall(String callee) {
            this.calls.add(callee);

            return this;
        }

        /**
         * Creates a Method instance based on the current configuration.
         *
         * @return an instance of Method configured with the options currently set in this builder
         */
        public Method build() {
            Method method = new Method();
            method.name = this.name;
            method.parameters = this.parameters;
            method.returnType = this.returnType;
            method.isConstructor = this.isConstructor;
            method.calls = this.calls;

            return method;
        }

    }

}
