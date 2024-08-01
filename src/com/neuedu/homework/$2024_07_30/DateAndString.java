package com.neuedu.homework.$2024_07_30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 07.输入一个时间字符串"xxxx-xx-xx" 显示出对应的XXXX年XX月XX日
 */
public class DateAndString {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入现在的时间：（xxxx-xx-xx）");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        // 格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        // 把输入的字符串拆分
        String[] line = string.split("-");
        String nowTime = line[0] + "年" + line[1] + "月" + line[2] + "日";
        // 判断输入格式是否正确
        if (string.length() != 10) {
            System.out.println("你输入的时间格式不正确！");
        } else {
            Date date = simpleDateFormat.parse(nowTime);
            System.out.println("现在时间为：" + simpleDateFormat.format(date.getTime()));
        }
    }
}

//  请输入现在的时间：（xxxx-xx-xx）
//  2024-07-30
//  现在时间为：2024年07月30日
