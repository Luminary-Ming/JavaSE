package com.neuedu.homework.$2024_07_18;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
             （二）编程题
             1.企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；（奖金可提10%是指：拿利润的10%做为奖励给员工）
             利润高于10万元，低于20万元时，高于10万元的部分，可提成7.5%；
             20万到40万之间时，高于20万元的部分，可提成5%；
             40万到60万之间时高于40万元的部分，可提成3%；
             60万到100万之间时，高于60万元的部分，可提成1.5%；
             高于100万元时，超过100万元的部分按1%提成，
             在程序中设定一个变量为当月利润，求应发放奖金总数？
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当月利润：(万元)");
        // 输入当月利润的值
        double profit = scanner.nextDouble();
        // 定义奖金初始为0
        double bonus = 0;

        if (profit > 0 && profit <= 10) {
            bonus = profit * 0.1;
        } else if (profit > 10 && profit <= 20) {
            bonus = 10 * 0.1 + (profit - 10) * 0.075;
        } else if (profit > 20 && profit <= 40) {
            bonus = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
        } else if (profit > 40 && profit <= 60) {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
        } else if (profit > 60 && profit <= 100) {
            bonus = 10 * 0.1 + 10 * 0.075 + 10 * 0.05 + 40 * 0.03 + (profit - 60) * 0.015;
        } else if (profit <= 0) {
            System.out.println("好好工作吧，公司亏本了，没钱发你！");
        } else {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 40 * 0.03 + 60 * 0.015 + (profit - 100) * 0.001;
        }
        System.out.println("本月奖金是：" + bonus);
    }
}
