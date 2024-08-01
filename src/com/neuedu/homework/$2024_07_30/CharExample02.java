package com.neuedu.homework.$2024_07_30;

import java.util.Scanner;

/**
 * 06.输入一行字符，将其中的字母变成其后续的第3个字母，输出。例：a → d，x　→　a；y　→　b；编程实现。
 */
public class CharExample02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符：");
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        // 结果字符串
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            // 如果是 xyz 特殊处理
            if (arr[i] == 'x' || arr[i] == 'y' || arr[i] == 'z') {
                // 拼接字符
                result += (char) (arr[i] - 23);
            } else {
                result += (char) (arr[i] + 3);
            }
        }
        System.out.println(result);
    }
}
//  请输入一行字符：
//  abcjklxyz
//  defmnoabc