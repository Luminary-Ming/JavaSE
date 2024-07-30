package com.neuedu.task.$2024_07_30;

import java.util.Scanner;

/**
 *  判断回文数
 * 简单做法，用自带的方法
 */
public class PalindromesNumberEasy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        String str1 = scanner.nextLine();
        // 字符串反转
        String str2 = new StringBuilder(str1).reverse().toString();
        System.out.println(str2);
        if (str1.equals(str2)) {
            System.out.println(str1 + "是一个回文数！");
        } else {
            System.out.println(str1 + "不是一个回文数！");
        }
    }

}
