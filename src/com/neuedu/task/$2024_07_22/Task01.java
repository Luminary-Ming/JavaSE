package com.neuedu.task.$2024_07_22;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 四级项目5
 * 完成KTV会员注册系统：
 * 1.登录功能，从控制台输入用户名及密码，如果用户名及密码与所定义的一致，则登陆成功，否则失败。
 * 如果失败，提示重新输入，如果输入错误三次，则再无机会登录。 (该用户为管理员)
 * 声明三个一维数组：会员号(唯一值)、会员名、积分；
 * 管理员登录成功后，可以完成一下操作
 * 2.完成功能：
 * （一）添加		 输入会员号 输入会员名 输入用户积分
 * （二）修改		 输入修改的会员号 输入会员名 输入用户积分 ，根据会员号修改会员名 和积分
 * （三）查询		 输入会员号，根据会员号查询该会员的信息
 * （四）全部显示    显示全部会员信息
 * （五）退出系统
 */
public class Task01 {

    static Scanner scanner = new Scanner(System.in);
    // 会员号
    static int[] memberIds = {1001, 1002, 1003};
    // 会员名
    static String[] memberNames = {"周杰伦", "李荣浩", "邓紫棋"};
    // 积分
    static int[] integrals = {9999, 8888, 7777};

    public static void main(String[] args) {

        // 登录
        login();

    }

    /**
     * 进入KTV系统
     */
    public static void ktvRun() {
        System.out.println("---欢迎进入系统---");
        while (true) {
            menu();
            System.out.println("请输入选项数字：");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    addMember();
                    break;
                case 2:
                    updateMember();
                    break;
                case 3:
                    searchMember();
                    break;
                case 4:
                    allMember();
                    break;
                case 5:
                    System.out.println("已退出系统！");
                    return;
                default:
                    System.out.println("输入错误，重新输入！");
                    break;
            }
        }
    }

    /**
     * 登录
     */
    public static void login() {
        // 管理员用户名
        String user = "admin";
        // 管理员密码
        String password = "123456";
        // 登录失败次数
        int count = 0;
        while (true) {
            System.out.println("请输入用户名：");
            String inputUser = scanner.nextLine();
            System.out.println("请输入密码：");
            String inputPassword = scanner.nextLine();

            // 判断登录是否正确
            if (inputUser.equals(user) && inputPassword.equals(password)) {
                System.out.println("登录成功！");
                ktvRun();
                break;
            } else {
                System.out.println("登录失败，请重新输入！");
                count++;
            }
            // 记录失败次数，次数到达3次时无机会再次登录
            if (count == 3) {
                System.out.println("输入错误到达三次，无机会再次登录");
                break;
            }
        }
    }

    /**
     * 管理员功能菜单
     */
    public static void menu() {
        System.out.println("---KTV会员注册系统---");
        System.out.println("1.添加会员信息");
        System.out.println("2.修改会员信息");
        System.out.println("3.查询会员信息");
        System.out.println("4.显示全部会员信息");
        System.out.println("5.退出系统");
    }

    /**
     * 添加会员信息
     */
    public static void addMember() {
        System.out.println("请输入会员id：");
        int addMemberId = scanner.nextInt();
        System.out.println("请输入会员名字：");
        scanner.nextLine();
        String addMemberName = scanner.nextLine();
        System.out.println("请输入会员积分：");
        int addIntegral = scanner.nextInt();
        for (int i = 0; i < memberIds.length; i++) {
            // 还有空位
            if (memberIds[i] == 0) {
                memberIds[i] = addMemberId;
                memberNames[i] = addMemberName;
                integrals[i] = addIntegral;
                System.out.println("添加完成！");
                break;
            } else {
                // 扩容  让数组长度 +1
                memberIds = Arrays.copyOf(memberIds, memberIds.length + 1);
                memberNames = Arrays.copyOf(memberNames, memberNames.length + 1);
                integrals = Arrays.copyOf(integrals, integrals.length + 1);
                memberIds[memberIds.length - 1] = addMemberId;
                memberNames[memberNames.length - 1] = addMemberName;
                integrals[integrals.length - 1] = addIntegral;
                System.out.println("添加完成！");
                break;
            }
        }
    }

    /**
     * 修改会员信息
     */
    public static void updateMember() {
        System.out.println("请输入会员id：");
        int updateMemberId = scanner.nextInt();

        for (int i = 0; i < memberIds.length; i++) {
            // 找到了
            if (updateMemberId == memberIds[i]) {
                System.out.println("当前会员号：" + memberIds[i] + "\t" + "会员名字：" + memberNames[i] + "\t" + "会员积分：" + integrals[i]);

                System.out.println("更新会员名字");
                memberNames[i] = scanner.nextLine();
                scanner.nextLine();
                System.out.println("更新会员积分");
                integrals[i] = scanner.nextInt();
                System.out.println("更新成功！");
                break;
            }
        }
    }

    /**
     * 查询会员信息
     */
    public static void searchMember() {
        System.out.println("请输入你要查找的会员号：");
        int searchMember = scanner.nextInt();
        for (int i = 0; i < memberIds.length; i++) {
            // 找到了
            if (searchMember == memberIds[i]) {
                System.out.println("会员号：" + memberIds[i] + "\t" + "会员名字：" + memberNames[i] + "\t" + "会员积分：" + integrals[i]);
                break;
            }

        }
    }

    /**
     * 显示全部会员信息
     */
    public static void allMember() {

        for (int i = 0; i < memberIds.length; i++) {
            if (memberIds[i] != 0) {
                System.out.println("会员号：" + memberIds[i] + "\t" + "会员名字：" + memberNames[i] + "\t" + "会员积分：" + integrals[i]);
            }
        }
    }

}
