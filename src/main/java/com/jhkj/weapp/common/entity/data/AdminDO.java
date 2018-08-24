package com.jhkj.weapp.common.entity.data;

import com.jhkj.weapp.common.entity.transfer.AdminInsertDTO;
import com.jhkj.weapp.common.entity.transfer.AdminUpdateDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

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

    public AdminDO(@NonNull AdminInsertDTO dto) {
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.nickName = dto.getNickName();
        this.level = dto.getLevel() == null ? 0 : dto.getLevel();
    }

    public AdminDO(long id, @NonNull AdminUpdateDTO dto) {
        this.id = id;
        this.username = dto.getUsername();
        this.nickName = dto.getNickName();
        this.level = dto.getLevel() == null ? 0 : dto.getLevel();
    }

    public AdminDO() {
        super();
    }

}
