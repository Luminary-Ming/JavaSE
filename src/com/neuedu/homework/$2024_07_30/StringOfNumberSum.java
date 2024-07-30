package com.neuedu.homework.$2024_07_30;

import java.util.Scanner;

/**
 * 01.编写一个程序，实现从命令行参数输入两个字符串类型的数值，并计算输出两个数值的和
 */
public class StringOfNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个字符串：");
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        // 将字符串强转为 double 类型的数
        double num1 = Double.parseDouble(line1);
        double num2 = Double.parseDouble(line2);
        System.out.println(num1 + num2);
    }
}
