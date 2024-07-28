package com.neuedu.homework.$2024_07_26.shape;

/**
 * 07. 面向对象高级特效课后编程题
 * 03.设计四个类，分别是：
 * （1）Shape表示图形类，有面积属性 area、周长属性per，颜色属性color，有两个构造方法（一个是默认的、一个是为颜色赋值的），
 * 还有3个抽象方法，分别是：getArea 计算面积、getPer 计算周长、showAll 输出所有信息，还有一个求颜色的方法 getColor。
 * （2）2个子类：
 * (1) Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，
 * 另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
 * (2) Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，
 * 另外又增加两个构造方法（为半径、颜色赋值的）。
 * (3) 一个测试类PolyDemo，在main方法中，声明创建每个子类的对象，并调用2个子类的showAll方法。
 */

public abstract class Shape {

    /**
     * 图形的面积
     */
    double area;

    /**
     * 图形的周长
     */
    double per;

    /**
     * 图形的颜色
     */
    private String color;

    /**
     * 无参构造
     */
    public Shape() {
    }

    /**
     * @param area  图形的面积
     * @param per   图形的周长
     * @param color 图形的颜色
     */
    public Shape(double area, double per, String color) {
        this.area = area;
        this.per = per;
        this.color = color;
    }

    /**
     * 为图形的颜色赋值
     *
     * @param color 图形的颜色
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * 计算面积的抽象方法
     *
     * @return 图形面积
     */
    abstract double getArea();

    /**
     * 计算周长的抽象方法
     *
     * @return 图形周长
     */
    abstract double getPer();

    /**
     * 输出图形所有信息的抽象方法
     */
    abstract void showAll();

    /**
     * 获得图形颜色
     *
     * @return 图形颜色
     */
    public String getColor() {
        return color;
    }

}
