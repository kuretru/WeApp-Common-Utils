package com.jhkj.weapp.common.entity.data;

import com.jhkj.weapp.common.entity.transfer.AdminDTO;
import com.jhkj.weapp.common.entity.transfer.AdminUpdateDTO;
import com.jhkj.weapp.common.entity.view.AdminVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdminDO extends BaseDO {

    private String username;

    private String password;

    private String salt;

    private String nickName;

    private Integer level;

    private Instant lastLogin;

    public AdminVO toVO() {
        AdminVO result = new AdminVO();
        result.setId(id);
        result.setNickName(nickName);
        result.setLevel(level);
        result.setLastLogin(lastLogin);
        return result;
    }

    public static AdminDO fromDTO(AdminDTO dto) {
        if (dto == null) {
            return null;
        }
        AdminDO result = new AdminDO();
        result.setUsername(dto.getUsername());
        result.setPassword(dto.getPassword());
        result.setNickName(dto.getNickName());
        result.setLevel(dto.getLevel() == null ? 0 : dto.getLevel());
        return result;
    }

    public static AdminDO fromUpdateDTO(AdminUpdateDTO dto) {
        if (dto == null) {
            return null;
        }
        AdminDO result = new AdminDO();
        result.setUsername(dto.getUsername());
        result.setNickName(dto.getNickName());
        result.setLevel(dto.getLevel() == null ? 0 : dto.getLevel());
        return result;
    }

}
