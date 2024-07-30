package com.neuedu.homework.$2024_07_30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 03.巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，
 * 试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入现在的北京时间：（年 月 日 时 分 秒）");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        // 格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 把输入的字符串拆分
        String[] line = string.split(" ");
        // 判断输入格式是否正确
        if (line.length != 6) {
            System.out.println("你输入的时间格式不正确！");
        } else {
            String nowTime2 = line[0] + "-" + line[1] + "-" + line[2] + " " + line[3] + ":" + line[4] + ":" + line[5];
            Date date = simpleDateFormat.parse(nowTime2);
            System.out.println("北京时间为：" + simpleDateFormat.format(date.getTime()));
            System.out.println("纽约时间为：" + simpleDateFormat.format(date.getTime() - 12 * 60 * 60 * 1000));
            System.out.println("巴黎时间为：" + simpleDateFormat.format(date.getTime() - 7 * 60 * 60 * 1000));
        }

    }
}
//  请输入现在的北京时间：（年 月 日 时 分 秒）
//  2024 07 30 02 10 56
//  北京时间为：2024-07-30 02:10:56
//  纽约时间为：2024-07-29 14:10:56
//  巴黎时间为：2024-07-29 19:10:56