package com.neuedu.project.solar;

/**
 * 背景
 */
public class Background extends AbstractSolarObject {

    public Background() {
        this.x = 0;
        this.y = 0;
    }

    public Background(String key) {
        this.img = ImageUtil.imgMap.get(key);
        this.width = Constant.WINDOW_WIDTH;
        this.height = Constant.WINDOW_HEIGHT;
    }
}
