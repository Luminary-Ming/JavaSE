package com.neuedu.homework.$2024_07_30;

import java.util.Scanner;

/**
 * 06.输入一行字符，将其中的字母变成其后续的第3个字母，输出。例：a → d，x　→　a；y　→　b；编程实现。
 */
public class CharExample02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'x' || arr[i] == 'y' || arr[i] == 'z') {
                result += (char) (arr[i] - 26 + 3);
            }
            result += (char) (arr[i] + 3);
        }
        System.out.println(result);
    }
}
