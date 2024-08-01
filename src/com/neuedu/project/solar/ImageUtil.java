package com.neuedu.project.solar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * 用来处理图片或其他静态资源
 */
public final class ImageUtil {
    private ImageUtil() {
    }

    public static Image getImage(String imgName) {
        // 使用 BufferedImage
        BufferedImage img = null;
        try {
            URL url = ImageUtil.class.getClassLoader().getResource(Constant.IMG_PATH_PRE + imgName);
            // url 可能为 null 因此要写异常
            img = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return img;
    }
}
