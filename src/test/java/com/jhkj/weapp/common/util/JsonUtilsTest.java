package com.jhkj.weapp.common.util;

import com.jhkj.weapp.common.entity.view.OptionDivisionVO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class JsonUtilsTest {

    private String correct = "{\"id\":1,\"name\":\"test\"}";

    @Test
    public void beanToJson() {
        OptionDivisionVO optionDivisionVO = new OptionDivisionVO();
        optionDivisionVO.setId(1);
        optionDivisionVO.setName("test");
        String result = JsonUtils.beanToJson(optionDivisionVO);
        assertEquals(correct, result);
    }

    @Test
    public void jsonToBean() {
        OptionDivisionVO optionDivisionVO = new OptionDivisionVO();
        optionDivisionVO.setId(1);
        optionDivisionVO.setName("test");
        OptionDivisionVO result = JsonUtils.jsonToBean(correct, OptionDivisionVO.class);
        assertEquals(optionDivisionVO, result);
    }

}