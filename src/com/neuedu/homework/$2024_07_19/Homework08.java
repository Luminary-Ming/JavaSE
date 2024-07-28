package com.neuedu.homework.$2024_07_19;

public class Homework08 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            8、【难】假设队列中共有500人，每次从1开始数，数到3的人出队，
               下一个人接着从1开始数，到结尾后接着从头继续循环数，编写程序找到最后剩下的人是哪一个。
        */
        // 出队为 false  未出队为 true
        boolean[] peoples = new boolean[500];

        for (int i = 0; i < peoples.length; i++) {
            // 一开始都是未出队
            peoples[i] = true;
        }

        // 未出队的人数
        int inPeoples = peoples.length;
        // 取值为1、2、3， 每次从1开始数，数到3的人出队，下一个人接着从1开始数
        int number = 0;
        // 下标，编号
        int index = 0;
        // 循环数数，直到剩下最后一人
        while (inPeoples > 1) {
            // 如果未出队就数数
            if (peoples[index] == true) {
                number++;
                // 数到 3 就出队
                if (number == 3) {
                    number = 0;
                    peoples[index] = false;
                    inPeoples--;
                }
            }
            index++;
            // 到结尾后接着从头继续循环数
            if (index == peoples.length){
                index = 0;
            }
        }
        // 遍历剩下的人，看看谁是 true 未出队
        for (int i = 0; i < peoples.length; i++) {
            if (peoples[i] == true){
                System.out.println("最后剩下的人是第" + (i + 1) + "的人");  // 最后剩下的人是第436的人
            }
        }
    }
}
