package com.neuedu.demo.d_method;

public class Method01 {
    public static void main(String[] args) {
        // 方法的调用
        printRect(3);
        printRect(5);
        printRect(7);
    }

    /**
     *
     * @param n 行数
     */
    public static void printRect(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 每打印完一行星号换一次行
            System.out.println();
        }
        // 每打印完一个矩形换一次行
        System.out.println();
    }

}
