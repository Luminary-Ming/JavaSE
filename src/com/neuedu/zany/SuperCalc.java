package com.neuedu.zany;

/**
 * static 修饰的静态方法
 * 1. 可以直接用类名调用
 * 2. 静态方法也有方法的重载（两个必须都是静态方法）
 * 3. 不能定义与静态方法名相同的普通方法
 * 3. static 不能修饰构造方法
 */
public class SuperCalc {

    // 静态方法
    protected static int multiply(int a, int b) {
        return a * b;
    }
}

class SubCalc extends SuperCalc {

    /**
     // 静态方法
     public static int multiply(int a, int b) {
     int c = super.multiply(a, b);
     return c;
     }
     */

    /**
     // 方法的重载
     public static void multiply(int a) {
     }
     */

    /**
     // 报错：不能定义与静态方法名相同的普通方法
     public  int multiply(int a, int b) {
     }
     */

    /**
     // 报错：static 不能修饰构造方法
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



