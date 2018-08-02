package com.jhkj.weapp.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class JsonUtils {

    public static String beanToJson(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T jsonToBean(String json, Class<T> beanType) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, beanType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
