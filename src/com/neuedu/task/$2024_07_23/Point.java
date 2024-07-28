package com.neuedu.task.$2024_07_23;

/**
 * 四级项目6
 * 01. 定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，2个构造器Point()和Point(int x0,y0),
 * 以及一个movePoint（int dx,int dy）方法实现点的位置移动。编写一个程序，创建两个Point对象p1、p2，
 * 分别调研movePoint方法后，打印p1和p2的坐标。
 */
public class Point {
    /**
     * 横坐标
     */
    int x;
    /**
     * 纵坐标
     */
    int y;

    public Point() {
    }

    public Point(int x0, int y0) {
        this.x = x0;
        this.y = y0;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 6);
        p1.movePoint(-3, -2);  // (2,4)
        Point p2 = new Point(3,5);
        p2.movePoint(-1,-4);  // (2,1)
    }

    public void movePoint(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("(" + x + "," + y + ")");
    }
}
