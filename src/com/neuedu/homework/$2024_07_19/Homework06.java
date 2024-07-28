package com.neuedu.homework.$2024_07_19;

public class Homework06 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            6、将一个数组中的重复元素保留一个其他的清零。
        */
        // 一个有重复元素的数组
        int[] num = {1, 3, 3, 5, 5, 5, 9, 9, 9, 9, 9, 11, 13};
        // 遍历数组
        for (int i = 0; i < num.length; i++) {
            // 每一次都是前一个元素和后一个元素相比，所以是 j = i + 1
            for (int j = i + 1; j < num.length; j++) {
                // 判断如果重复,保留第一个元素，其他重复元素赋值给 0
                if (num[i] == num[j]) {
                    num[j] = 0;
                }
            }
            // 输出数组
            System.out.print(num[i] + " ");  // 1 0 3 0 0 5 0 0 0 0 9 11 13
        }
    }
}
