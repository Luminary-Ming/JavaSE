package com.neuedu.homework.$2024_07_30;

import java.util.Scanner;

/**
 * 02. 编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数。
 */
public class StringOfCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个字符串：");
        String line = scanner.nextLine();
        // 字符串中字符 'e' 出现的次数
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            // 子字符串中含有字符 'e'
            if (line.substring(i, i + 1).equals("e")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
//  请输入两个字符串：
//  fjsdfzxeedfdfeeedlfe
//  6