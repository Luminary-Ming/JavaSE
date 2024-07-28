package com.neuedu.demo.c_math;

public class Math10 {
    public static void main(String[] args) {
        // 求最小公倍数
        // 方法一：
        int num1 = 12;
        int num2 = 18;
        int result = 1;
        label:
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                if (num1 * i == num2 * j) {
                    result = num1 * i;
                    // 执行到 break label; 时，程序会跳出标记为 label 的语句，并继续执行其后的下一条语句。
                    break label;
                }
            }
        }
        System.out.println(result);

        // 方法二：先求 12 和 18 的最大公约数，然后最小公倍数 等于 12 * 18 / 最大公约数
        int n1 = 12;
        int n2 = 18;
        int result1 = 1;
        for (int i = 1; i <= n1; i++) {
            if ((n1 % i == 0) && (n2 % i ==0)){
                result1 = i;
            }
        }
        System.out.println(n1 * n2 / result1);

        // 方法三：
        int i = 1;
        while (i < 101) {
            if (i % 12 == 0 && i % 18 == 0){
                System.out.println(i);
                break;
            }
            i++;
        }



    }
}
