package com.neuedu.demo.d_method;

public class Method03 {
    public static void main(String[] args) {
        getBigger(1, 2);  // 2
    }
    // 得到最大值

    /**
     *
     * @param x 一个整数
     * @param y 另一个整数
     * @return 最大值
     */
    public static int getBigger(int x, int y) {
        if (x >= y) {
            System.out.println(x);
            return x;
        } else {
            System.out.println(y);
            return y;
        }
    }

}
