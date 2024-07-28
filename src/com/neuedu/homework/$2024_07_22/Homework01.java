package com.neuedu.homework.$2024_07_22;

/**
 * 05.方法的定义和调用课后题
 * 1.编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
 */
public class Homework01 {
    public static void main(String[] args) {
        System.out.println(factorial(6)); // 720.0
    }

    /**
     *
     * @param n 一个整数
     * @return 这个整数的阶乘
     */
    public static double factorial(int n) {
        double factorial = n;
        for (int i = 1; i < n; i++) {
            factorial *= (n - i);
        }
        return factorial;
    }
}
