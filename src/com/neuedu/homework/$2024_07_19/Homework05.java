package com.neuedu.homework.$2024_07_19;

import java.util.Arrays;

public class Homework05 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            5、将一个数组中的元素逆序存放到另一各数组中。
        */
        // 一个数组
        int[] num1 = {1, 3, 5, 7, 9, 11, 13};
        // 要存放的数组
        int[] num2 = new int[num1.length];
        // 交换的轮数
        for (int i = 0; i < num1.length / 2; i++) {
            // 根据下标交换位置
            int temp = num1[i];
            num1[i] = num1[num1.length - 1 - i];
            num1[num1.length - 1 - i] = temp;
        }
        // 遍历逆序后的 num1 数组
        for (int i = 0; i < num1.length; i++) {
            // 把 num1 数组的元素存放到 num2 数组里
            num2[i] = num1[i];
        }
        // 输出 num2 数组
        System.out.println(Arrays.toString(num2));  // [13, 11, 9, 7, 5, 3, 1]
    }
}
