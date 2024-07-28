package com.neuedu.homework.$2024_07_19;

import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            4、在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
        */

        int[] num = {18, 25, 7, 6, 13, 2, 89, 63};
        // 假设最大值是第一个数
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            // 筛出最大值
            if (max < num[i]) {
                max = num[i];
            }
        }
        // 输出最大值
        System.out.println(max);  // 89
        // 下标
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == max) {
                index = i;
            }
        }
        // 输出最大数的下标
        System.out.println(index);  // 6
    }
}
