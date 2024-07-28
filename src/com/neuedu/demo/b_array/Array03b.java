package com.neuedu.demo.b_array;

import java.util.Arrays;

public class Array03b {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr = {9, 8, 5, 4, 2, 0};
        // 比较轮数  6个数比较5轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 每轮比较的位置
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
