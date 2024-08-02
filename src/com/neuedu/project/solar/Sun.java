package com.neuedu.project.solar;

public class Sun extends AbstractSolarObject {


    public Sun() {
    }

    public Sun(int x, int y, String key) {
        this(key);
        this.x = x;
        this.y = y;
    }

    public Sun(String key) {
        this.img = ImageUtil.imgMap.get(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.x = Constant.WINDOW_WIDTH / 2 - this.width / 2;
        this.y = Constant.WINDOW_HEIGHT / 2 - this.height / 2;
    }
}
