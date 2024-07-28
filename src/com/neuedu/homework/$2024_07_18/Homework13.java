package com.neuedu.homework.$2024_07_18;

public class Homework13 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            13.编写一个程序，找出大于200的最小的质数。
        */

        // 假设大于200的最小的质数在200-300之间
        for (int i = 200; i < 300; i++) {
            // 定义flag，如果是质数返回true
            boolean flag = true;

            // 找出除1和它本身之外的数
            for (int j = 2; j < i; j++) {
                // 判断除1和它本身之外的数是否能被整除
                if (i % j == 0) {
                    // 能被整除返回 false
                    flag = false;
                    break;
                }
            }
            // 如果为 true 输出第一个 i 的值
            if (flag) {
                System.out.println(i); // 211
                break;
            }
        }
    }
}
