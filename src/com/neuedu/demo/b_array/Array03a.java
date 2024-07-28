package com.neuedu.demo.b_array;

import java.util.Arrays;

public class Array03a {
    public static void main(String[] args) {
        // 选择排序
        // arr 共有 8 个元素
        int[] arr = {99, 87, 25, 1, 1500, -80, -7, 100};
        // 8个元素两两比较，只比较7轮
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // 比较前一个元素和后一个元素的大小
                if (arr[i] > arr[j]) {
                    // 交换两个元素的位置
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 输出排序完的数组
        System.out.println(Arrays.toString(arr));  // [-80, -7, 1, 25, 87, 99, 100, 1500]
    }
}
