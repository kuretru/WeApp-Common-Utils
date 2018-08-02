package com.jhkj.weapp.common.entity.transfer;

import lombok.Data;

import java.util.List;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class UploadDTO {

    private String caller;

    private String secret;

    private List<String> originalFiles;

}
