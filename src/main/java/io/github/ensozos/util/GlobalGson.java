package io.github.ensozos.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.ensozos.model.Entity;

public class GlobalGson {

    private static GlobalGson globalGsonInstance;
    private Gson gson;

    /**
     * Default constructor that initialize Gson
     */
    public GlobalGson() {
        setGson();

    }

    /**
     * Creata instance of Singleton GlobalGson class
     * @return GlobalGson
     */
    public static GlobalGson getInstance() {
        if (globalGsonInstance == null) {
            globalGsonInstance = new GlobalGson();
        }

        return globalGsonInstance;
    }

    /**
     * Get json representation of object
     * @param object the object you want to get json representation
     * @return json as String
     */
    public String toJson(Object object) {
        return gson.toJson(object);
    }

    /**
     * Initialize Gson object
     */
    private void setGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gson = gsonBuilder
                .serializeNulls()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
    }

}
