package com.neuedu.homework.$2024_07_19;

import java.util.Arrays;

public class Homework07 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            7、给定一维数组{ -10，2，3，246，-100，0，5} ，计算出数组中的平均值、最大值、最小值。
        */
        int[] num = {-10, 2, 3, 246, -100, 0, 5};
        // 数组和
        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        // 平均值
        double avg = sum / num.length;
        System.out.println(avg);  // 20.857142857142858

        // 排序
        Arrays.sort(num);
        // 最大值
        int max = num[num.length-1];
        // 最小值
        int min = num[0];
        System.out.println(max);  // 246
        System.out.println(min);  // -100
    }
}
