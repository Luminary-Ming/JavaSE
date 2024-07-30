package com.neuedu.task.$2024_07_30;

import java.util.Arrays;

/**
 * 有一个字符串，其中包含英文字符和数字字符，请统计和打印出各个字符的个数
 */
public class StringExample {
    public static void main(String[] args) {
        String str = "apple166667";
        String[] line = str.split("");
        System.out.println(Arrays.toString(line));
        int count = 0;
        for (int i = 0; i < line.length - 1; i++) {
            for (int j = i + 1; j < line.length; j++) {
                if (line[i].equals(line[j])) {
                    count++;
                    System.out.print(line[i]);

                }
            }
        }
        System.out.println(count);
    }
}
