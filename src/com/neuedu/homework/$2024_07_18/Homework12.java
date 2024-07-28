package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            12.编写一个程序，求整数n的阶乘，例如5的阶乘是 5*4*3*2*1。
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        // 阶乘
        int factorial = n;
        for (int i = 1; i < n; i++) {
            // 计算阶乘
            factorial *= (n - i);
        }
        System.out.println(factorial);
    }
}
