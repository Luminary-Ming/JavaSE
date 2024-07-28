package com.neuedu.demo.e_oop;

/**
 * 父类
 */
public class Shape {
    /**
     * 点
     */
    Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    /**
     * 图形的面积
     *
     * @return 默认值0.0
     */
    public double getArea() {
        return 0.0;
    }

    /**
     * 图形的周长
     *
     * @return 默认值0.0
     */
    public double getCircumference() {
        return 0.0;
    }
}
