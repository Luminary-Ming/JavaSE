package com.neuedu.demo.e_oop;

public class Point {
    /**
     * 横坐标
     * 声明该类型具有的属性：成员变量 field ，从属于类
     */
    int x;  // 对象的默认值与数组相同，int类型默认值为0
    /**
     * 纵坐标
     */
    int y;

    /**
     * @param x 横坐标
     * @param y 纵坐标
     */

    public Point(int x, int y) {
        // this 指代当前类的对象
        this.x = x;
        this.y = y;
    }


    public static void main(String[] args) {
        // 创建 Point 的对象
        Point p1 = new Point(0, 0);
        System.out.println("(" + p1.x + "," + p1.y + ")");  // (0,0)
        Point p2 = new Point(10, 10);
        System.out.println("(" + p2.x + "," + p2.y + ")");  // (10,10)
        // p1点 到 p2点的距离
        System.out.println(p1.getDistance(p2));  // 14.14
        // p2点 到 原点的距离
        System.out.println(p2.getDistance());  // 14.14
    }

    /**
     * @param anotherPoint 另一个点
     * @return 任意两点间的距离
     */
    public double getDistance(Point anotherPoint) {
        return Math.round(Math.sqrt(Math.pow(this.x - anotherPoint.x, 2) + Math.pow(this.y - anotherPoint.y, 2)) * 100.0) / 100.0;
    }

    /**
     * @return 一个点到原点的距离
     */
    public double getDistance() {
        return Math.round(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)) * 100.0) / 100.0;
    }
}
