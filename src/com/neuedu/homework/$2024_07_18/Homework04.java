package com.neuedu.homework.$2024_07_18;

public class Homework04 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            4.（二）编程题
            猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，
            第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
            到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
        */
        // 第10天剩的桃子数量
        int n = 1;

        // 从第9天往回推
        for (int i = 9; i >= 1; i--) {
            n = 2 * (n + 1);
        }
        System.out.println(n); // 1534
    }
}

