package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            6.声明一个年份变量，判断这个年份是否是闰年。
        */
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "年是闰年");
        }else {
            System.out.println(year + "年不是闰年");
        }
    }
}
