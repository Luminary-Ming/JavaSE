package com.neuedu.project.solar;

import java.awt.*;

/**
 * 太阳系中的所有物体都必须绘制在界面上
 */
public interface IDrawable {
    /**
     * 绘制的方法
     */
    void draw(Graphics g,int width,int height);

}
