package com.neuedu.project.solar;

public class Background extends AbstractSolarObject {

    public Background() {
        this.x = 0;
        this.y = 0;
    }

    public Background(String imgName, int width, int height) {
        this.img = ImageUtil.getImage(imgName);
        this.width = width;
        this.height = height;
    }
}
