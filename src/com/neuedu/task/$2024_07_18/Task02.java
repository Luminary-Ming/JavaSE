package com.neuedu.task.$2024_07_18;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
            四级项目3 题目2：
            东小萌去ATM取款机取款，要求必须复合以下场景：
            tip 1： 实现登录，要求最多有3次机会，3次登录失败，则提示“银行卡已锁定，请到柜台办理人工业务”
            tip 2： 如登录成功则实现以下菜单：
        */
        // 账号
        String user = "admin";
        // 密码
        int password = 666888;
        // 试错次数
        int num = 0;
        // 定义一个 userMoney 存放用户初始金额
        double userMoney = 114511;

        // 三次登录失败，跳出循环
        while (num < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入账号：");
            String inputUser = scanner.nextLine();
            System.out.println("请输入密码：");
            int inputPassword = scanner.nextInt();

            // 判断输入的账号密码是否正确
            if (inputUser.equals(user) && inputPassword == password) {
                System.out.println("登录成功！");

                // 循环ATM机操作
                while (true) {

                    // 欢迎使用中国工商银行ATM存取款机！
                    System.out.println();
                    for (int i = 0; i < 52; i++) {
                        System.out.print('*');
                    }
                    System.out.println('*');
                    System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t*");
                    System.out.println("*\t\t\t欢迎使用中国工商银行ATM存取款机！\t\t\t*");
                    System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t*");
                    for (int i = 0; i < 52; i++) {
                        System.out.print('*');
                    }

                    // 1、查看余额  2、取款  3、存款  0、退出
                    System.out.println('*');
                    System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t*");
                    System.out.println("*\t\t\t 1、查看余额 \t\t\t 2、取款\t\t\t\t*");
                    System.out.println("*\t\t\t 3、存款 \t\t\t 0、退出\t\t\t\t*");
                    System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t*");
                    for (int i = 0; i < 53; i++) {
                        System.out.print('*');
                    }
                    // 换行
                    System.out.println();

                    // 提示语句
                    System.out.print("请输入你需要的服务:");

                    // 输入一个数字
                    int n = scanner.nextInt();
                    // 根据输入的数字进行对应操作
                    switch (n) {
                        case 1:
                            System.out.print("您的余额是：￥" + userMoney + "元");
                            break;
                        case 2:
                            System.out.print("请输入您要取出的金额：￥");
                            // 取钱金额
                            double getMoney = scanner.nextDouble();
                            // 取钱后的用户金额
                            userMoney -= getMoney;
                            System.out.println("您已成功取出￥" + getMoney + "，现在余额￥" + userMoney);
                            break;
                        case 3:
                            System.out.print("请输入您要存入的金额：￥");
                            // 存款金额
                            double saveMoney = scanner.nextDouble();
                            // 存钱后的用户金额
                            userMoney += saveMoney;
                            System.out.println("您已成功存入￥" + saveMoney + "，现在余额￥" + userMoney);
                            break;
                        case 0:
                            System.out.println("已退出！");
                            // 跳出while循环
                            return;
                        default:
                            System.out.println("输入有误，请重新输入！");
                            break;
                    }
                }

            } else {
                System.out.println("登录失败，账号或密码错误！");
                // 每错一次，num次数+1
                num++;
            }
        }
        System.out.println("3次登录失败，银行卡已锁定，请到柜台办理人工业务！");
    }
}
