package com.neuedu.homework.$2024_07_26.shape;

public class Rectangle extends Shape {

    /**
     * 矩形的宽
     */
    double width;

    /**
     * 矩形的高
     */
    double height;

    public Rectangle() {
    }

    /**
     * @param area   矩形的面积
     * @param per    矩形的周长
     * @param color  矩形的颜色
     * @param width  矩形的宽度
     * @param height 矩形的高度
     */
    public Rectangle(double area, double per, String color, double width, double height) {
        super(area, per, color);
        this.width = width;
        this.height = height;
    }

    /**
     * @param color  矩形的颜色
     * @param width  矩形的宽度
     * @param height 矩形的高度
     */
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * 计算矩形的面积
     *
     * @return 矩形的面积
     */
    @Override
    double getArea() {
        return width * height;
    }

    /**
     * 计算矩形的周长
     *
     * @return 矩形的周长
     */
    @Override
    double getPer() {
        return 2 * (width + height);
    }

    /**
     * 输出矩形的信息
     */
    @Override
    void showAll() {
        System.out.println("矩形的颜色：" + getColor() + "，矩形的面积：" + getArea() + "，矩形的周长：" + getPer());
    }
}
