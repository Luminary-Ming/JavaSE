package com.neuedu.project.solar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * ��������ͼƬ��������̬��Դ
 */
public final class ImageUtil {
    private ImageUtil() {
    }

    public static Image getImage(String imgName) {
        // ʹ�� BufferedImage
        BufferedImage img = null;
        try {
            URL url = ImageUtil.class.getClassLoader().getResource(Constant.IMG_PATH_PRE + imgName);
            // url ����Ϊ null ���Ҫд�쳣
            img = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return img;
    }
}
