package com.neuedu.task.$2024_07_19;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
            四级项目4
            题目1：在歌唱比赛中，共有10位评委进行打分，
            在计算歌手得分时，去掉一个最高分，去掉一个最低分，
            然后剩余的8位评委的分数进行平均，就是该选手的最终得分。
            输入每个评委的评分，求某选手的得分
        */

        Scanner scanner = new Scanner(System.in);
        // 定义数组存放10位评委的打分
        double[] scores = new double[10];
        // 定义 sum 存放打分总和
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请第" + (i + 1) + "位评委打分:");
            // 输入每一位评委的打分
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }

        // 打分从小到大排序
        Arrays.sort(scores);
        // 最低分
        double min = scores[0];
        // 最高分
        double max = scores[scores.length - 1];
        // 平均分
        double avg = (sum - max - min) / (scores.length - 2);

        System.out.println("选手的得分成绩为：" + avg);
    }
}
