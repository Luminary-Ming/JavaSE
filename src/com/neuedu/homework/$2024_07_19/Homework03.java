package com.neuedu.homework.$2024_07_19;

import java.util.Arrays;

public class Homework03 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            3、给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值。
        */
        int[] num = {1, 6, 2, 3, 9, 4, 5, 7, 8};
        // 排序
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));  // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
