package com.neuedu.demo.d_method;

public class Method02 {
    public static void main(String[] args) {
        // 无返回值，无入参的方法  黑洞方法
        drawRect();
    }

    /**
     *
     */
    public static void drawRect() {
        int width = 10;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
