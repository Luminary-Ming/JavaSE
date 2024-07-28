package com.neuedu.demo.c_math;

public class Math01 {
    public static void main(String[] args) {
        /*
            因子就是所有可以整除这个数的数，不包括这个数自身。（就是一个数的约数，比如20的因子有 1 2 4 5 10 ）
            因数包括这个数本身而因子不包括，如：比如15的因子是1,3,5，而因数为1,3,5,15。　　
            完数是指此数的因数之和等于此数，例如：28=1+2+4+7+14。
        */
        // 求一个数的因数
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " "); // 1 2 5 10
            }
        }


    }
}
