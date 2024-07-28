package com.neuedu.homework.$2024_07_26.shape;

/**
 * 测试类
 */
public class PolyDemo {
    public static void main(String[] args) {
        // 创建一个圆的对象
        Shape circle = new Circle("樱花粉",4);
        // 创建一个矩形的对象
        Shape rectangle = new Rectangle("星辰蓝",5,8);
        // 调用 showAll() 打印信息
        circle.showAll();     // 圆的颜色：樱花粉，圆的面积：50.27，圆的周长：25.13
        rectangle.showAll();  // 矩形的颜色：星辰蓝，矩形的面积：40.0，矩形的周长：26.0
    }
}
