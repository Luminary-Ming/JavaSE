package com.neuedu.project.solar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来处理图片或其他静态资源
 */
public final class ImageUtil {
    private ImageUtil() {
    }

    public static Map<String, Image> imgMap = new HashMap<>();

    static {
        imgMap.put("bg", ImageUtil.getImage("bg.v1.0.png"));
        imgMap.put("smallPlanet", ImageUtil.getImage("smallPlanet.png"));
        imgMap.put("Sun", ImageUtil.getImage("Sun.v1.0.png"));
        imgMap.put("Mercury", ImageUtil.getImage("Mercury.v1.0.png"));
        imgMap.put("Venus", ImageUtil.getImage("Venus.v1.0.png"));
        imgMap.put("Earth", ImageUtil.getImage("Earth.v1.0.png"));
        imgMap.put("Moon", ImageUtil.getImage("moon.png"));
        imgMap.put("Mars", ImageUtil.getImage("Mars.v1.0.png"));
        imgMap.put("Jupiter", ImageUtil.getImage("Jupiter.v1.0.png"));
        imgMap.put("Saturn", ImageUtil.getImage("Saturn.v1.0.png"));
        imgMap.put("Uranus", ImageUtil.getImage("Uranus.v1.0.png"));
        imgMap.put("Neptune", ImageUtil.getImage("neptune.v1.0.png"));

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
