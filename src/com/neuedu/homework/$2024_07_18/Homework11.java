package com.neuedu.homework.$2024_07_18;

public class Homework11 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            11.输出0-9之间的数，但是不包括5
        */
        for (int i = 0; i < 10; i++) {
            if (i==5){
                continue;
            }
            System.out.print(i + " "); // 0 1 2 3 4 6 7 8 9
        }
    }
}
