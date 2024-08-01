package com.neuedu.homework.$2024_07_30;

import java.util.Scanner;

/**
 * 05.请编程实现：由键盘输入的任意一组字符，统计其中大写字母的个数 m和小写字母的个数 n，并输出m、n中的较大者。
 */
public class CharExample01 {
    public static void main(String[] args) {
        System.out.println("请输入任意一组字符：");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        // 字符串转换成字符数组
        char[] arr = string.toCharArray();
        // 大写字母的个数
        int m = 0;
        // 小写字母的个数
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            // 大写字母
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                m++;
            }
            // 小写字母
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                n++;
            }
        }
        System.out.println("其中大写字母的个数m=" + m);
        System.out.println("其中大写字母的个数n=" + n);
        System.out.println("m、n中的较大者:" + Math.max(m, n));
    }
}
//  请输入任意一组字符：
//  aaaAAABBB123
//  其中大写字母的个数m=6
//  其中大写字母的个数n=3
//  m、n中的较大者:6