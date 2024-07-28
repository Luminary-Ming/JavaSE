package com.neuedu.homework.$2024_07_17;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        // 四级项目2
        /*
            题目2：
            东小萌去ATM机取款，只有用户名和密码正确，才能继续查询当前银行卡的余额，
            请完成如下逻辑：输入用户名和密码， 如果输入正确，
            进入菜单选项：1查看余额，2取款，3，存款如果输入不正确，则提示输入错误，
            卡片已经锁定请使用控制台输入的方式获取用户名和密码，以及菜单选项
         */
        String user = "admin";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String u = scanner.nextLine();
        System.out.println("请输入密码：");
        String p = scanner.nextLine();
        // u.equals(user) 判断 u 是否和 user 相等，相等则返回 true
        if (u.equals(user) && p.equals(password)) {
            System.out.println("登录成功");
            while (true) {
                System.out.println("已进入菜单请输入：1查看余额；2取款；3存款");
                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("余额：10000 元");
                        break;
                    case 2:
                        System.out.println("已进入取款系统");
                        break;
                    case 3:
                        System.out.println("已进入存款系统");
                        break;
                    default:
                        System.out.println("输入有误，请重新输入");
                        break;
                }
            }
        } else {
            System.out.println("账号或密码错误！");
        }

    }
}
