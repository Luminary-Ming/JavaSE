package com.neuedu.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr1.length];
        // 数组复制后并扩容
        arr2 = Arrays.copyOf(arr1, arr1.length + 1);
        System.out.println(Arrays.toString(arr2));  // [1, 2, 3, 4, 5, 6, 0]
    }
}









