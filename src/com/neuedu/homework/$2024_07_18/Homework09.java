package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            9.有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。（选作）
        */
        System.out.println("请输入一个不多于5位的正整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 万位
        int ten_thousand = n / 10000;
        // 千位
        int thousand = n / 1000 % 10;
        // 百位
        int hundred = n / 100 % 10;
        // 十位
        int ten = n / 10 % 10;
        // 个位
        int one = n % 10;

        // 判断是几位数
        if (ten_thousand != 0) {
            System.out.println("它是五位数，每一位是：" + ten_thousand + " " + thousand + " " + hundred + " " + ten + " " + one);
        } else if (thousand != 0) {
            System.out.println("它是四位数，每一位是：" + thousand + " " + hundred + " " + ten + " " + one);
        } else if (hundred != 0) {
            System.out.println("它是三位数，每一位是：" + hundred + " " + ten + " " + one);
        } else if (ten != 0) {
            System.out.println("它是二位数，每一位是：" + ten + " " + one);
        } else {
            System.out.println("它是一位数，每一位是：" + one);
        }
    }
}
