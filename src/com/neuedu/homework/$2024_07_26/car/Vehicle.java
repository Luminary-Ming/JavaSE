package com.neuedu.homework.$2024_07_26.car;

/**
 * 07. 面向对象高级特效课后编程题
 * 02.（1）定义一个汽车类Vehicle，要求如下：
 * （a）属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。
 * （b）至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
 * （c）为属性提供访问器方法。
 * （d）定义一个一般方法run()，用打印语句描述汽车奔跑的功能
 * 定义测试类VehicleTest，在其main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
 * （2）定义一个Vehicle类的子类轿车类Car，要求如下：
 * （a）轿车有自己的属性载人数 loader（int 类型）。
 * （b）提供该类初始化属性的构造方法。
 * （c）重新定义run()，用打印语句描述轿车奔跑的功能。
 * （d）定义测试类Test，在其main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
 */
public class Vehicle {
    /**
     * 汽车品牌
     */
    private String brand;

    /**
     * 汽车颜色
     */
    private String color;

    /**
     * 汽车的速度
     */
    private double speed;

    public Vehicle() {
    }

    /**
     * @param brand 汽车品牌
     * @param color 汽车颜色
     */
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0.0;
    }

    // 子类重写父类方法
    public void run() {
        System.out.println("颜色为" + getColor() + "的" + getBrand() + "汽车正在赛道上飞驰！" );
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
