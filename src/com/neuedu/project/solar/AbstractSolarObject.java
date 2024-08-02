package com.neuedu.project.solar;

import java.awt.*;

public abstract class AbstractSolarObject implements IMoveable, IDrawable {
    /**
     * 坐标
     */
    public int x;
    public int y;

    /**
     * 图片
     */
    public Image img;

    /**
     * 宽度和高度
     */
    public int width;
    public int height;

    /**
     * 旋转中心
     */
    public AbstractSolarObject center;


    public void move() {

    }

    /**
     * 绘制界面
     * @param g 画笔
     */
    public void draw(Graphics g) {
        g.drawImage(img, x, y, null);
    }
}