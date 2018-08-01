package com.jhkj.weapp.common.util;

import com.jhkj.weapp.common.entity.transfer.UserDTO;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class PojoUtilsTest {

    @Test
    public void checkRequiredParameters() {
        UserDTO userDTO = new UserDTO();
        List<String> result = PojoUtils.checkRequiredParameters(userDTO);
        assertEquals("用户昵称", result.get(0));
        assertEquals("用户头像地址", result.get(1));
    }
    
}