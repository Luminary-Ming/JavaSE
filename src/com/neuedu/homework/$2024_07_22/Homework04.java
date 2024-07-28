package com.neuedu.homework.$2024_07_22;

import java.util.Arrays;

/**
 * 05.方法的定义和调用课后题
 * 4.写一个方法，功能：定义一个一维的int数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。
 */
public class Homework04 {
    public static void main(String[] args) {
        int[] num = {9, 8, -5, 4, 2, 0};
        bubbleSort(num);  // [-5, 0, 2, 4, 8, 9]
    }

    /**
     * @param num 数组
     */
    public static void bubbleSort(int[] num) {
        // 冒泡排序
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
