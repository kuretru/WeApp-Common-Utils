package com.jhkj.weapp.common.entity.data;

import com.jhkj.weapp.common.entity.transfer.UserDTO;
import com.jhkj.weapp.common.entity.view.UserVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDO extends BaseDO {

    private String openId;

    private String unionId;

    private Instant lastLogin;

    private String nickName;

    private String avatarUrl;

    private Integer gender;

    private String city;

    private String province;

    private String country;

    private String language;

    public UserVO toVO() {
        UserVO result = new UserVO();
        result.setId(id);
        result.setNickName(nickName);
        result.setAvatarUrl(avatarUrl);
        result.setGender(gender);
        result.setLastLogin(lastLogin);
        result.setCity(city);
        result.setProvince(province);
        result.setCountry(country);
        result.setLanguage(language);
        return result;
    }

    public static UserDO fromDTO(long userId, UserDTO dto) {
        if (dto == null) {
            return null;
        }
        UserDO result = new UserDO();
        result.setId(userId);
        result.setNickName(dto.getNickName());
        result.setAvatarUrl(dto.getAvatarUrl());
        result.setGender(dto.getGender());
        result.setCity(dto.getCity());
        result.setProvince(dto.getProvince());
        result.setCountry(dto.getCountry());
        result.setLanguage(dto.getLanguage());
        return result;
    }

}
