package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            14.定义一个任意的4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
        */

        System.out.println("请输入一个任意的4位整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 千位
        int a = n / 1000;
        // 百位
        int b = n / 100 % 10;
        // 十位
        int c = n / 10 % 10;
        // 个位
        int d = n % 10;

        // 输出反转后的数字
        System.out.println(d+""+c+""+b+""+a);
    }
}
