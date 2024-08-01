package com.neuedu.project.solar;

public class Sun extends AbstractSolarObject {


    public Sun() {
    }

   /* public Sun(int x, int y, String imgName) {
        this(imgName);
        this.x = x;
        this.y = y;
    }*/

    public Sun(String imgName,int width,int height) {
        this.img = ImageUtil.getImage(imgName);
        this.width = width;
        this.height = height;
        this.x = Constant.WINDOW_WIDTH / 2 - this.width / 2;
        this.y = Constant.WINDOW_HEIGHT / 2 - this.height / 2;
    }
}
