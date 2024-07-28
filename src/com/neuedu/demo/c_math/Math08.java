package com.neuedu.demo.c_math;

import java.util.Scanner;

public class Math08 {
    public static void main(String[] args) {
        // 打印图形
        Scanner scanner = new Scanner(System.in);
        // n 是输入的行数
        int n = scanner.nextInt();
        // i 是所在行号
        for (int i = 1; i <= n; i++) {
            // j 是打印空格的数量，空格的数量 = n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print('$');
            }
            // k 是打印星号的数量， 星号的数量 = 2 * i -1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print('*');
            }
            // 换行
            System.out.println();
        }
    }
}
