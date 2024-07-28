package com.neuedu.homework.$2024_07_17;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        // 四级项目2
        /*
            题目1
            判断当前季节，如果是3-5月份则输出：不知细叶谁裁出，二月春风似剪刀
            如果是6-8月份则输出：连雨不知春去，一晴方觉夏深
            如果是9-11月份则输出：当年不肯嫁春风，无端却被秋风误
            如果是12-2月份则输出：晚来天欲雪，能饮一杯无
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1-12任意一个月份");
        int n = scanner.nextInt();
        if (n >= 3 && n <= 5) {
            System.out.println("不知细叶谁裁出，二月春风似剪刀");
        } else if (n >= 6 && n <= 8) {
            System.out.println("连雨不知春去，一晴方觉夏深");
        } else if (n >= 9 && n <= 11) {
            System.out.println("当年不肯嫁春风，无端却被秋风误");
        } else {
            System.out.println("晚来天欲雪，能饮一杯无");
        }

    }
}
