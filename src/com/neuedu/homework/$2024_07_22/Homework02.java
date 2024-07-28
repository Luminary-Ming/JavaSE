package com.neuedu.homework.$2024_07_22;

/**
 * 05.方法的定义和调用课后题
 * 2.编写一个方法，判断该年份是平年还是闰年。
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(yearClass(2018));  // 2018是平年
        System.out.println(yearClass(2000));  // 2000是闰年
    }

    /**
     * @param year 年份
     * @return 返回该年份是平年还是闰年
     */
    public static String yearClass(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return year + "是闰年";
        } else {
            return year + "是平年";
        }
    }
}
