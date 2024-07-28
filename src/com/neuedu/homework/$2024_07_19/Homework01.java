package com.neuedu.homework.$2024_07_19;

public class Homework01 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            1、编写一个简单程序，要求数组长度为5，分别赋值10，20，30，40，50，在控制台输出该数组的值。
        */
        int[] num = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        for (int numEl : num) {
            System.out.print(numEl + " ");  // 10 20 30 40 50
        }
    }
}
