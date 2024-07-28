package com.neuedu.homework.$2024_07_23;

/**
 * 06. 面向对象基础课后编程题
 * 01. 创建一个Circle类，此类中包括一个半径属性radius和一个计算面积的方法findArea。
 * 在main方法中创建Circle类的对象c，并计算半径为5的圆的面积。
 */
public class Circle {
    /**
     * 半径
     */
    double radius;

    /**
     * 构造方法
     *
     * @param radius 半径
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("半径为：" + circle.radius + "\t" + "该圆的面积是：" + circle.findArea()); // 半径为：2.0	 该圆的面积是：12.566370614359172
    }

    /**
     * 计算圆的面积
     *
     * @return 面积
     */
    public double findArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
