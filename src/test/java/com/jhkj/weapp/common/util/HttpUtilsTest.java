package com.jhkj.weapp.common.util;

import com.jhkj.weapp.common.entity.ApiResponse;
import com.jhkj.weapp.common.entity.transfer.UploadDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class HttpUtilsTest {

    @Test
    public void post() {
        String url = "https://wxupload.jinghangkuajing.com/api/confirm";
        UploadDTO requestBody = new UploadDTO();
        requestBody.setCaller("test");
        requestBody.setSecret("test");
        List<String> files = new ArrayList<>();
        files.add("test");
        requestBody.setOriginalFiles(files);
        String response = HttpUtils.post(url, JsonUtils.beanToJson(requestBody));
        ApiResponse responseBody = JsonUtils.jsonToBean(response, ApiResponse.class);
        assertEquals(4001, responseBody.getCode());
        assertEquals("missing parameters", responseBody.getMessage());
    }

}