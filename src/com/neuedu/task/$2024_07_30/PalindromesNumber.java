package com.neuedu.task.$2024_07_30;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 判断一个数是不是回文数
 */
public class PalindromesNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        String line1 = scanner.nextLine();
        // 把字符串拆分各个字符存放到字符串数组里
        String[] lineArr1 = line1.split("");

        String[] lineArr2 = Arrays.copyOf(lineArr1, lineArr1.length);
        // 把字符串数组的元素倒过来排序
        int index = lineArr2.length;
        for (int i = 0; i < lineArr2.length / 2; i++) {
            // 交换
            String temp = lineArr2[i];
            lineArr2[i] = lineArr2[index - 1];
            lineArr2[index - 1] = temp;
            index--;
        }
        // 遍历数组，看每个元素是否一致
        for (int i = 0; i < lineArr2.length; i++) {
            if (!lineArr1[i].equals(lineArr2[i])) {
                System.out.println(line1 + "不是一个回文数！");
                break;
            } else {
                System.out.println(line1 + "是一个回文数！");
                break;
            }
        }
    }
}

