package com.neuedu.homework.$2024_07_22;

/**
 * 05.方法的定义和调用课后题
 * 3.编写一个方法，输出大于200的最小的质数。
 */
public class Homework03 {
    public static void main(String[] args) {
        System.out.println("大于200的最小的质数是：" + prime());  // 大于200的最小的质数是：211
    }

    /**
     * @return 返回大于200的最小的质数
     */
    public static int prime() {
        // 假设大于200的最小的质数在200-300之间
        for (int i = 200; i < 300; i++) {
            // 定义flag，如果是质数返回true
            boolean flag = true;

            // 找出除1和它本身之外的数
            for (int j = 2; j < i; j++) {
                // 判断除1和它本身之外的数是否能被整除
                if (i % j == 0) {
                    // 能被整除返回 false
                    flag = false;
                    break;
                }
            }
            // 如果为 true 输出第一个 i 的值
            if (flag) {
                return i;
            }
        }
        return 0;
    }
}
