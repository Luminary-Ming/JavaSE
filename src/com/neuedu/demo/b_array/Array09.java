package com.neuedu.demo.b_array;

public class Array09 {
    public static void main(String[] args) {
        // 查找二维整型数组中的最大数及其位置。
        int[][] num = {{23, 2, 64, 16}, {35, 56, 97, 28}, {29, 10, 81, 12}};
        // 最大值
        int max = 0;
        // 行
        int x = 0;
        // 列
        int y = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] > max) {
                    max = num[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println("该二维数组中最大值是:" + max);
        System.out.println("位置是第" + x + "行，第" + y + "列");
    }
}
