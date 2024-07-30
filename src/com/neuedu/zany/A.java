package com.neuedu.zany;

/**
 * 继承与成员变量
 */
public class A {
    int m = 1;
    double n = 2.0;

    void printInfo() {
        System.out.println("Class A：m=" + this.m + "，n=" + this.n);
    }
}

class B extends A {
    float m = 3.0F;
    String n = "Good .";

    // Override 方法的重写
    void printInfo() {
        // 调用父类的方法
        super.printInfo();
        // super.m 是调用父类的属性，this.n 是调用本类的属性
        System.out.println("Class B: m=" + super.m + "，n=" + this.n);
    }

    public static void main(String[] args) {
        // 多态：有继承；有方法的重写；父类的引用指向子类的对象
        A a = new B();
        a.printInfo();
    }
}
//   Class A：m=1，n=2.0
//   Class B: m=1，n=Good .