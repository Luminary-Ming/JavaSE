package com.neuedu.demo.b_array;

public class Array02 {
    public static void main(String[] args) {
        // 求数组中的最大值和最小值

        int[] num = {11, 300, 5, 77, 99};
        // 假设最大值是第一个数，即 num[0]
        int max = num[0];
        // 假设最小值是第二个数，即 num[1]
        int min = num[1];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("最大值是" + max);
        System.out.println("最小值是" + min);
    }
}
