package com.neuedu.homework.$2024_07_26.shape;

public class Circle extends Shape {

    /**
     * 圆的半径
     */
    double radius;

    public Circle() {
    }

    /**
     * @param area   圆的面积
     * @param per    圆的周长
     * @param color  圆的颜色
     * @param radius 圆的半径
     */
    public Circle(double area, double per, String color, double radius) {
        super(area, per, color);
        this.radius = radius;
    }

    /**
     * @param color  圆的颜色
     * @param radius 圆的半径
     */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     *
     * @return 圆的面积
     */
    @Override
    double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    /**
     * 计算圆的周长
     *
     * @return 圆的周长
     */
    @Override
    double getPer() {
        return Math.round((2 * Math.PI * radius) * 100.0) / 100.0;
    }

    /**
     * 输出圆的信息
     */
    @Override
    void showAll() {
        System.out.println("圆的颜色：" + getColor() + "，圆的面积：" + getArea() + "，圆的周长：" + getPer());
    }


}
