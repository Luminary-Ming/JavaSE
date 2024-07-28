package com.neuedu.demo.e_oop;

public class InstanceofTest {
    public static void main(String[] args) {
        /**
         * instanceof 运算符  返回 boolean 的数据类型
         * 1. 判断一个类是否实现了某个接口
         * 2. 判断一个实例对象是否属于此类或者父类
         */

        Shape shape = new Shape();
        Circle circle = new Circle();
        // 赋值多态
        Shape circle1 = new Circle();
        Dog dog = new Dog();

        // 返回 true
        if (shape instanceof Shape) {
        }
        // 返回 true
        if (circle instanceof Circle) {
        }
        // 返回 true
        if (circle instanceof Shape) {
        }

        // 会报编译错误
        // if(dog instanceof Shape){}

    }
}
