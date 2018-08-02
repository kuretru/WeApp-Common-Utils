package com.jhkj.weapp.common.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.MediaType;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class HttpUtils {

    public static String post(String url, String requestBody) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        httpPost.setEntity(new StringEntity(requestBody, Charset.forName("UTF-8")));
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity == null) {
                return null;
            }
            InputStream inputStream = httpEntity.getContent();
            return new Scanner(inputStream).useDelimiter("\\Z").next();
        } catch (Exception e) {
            return null;
        }
    }

}
