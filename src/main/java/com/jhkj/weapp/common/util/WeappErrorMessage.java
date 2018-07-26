package com.jhkj.weapp.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class WeappErrorMessage {

    private static Map<Integer, String> data;

    static {
        data = new HashMap<>();
        data.put(40029, "临时登录凭证(code)。");
        data.put(40013, "AppID(小程序ID)不匹配。");
        data.put(40125, "AppSecret(小程序密钥)失效。");
    }

    public static String getMessage(int code) {
        if (data.containsKey(code)) {
            return data.get(code);
        }
        return null;
    }

}
