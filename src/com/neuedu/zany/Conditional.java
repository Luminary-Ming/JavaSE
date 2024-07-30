package com.neuedu.zany;

/**
 * 三目运算符的特性
 */
public class Conditional {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("value is " + ((x > 4) ? 99.9 : 9));  // value is 9.0
    }
}
/**
 * 我们知道算术运算符中（+、-、*、/）在计算时，会把 精度低的数据类型（比如int） 自动转换成 精度高的数据类型（比如double）
 * 例：System.out.println(5 / 2.5); 结果是 2.0   原因是：int类型的 5 自动转换为 5.0 再去和 2.5 运算
 * 三目运算符中也是如此会把 精度低的数据类型 自动转换成 精度高的数据类型
 */
