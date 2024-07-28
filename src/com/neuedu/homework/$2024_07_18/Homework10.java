package com.neuedu.homework.$2024_07_18;

public class Homework10 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            10.分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。
        */

        // for 循环  1到100之间所有能被3整除的整数的和
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum1 += i;
            }
        }
        System.out.println(sum1); // 1683

        // while 循环  1到100之间所有能被3整除的整数的和
        int j = 1;
        int sum2 = 0;
        while (j<101){
            if (j % 3 == 0) {
                sum2 += j;
            }
            j++;
        }
        System.out.println(sum2); // 1683

        // do-while 循环  1到100之间所有能被3整除的整数的和
        int k = 1;
        int sum3 = 0;
        do {
            if (k % 3 == 0) {
                sum3 += k;
            }
            k++;
        }while (k<101);
        System.out.println(sum3); // 1683

    }
}
