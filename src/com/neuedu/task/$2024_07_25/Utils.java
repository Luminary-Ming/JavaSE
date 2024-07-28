package com.neuedu.task.$2024_07_25;

import java.util.Arrays;

/**
 * 4级项目8
 * 题目1：创建一个工具类Utils
 * (1)定义一个方法：addition（）传入一个 int 类型的参数，
 * 要求通过方法能计算出从1到参数的递归合数 如传入9 则计算出1+2+3+4···+9
 * (2)定义方法：乘法 multiply() 传入一个int类型的参数，要求通过方法计算从1到参数的递归乘法 ，如传入9 则计算出1234···*9
 * (3)定义一个方法，传入一个int[]类型数组， 通过方法，对数组进行冒泡排序 并输出最后排序结果
 * (4)定义方法，传入一个int类型数通过方法计算是否是偶数
 */
public final class Utils {
    private static Utils utils = new Utils();

    private Utils() {
    }

    public static Utils getInstance() {
        return utils;
    }

    /**
     * 计算 1 - n 的和
     * @param n 一个整数
     * @return 1到这个整数的和
     */
    public static int addition(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

    }

    /**
     * 计算 n 的阶乘
     * @param n 一个整数
     * @return 返回 n 的阶乘
     */
    public static int multiply(int n) {
        int factorial = n;
        for (int i = 1; i < n; i++) {
            factorial *= (n - i);
        }
        return factorial;
    }

    /**
     * 数组冒泡排序的方法
     * @param originalArr 一个整型数组
     */
    public static void sort(int[] originalArr) {
        for (int i = 0; i < originalArr.length - 1; i++) {
            for (int j = 0; j < originalArr.length - 1 - i; j++) {
                if (originalArr[j] > originalArr[j + 1]) {
                    int temp = originalArr[j];
                    originalArr[j] = originalArr[j + 1];
                    originalArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(originalArr));
    }

    /**
     * 判断一个数是不是偶数
     * @param n 一个整数
     * @return true 或者 false
     */
    public static boolean evenNumber(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(Utils.addition(5));  // 15

        System.out.println(Utils.multiply(5));  // 120

        int[] num = {7,-4,6,9,-1,5};
        Utils.sort(num);  // [-4, -1, 5, 6, 7, 9]

        System.out.println(Utils.evenNumber(1));  // false
        System.out.println(Utils.evenNumber(2));  // true
    }
}
