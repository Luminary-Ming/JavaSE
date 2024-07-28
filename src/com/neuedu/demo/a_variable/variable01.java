package com.neuedu.demo.a_variable;

public class variable01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //交换两个数的值
        System.out.println("交换前：a=" + a + "，b=" + b);
        //使用第三方变量法交换两个数
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("变换后：a=" + a + "，b=" + b);
    }

}
