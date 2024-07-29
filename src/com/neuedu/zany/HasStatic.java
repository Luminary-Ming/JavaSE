package com.neuedu.zany;

/**
 * 静态变量
 */
public class HasStatic {

    private static int x = 100;

    public static void main(String[] args) {

        HasStatic hs1 = new HasStatic();
        hs1.x++;

        HasStatic hs2 = new HasStatic();
        hs2.x++;

        hs1 = new HasStatic();
        hs1.x++;

        HasStatic.x--;

        System.out.println("x =" + x);  // x =102

    }
}
/**
 * 静态变量是成员变量的一种，静态变量存储在方法区中，则它在类加载时就会进行初始化，
 * 所以静态变量访问的时候不需要创建实例（对象），直接可以通过类名来访问。
 * 静态变量有两种方式可以对其进行访问：
 * 1. 直接访问：类名.属性
 * 2. 实例化后访问：对象名.属性
 */