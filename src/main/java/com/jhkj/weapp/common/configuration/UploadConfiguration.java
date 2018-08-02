package com.jhkj.weapp.common.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
@Configuration
@ConfigurationProperties("com.jhkj.weapp.upload")
public class UploadConfiguration {

    private String url;

    private String caller;

    private String secret;

}
