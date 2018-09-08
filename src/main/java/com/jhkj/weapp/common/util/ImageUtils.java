package com.jhkj.weapp.common.util;

import org.springframework.util.Base64Utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
public class ImageUtils {

    public static String BASE64_IMAGE_PREFIX = "data:image/png;base64,";

    /**
     * 将图片转为base64格式
     *
     * @param image 原图片
     * @return base64格式的图片
     */
    public static String toBase64(BufferedImage image) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", outputStream);
            String base64 = Base64Utils.encodeToString(outputStream.toByteArray());
            outputStream.close();
            return BASE64_IMAGE_PREFIX + base64;
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
