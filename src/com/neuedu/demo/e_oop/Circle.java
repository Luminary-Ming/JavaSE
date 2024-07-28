package com.neuedu.demo.e_oop;


/**
 * Circle 继承父类 Shape
 */
public class Circle extends Shape {

    /**
     * 半径
     */
    int r;

    public Circle() {
    }

    public Circle(Point center, int r) {
        super(center);
        this.r = r;
    }

    public static void main(String[] args) {
        // 一个圆
        Point center1 = new Point(0, 0);
        Circle c1 = new Circle(center1, 10);
        // 另一个圆
        Point center2 = new Point(20, 0);
        Circle c2 = new Circle(center2, 10);

        // 任意一点与圆的关系
        Point point = new Point(10, 0);
        System.out.println(c1.contains(point));  // 包含
        // 两圆关系
        System.out.println(c1.intersects(c2));  // 两圆相交
        // 面积
        System.out.println(c1.getArea());  // 314.16
        // 周长
        System.out.println(c1.getCircumference());  // 62.83
    }

    /**
     * 判断这个点与圆的关系
     *
     * @param point 一个点
     * @return “包含”或者“不包含”
     */
    public String contains(Point point) {
        return this.point.getDistance(point) <= this.r ? "包含" : "不包含";
    }

    /**
     * 判断两圆的关系
     *
     * @param anotherCircle 另一个圆
     * @return "两圆相交" 或者 "两圆相离"
     */
    public String intersects(Circle anotherCircle) {
        return this.point.getDistance(anotherCircle.point) <= this.r + anotherCircle.r ? "两圆相交" : "两圆相离";
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(this.r, 2) * 100.0) / 100.0;
    }

    @Override
    public double getCircumference() {
        return Math.round(Math.PI * this.r * 2 * 100.0) / 100.0;
    }
}
