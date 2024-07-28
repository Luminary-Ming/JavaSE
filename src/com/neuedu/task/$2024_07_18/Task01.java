package com.neuedu.task.$2024_07_18;

public class Task01 {
    public static void main(String[] args) {
        //四级项目3
        /*
            题目1：循环输出以下结果：
            2*5=10
            4*10=40
            6*15=90
            ……
            ?*100=?
        */
        // 方法一：
        for (int i = 2, j = 5; j < 101; i += 2, j += 5) {
            System.out.println(i + "*" + j + "=" + j * i);

        }

        // 方式二：
        int k = 2;
        for (int i = 5; i < 101; i += 5) {
            System.out.println(k + "*" + i + "=" + k * i);
            k += 2;
        }

        // 方法三：
        int n = 2;
        int m = 5;
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + "*" + m + "=" + n * m);
            n += 2;
            m += 5;
        }
    }
}



