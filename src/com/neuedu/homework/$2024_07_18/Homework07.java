package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            7.声明一个0～100的成绩变量，如果不是0～100之间，打印成绩无效，
            根据成绩等级（等级自己划分）打印A,B,C,D,E。
        */
        System.out.println("请输入一个分数：");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score >= 90 && score <= 100){
            System.out.println("等级A");
        }
        if (score >= 80 && score <= 89){
            System.out.println("等级B");
        }
        if (score >= 70 && score <= 79){
            System.out.println("等级C");
        }
        if (score >= 60 && score <= 69){
            System.out.println("等级D");
        }
        if (score >= 0 && score <= 59){
            System.out.println("等级E");
        }else {
            System.out.println("成绩无效！");
        }
    }
}
