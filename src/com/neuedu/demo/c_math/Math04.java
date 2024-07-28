package com.neuedu.demo.c_math;

public class Math04 {
    public static void main(String[] args) {
        // 在控制台打印九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            //换行
            System.out.println();
        }
    }
}
