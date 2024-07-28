package com.neuedu.homework.$2024_07_18;

public class Homework02 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            （二）编程题
            2.给定一个成绩a，使用switch结构求出a的等级。
            A：90-100，B：80-89，C：70-79，D：60-69，E：0~59。
        */
        // 成绩 88 分
        int a = 88;
        switch (a / 10) {
            case 10:
            case 9:
                System.out.println("等级A");
                break;
            case 8:
                System.out.println("等级B");  // 等级B
                break;
            case 7:
                System.out.println("等级C");
                break;
            case 6:
                System.out.println("等级D");
                break;
            default:
                System.out.println("等级E");
                break;
        }
    }
}
