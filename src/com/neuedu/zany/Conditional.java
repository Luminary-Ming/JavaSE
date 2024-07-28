package com.neuedu.zany;

public class Conditional {
    public static void main(String args[]) {
        int x = 4;
        System.out.println("value is " + ((x > 4) ? 99.9 : 9));  // value is 9.0
    }
}

/**
 * 三目运算过程中数据类型会进行自动（或者说强制）转换为精度高的，具体的转换规则：
 * 1. 两个表达式是常量，结果自动转换为精度高的，
 * 2. 99.9 是 double 类型 9 是 int 类型结果是 9 转换为精度高的 double 类型 输出结果是 9.0
 */