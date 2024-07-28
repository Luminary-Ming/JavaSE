package com.neuedu.demo.c_math;

public class Math11 {
    public static void main(String[] args){
        // 求8和12的最大公约数。
        // 方法一：假设初始值从1开始逐步增1，每次把能同时使两个数整除的值都存储起来，那么最后一个存储起来的值就是最大的约数。
        int m = 8;
        int n = 12;
        int result = 1;
        for (int i = 1; i <= m; i++) {
            if ((m % i == 0) && (n % i == 0)){
                result = i;
            }
        }
        System.out.println(result);

        // 求9和12的最大公约数。
        // 方法二：设定初始值为两个数字中最小的数字，逐步减1，那么第一次得到的能同时使两个数整除的值就是最大公约数。
        int num1 = 9;
        int num2 = 12;
        int result1 = num1 > num2 ? num2 : num1;
        for (int i = result1; i >=1; i--){
            if ((num1 % i == 0) && (num2 % i == 0)){
                result1 = i;
                // 第一次得到的能同时使两个数整除的值就是最大公约数，所以要 break 跳出。
                break;
            }
        }
        System.out.println(result1);
    }
}
