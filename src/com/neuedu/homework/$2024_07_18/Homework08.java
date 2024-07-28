package com.neuedu.homework.$2024_07_18;

public class Homework08 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            8.声明三个任意整数x,y,z，请把这三个数由小到大输出。
        */
        int x, y, z;
        x = 32;
        y = 16;
        z = 64;
        int max = 0;
        int min = 0;
        // 中间的
        int middle = 0;
        // 求出最大的
        max = Math.max(x, y);
        max = Math.max(max, z);
        // 求出最小的
        min = Math.min(x, y);
        min = Math.min(min, z);
        // 求出中间的
        middle = x + y + z - max - min;
        // 输出
        System.out.println(min + " " + middle + " " + max ); // 16 32 64
    }
}
