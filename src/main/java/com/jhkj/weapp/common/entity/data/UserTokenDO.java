package com.jhkj.weapp.common.entity.data;

import com.jhkj.weapp.common.util.HashUtils;
import com.jhkj.weapp.common.util.StringUtils;
import lombok.Data;

import java.util.UUID;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class UserTokenDO {

    private Long id;

    private String token;

    private String sessionKey;

    public UserTokenDO(Long id, String sessionKey) {
        this(id, HashUtils.computeMd5(UUID.randomUUID().toString()), sessionKey);
    }

    public UserTokenDO(Long id, String token, String sessionKey) {
        this.id = id;
        this.token = token;
        this.sessionKey = sessionKey;
    }

    public String toClientString() {
        return id + "#" + token;
    }

    public String toServerString() {
        return token + "#" + sessionKey;
    }

    public static UserTokenDO fromClientString(String text) {
        String[] data = text.split("#");
        if (data.length != 2) {
            return null;
        }
        return new UserTokenDO(Long.valueOf(data[0]), data[1], "");
    }

    public static UserTokenDO fromServerString(Long id, String text) {
        if (StringUtils.isNullOrEmpty(text)) {
            return null;
        }
        String[] data = text.split("#");
        if (data.length != 2) {
            return null;
        }
        return new UserTokenDO(id, data[0], data[1]);
    }

}
