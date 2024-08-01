package com.neuedu.homework.$2024_07_30;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 04.编写一个方法验证用户输入的日期格式是否正确，要求格式为：2006/12/12。
 * 方法的参数是要验证的日期字符串，如果格式正确返回true，否则返回false。
 */
public class DateFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期：");
        String string = scanner.nextLine();
        // 日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        boolean flag = true;
        // 异常处理
        try {
            Date date = sdf.parse(string);
        } catch (Exception e) {
            flag = false;
        } finally {
            System.out.println(flag);
        }

    }
}
//  请输入日期：
//  2024/07/31
//  true

//  请输入日期：
//  2025-07-31
//  false