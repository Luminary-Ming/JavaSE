package com.neuedu.demo.c_math;

public class Math06 {
    public static void main(String[] args) {
        // 显示20以内的奇数。
        for (int i = 1; i < 20; i++) {
            if ((i % 2) == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
