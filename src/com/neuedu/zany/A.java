package com.neuedu.zany;

public class A {
    int m = 1;
    double n = 2.0;

    void print() {
        System.out.println("Class A: m=" + m + "，n=" + n);
    }
}

class B extends A {
    float m = 3.0f;
    String n = "Good .";

    void print() {
        // 调用父类的方法
        super.print();
        System.out.println("Class B: m=" + m + "，n=" + n);
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
// Class A: m=1，n=2.0
// Class B: m=3.0，n=Good .
