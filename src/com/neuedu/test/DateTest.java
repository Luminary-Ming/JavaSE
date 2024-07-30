package com.neuedu.test;

import java.util.Calendar;

/**
 * 巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，
 * 试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。
 */
public class DateTest {
    public static void main(String[] args) {
        Calendar c2 = Calendar.getInstance();
        int year = c2.get(Calendar.YEAR); //年份
        int month = c2.get(Calendar.MONTH) + 1;
        int date = c2.get(Calendar.DATE); //日期
        int hour = c2.get(Calendar.HOUR_OF_DAY); //小时
        int minute = c2.get(Calendar.MINUTE); //分钟
        int second = c2.get(Calendar.SECOND); //秒
        int day = c2.get(Calendar.DAY_OF_WEEK); //星期几
        System.out.println("年份：" + year);
        System.out.println("月份：" + month);
        System.out.println("日期：" + date);
        System.out.println("小时：" + hour);
        System.out.println("分钟：" + minute);
        System.out.println("秒：" + second);
        System.out.println("星期：" + day);

    }
}
