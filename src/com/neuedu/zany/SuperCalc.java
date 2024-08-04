package com.neuedu.zany;

/**
 * static 修饰的静态方法
 * 1. 可以直接用类名调用
 * 2. 静态方法也有方法的重载（方法的重载与修饰符无关）
 * 3. static 不能修饰构造方法
 * 4. 静态方法中不能使用this、super关键字
 */
public class SuperCalc {

    // 静态方法
    protected static int multiply(int a, int b) {
        return a * b;
    }
}

class SubCalc extends SuperCalc {

    /**
     public static int multiply(int a, int b) {
     // TODO 静态方法中不能使用this、super关键字
     int c = super.multiply(a, b);
     return c;
     }
     */


    // TODO 静态方法也有方法的重载（方法的重载与修饰符无关）
    public static void multiply(int a) {
    }
    // TODO 普通方法方法的重载
    public  void multiply(double a){
    }


    /**
     // TODO 报错：static 不能修饰构造方法
     public static SubCalc(){}
     */

}

class TestSuper {
    public static void main(String[] args) {
        SubCalc sc = new SubCalc();
        // 实例化后访问：对象名.方法名()
        System.out.println(sc.multiply(3, 4));
        // 直接访问：类名.方法名()
        System.out.println(SubCalc.multiply(2, 2));
    }
}