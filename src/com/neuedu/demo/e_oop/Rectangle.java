package com.neuedu.demo.e_oop;

public class Rectangle {
    /**
     * 宽度
     */
    int width;
    /**
     * 高度
     */
    int height;
    /**
     * 矩形的中心点
     */
    Point center;

    public Rectangle(int width, int height, Point center) {
        this.width = width;
        this.height = height;
        this.center = center;
    }

    public static void main(String[] args) {
        // 一个矩形的中心点、宽度、高度
        Point center1 = new Point(10, 20);
        Rectangle rectangle1 = new Rectangle(10, 5, center1);
        // 另一个矩形的中心点、宽度、高度
        Point center2 = new Point(20, 10);
        Rectangle rectangle2 = new Rectangle(15, 10, center2);
        // 两个矩形之间的关系
        System.out.println(rectangle1.contains(rectangle2));  // 两个矩形相离
    }

    /**
     * 判断两个矩形之间的关系
     * @param anotherRectangle 另一个矩形
     * @return "两个矩形相交" 或者 "两个矩形相离";
     */
    public String contains(Rectangle anotherRectangle) {
        return Math.abs(this.center.x) + Math.abs(anotherRectangle.center.x) <= this.width + anotherRectangle.width
                && Math.abs(this.center.y) + Math.abs(anotherRectangle.center.y) <= this.height + anotherRectangle.height
                ? "两个矩形相交" : "两个矩形相离";
    }

}
/*
    算法;
    假设两矩形的宽高分别是 w1，h1，w2，h2。
    分别计算两个矩形的中心点 O1，O2，以及 O1 和 O2 之间的水平距离（w）和竖直距离（h）。
    若 w < ( w1 + w2 ) / 2 且 h < ( h1 + h2 ) / 2，则两个矩形相交，否则不相交。
 */