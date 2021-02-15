package com.zone24x7.rac.dataextractionservice.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    private JsonUtils() {
        // Utility constructor
    }      /**
     * Converts an object to json
     *
     * @param cls Object of POJO class type
     * @return JsonNode for the object
     */
    public static <T> JsonNode toJson(T cls) {
        return objectMapper.valueToTree(cls);
    }
}
