package com.neuedu.zany;

/**
 * 静态变量：从属于类，被类的所有对象共享
 */
public class ClassDemo {
    // 静态变量 从属于类，被类的所有对象共享
    public static int sum = 1;

    public ClassDemo() {
        sum = sum + 5;
    }
}

class ClassDemoTest {
    public static void main(String[] args) {
        // 每次用 new 创建对象都会调用一次构造方法
        ClassDemo demo1 = new ClassDemo();
        // 第二次调用构造方法
        ClassDemo demo2 = new ClassDemo();
        System.out.println(ClassDemo.sum);
    }
}
// 静态变量 从属于类，被类的所有对象共享
// 可以打断点，就会理清知道，每次用 new 创建对象都会调用一次构造方法。

