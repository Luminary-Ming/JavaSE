package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            5.判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），
              或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
        */
        System.out.println("请输入一个数字：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 5 == 0 && n % 6 == 0) {
            System.out.println("能被5和6整除");
        } else if (n % 5 == 0) {
            System.out.println("只能被5整除");
        } else if (n % 6 == 0) {
            System.out.println("只能被6整除");
        }else {
            System.out.println("不能被5或6整除");
        }
    }
}
