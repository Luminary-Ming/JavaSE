package com.neuedu.project.solar;

import java.awt.*;

public abstract class AbstractSolarObject implements IMoveable, IDrawable {

    public int x;
    public int y;

    public Image img;

    public int width;
    public int height;
    /**
     * 旋转中心
     */
    public AbstractSolarObject center;

    public void move() {

    }

    public void draw(Graphics g, int width, int height) {
        g.drawImage(img, x, y, width, height, null);
    }

    public void draw(Graphics g) {
        g.drawImage(img, x, y, null);
    }

}
