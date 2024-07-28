package com.neuedu.homework.$2024_07_16;

public class Homework04 {
    public static void main(String[] args) {
        //四级项目1
        /*
            题目4
            小明买了一双鞋，
            价值58元，买了3件衣服，
            每件30元，买了5个包，
            每个包55.8元。
            小明共交了500元，
            问还要找回多少元。
            用程序表达
         */

        //鞋
        int a = 58;
        //衣服
        int b = 30 * 3;
        //包
        double c = 55.8 * 5;
        //有500元
        int money = 500;
        //找零
        double result = money - (a + b + c);
        System.out.println(result);
    }
}
