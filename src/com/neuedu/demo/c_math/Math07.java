package com.neuedu.demo.c_math;

import java.util.Scanner;

public class Math07 {
    public static void main(String[] args) {
        // 输入一个数判断是否为质数
        /*
            我们只需判断一个数能否被1和自身以外的数字整除即可，大于其本身的自然数除外。
            若数字为n，则只需判断从2到n-1之间的所有数字，
            程序只需判断该数能否被区间[2,n-1]内的某个自然数整除即可，
            若在区间内存在能被整除的数则说明不是质数。
        */
        Scanner scanner = new Scanner(System.in);
        // 输入一个数
        int n = scanner.nextInt();
        // flag 代表是不是质数，是为 true，反之为 false
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        // 输出结果，判断 n 是否为质数
        if (flag) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }
    }
}
