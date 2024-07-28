package com.neuedu.demo.b_array;

public class Array01 {
    public static void main(String[] args) {
        // 定义数组，长度为3
        int[] num1 = new int[3];
        num1[0] = 9;
        System.out.println(num1.length);  // 3
        System.out.println(num1[0]);  // 9
        // 数组默认值为 0
        System.out.println(num1[1]);  // 0

        // 定义数组，并且给它几个值
        int[] num2 = {1, 3, 5, 7, 9};
        // 数组的遍历
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + " "); // 1 3 5 7 9
        }
        //换行
        System.out.println();

        int[] num3 = {1, 1, 4, 5, 1, 1};
        // 增强for循环：只是拿到每个元素，且不做其他任何操作
        // arrEl 是起的名字
        for (int arrEl : num3) {
            System.out.print(arrEl + " "); // 1 1 4 5 1 1
        }
    }
}
