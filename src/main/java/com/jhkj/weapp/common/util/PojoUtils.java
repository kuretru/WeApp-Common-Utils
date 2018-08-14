package com.jhkj.weapp.common.util;

import com.jhkj.weapp.common.entity.data.OptionDO;
import io.swagger.annotations.ApiModelProperty;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class PojoUtils {

    public static List<String> checkRequiredParameters(Object object) {
        List<String> result = new ArrayList<>();
        for (Field field : object.getClass().getDeclaredFields()) {
            ApiModelProperty apiModelProperty = field.getAnnotation(ApiModelProperty.class);
            if (!apiModelProperty.required()) {
                continue;
            }
            field.setAccessible(true);
            try {
                if (field.get(object) == null) {
                    result.add(apiModelProperty.value());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static Map<String, String> optionsListToMap(List<OptionDO> options) {
        Map<String, String> result = new HashMap<>(16);
        for (OptionDO optionDO : options) {
            result.put(optionDO.getKey(), optionDO.getValue());
        }
        return result;
    }

}
