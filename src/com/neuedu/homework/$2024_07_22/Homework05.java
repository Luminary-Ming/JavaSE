package com.neuedu.homework.$2024_07_22;

/**
 * 05.方法的定义和调用课后题
 * 5.编写一个方法abs( )，既可以对整数进行绝对值获取，又可以对小数进行绝对值的获取
 */
public class Homework05 {
    public static void main(String[] args) {
        System.out.println(abs(-5));  // 5
        System.out.println(abs(6));  // 6
        System.out.println(abs(-0.4));  // 0.4
        System.out.println(abs(7.0));  // 7.0
    }

    /**
     *
     * @param n 整数
     * @return 返回绝对值
     */
    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    /**
     *
     * @param n 小数
     * @return 返回绝对值
     */
    public static double abs(double n) {
        return n < 0.0 ? -n : n;
    }
}
