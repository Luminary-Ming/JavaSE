package com.neuedu.task.$2024_07_30;

import java.util.Scanner;

/**
 * 分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数。
 */
public class StringOfCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = scanner.nextLine();
        System.out.println("请输入一个子字符串：");
        String str2 = scanner.nextLine();
        // 子字符串个数
        int count = 0;
        // 下标最大值能取的是 字符串长度 减去 子字符串长度
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            // 每次截取一个和 输入的子字符串 相同长度的 字符串  作比较是否相同
            if (str1.substring(i, i + str2.length()).equals(str2)) {
                count++;
            }
        }
        System.out.println(count);
    }


}

