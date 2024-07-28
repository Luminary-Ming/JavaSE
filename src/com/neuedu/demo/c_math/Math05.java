package com.neuedu.demo.c_math;

public class Math05 {
    public static void main(String[] args) {
        // 请计算一个最小整数N，使得1+2+3...+N的和大于666首次成立。
        int i, sum=0;
        for (i = 1; i < 101; i++) {
            sum += i;
            if (sum >= 666) {
                break;
            }
        }
        System.out.println("从1到" + i + "的和为" + sum);
    }
}
