package com.neuedu.demo.b_array;


public class Array08 {
    public static void main(String[] args) {
        // 二维数组
        // 创建一个二维整型数，给二维数组赋值同时遍历二维数组。
        // int[][] num = new int[3][4];
        int[][] num = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
//        // 给二维数组赋值
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = i + j;
//            }
//        }
        // 遍历二维数组
        // num.length = 2  二维数组行循环
        for (int i = 0; i < num.length; i++) {
            // num[i].length = 5  二维数组列循环
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            // 换行
            System.out.println();
        }
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
    }
}
