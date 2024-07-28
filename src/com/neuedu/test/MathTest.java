package com.neuedu.test;

public class MathTest {
    public static void main(String[] args) {
        // Math.random() 区间是 [0,1)
        // Math.random() * 6 + 1) 区间是 [1,7)
        // (int)(Math.random() * 6 + 1) 区间是 [1,6]
        System.out.println((int) (Math.random() * 6 + 1));  // [1,6]随机数

        // Math.PI 是 π     Math.sin(double a)
        System.out.println(Math.sin(Math.PI / 6.0));  // 0.49999999999999994

        // Math.round(double a) 四舍五入   原理是对传入的参数+0.5之后，再向下取整得到的数
        System.out.println(Math.round(6.5555 * 10.0) / 10.0);  // 6.6 保留一位小数
        System.out.println(Math.round(6.5555 * 100.0) / 100.0);  // 6.56 保留两位小数
        System.out.println(Math.round(6.5555 * 1000.0) / 1000.0);  // 6.556 保留三位小数

        // Math.abs() 绝对值
        System.out.println(Math.abs(-4));  // 4

        // Math.sqrt(double a) 计算平方根
        System.out.println(Math.sqrt(9.0));  // 3.0

        // Math.pow(double a, double b) 计算幂
        System.out.println(Math.pow(2.0, 5.0));  // 32.0

        // Math.log(double a) 计算计算以e为底a的对数
        System.out.println(Math.log(5.0));  // 1.6094379124341003

        // Math.log10(double a) 计算以10为底a的对数
        System.out.println(Math.log10(1000.0));  // 3.0

        // Math.max() 最大值
        System.out.println(Math.max(5, 6));  // 6

        // Math.ceil(double a) 向上取整
        System.out.println(Math.ceil(7.1)); // 8.0

        // Math.floor(double a) 向下取整
        System.out.println(Math.floor(8.9));  // 8.0
    }
}
