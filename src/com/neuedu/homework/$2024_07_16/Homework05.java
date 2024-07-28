package com.neuedu.homework.$2024_07_16;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //四级项目1
        /*
            题目5
            (1) 输入一个整数，代表有n个小时，计算n个小时等于多少天零多少个小时。比如输入：25，那么输出“1天零1个小时”
            (2) 输入电视机的价格（double型）及数量(int型)，计算这些电视机总价值是多少
         */
        System.out.println("题目5 (1)");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入n个小时：");
        int n = scanner1.nextInt();
        int day = n / 24;
        int hour = n % 24;
        System.out.println(day + "天零" + hour + "个小时");

        System.out.println("题目5 (2)");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入单价：");
        double price = scanner2.nextDouble();
        System.out.println("请输入数量：");
        int number = scanner2.nextInt();
        double monkey = price * number;
        System.out.println("总价为" + monkey);
    }
}
