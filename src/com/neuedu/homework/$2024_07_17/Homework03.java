package com.neuedu.homework.$2024_07_17;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        // 四级项目2
        /*
            题目3：东小萌将IT云学堂的密码忘记了， 于是启动密保找回密码，
            密保问题有2个，只有当第一个问题回答正确，才能触发第二个密保问题
            密保问题一：东小萌最喜欢的学习网站是什么？ 答案： 东软IT云学堂
            密保问题二：东软IT云学堂的网站是什么？ 答案：study.neutech.cn
         */
        String answer1 = "东软IT云学堂";
        String answer2 = "study.neutech.cn";
        Scanner scanner = new Scanner(System.in);
        System.out.println("密保问题一：东小萌最喜欢的学习网站是什么？");
        String a1 = scanner.nextLine();
        if (a1.equals(answer1)) {
            System.out.println("密保问题二：东软IT云学堂的网站是什么？");
            String a2 = scanner.nextLine();
            if (a2.equals(answer2)) {
                System.out.println("密保问题通过，请设置新密码");
            } else {
                System.out.println("答案错误！");
            }
        } else {
            System.out.println("答案错误！");
        }
    }
}
