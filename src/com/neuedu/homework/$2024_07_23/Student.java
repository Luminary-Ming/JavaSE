package com.neuedu.homework.$2024_07_23;

import java.util.Arrays;

/**
 * 06. 面向对象基础课后编程题
 * 04. 设计一个类Student，该类包括姓名、学号和成绩。设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。
 */
public class Student {
    /**
     * 姓名
     */
    String name;
    /**
     * 学号
     */
    String sno;
    /**
     * 成绩
     */
    double score;

    /**
     * 根据学生姓名、学号、成绩构造学生对象
     *
     * @param name  学生姓名
     * @param sno   学号
     * @param score 成绩
     */
    public Student(String name, String sno, double score) {
        this.name = name;
        this.sno = sno;
        this.score = score;
    }

    /**
     * 无参的构造方法
     */
    public Student() {
    }

    public static void main(String[] args) {
        // 存放学生信息的数组
        Student[] students = {
                new Student("王哈哈", "1001", 88.8),
                new Student("今麦郎", "1002", 99.9),
                new Student("碎冰冰", "1003", 77.7),
                new Student("达利园", "1004", 55.5),
                new Student("加多宝", "1005", 66.6)
        };
        new Student().printInfoByScore(students);
    }

    /**
     * 根据学生成绩降序后输出学生的信息
     *
     * @param students 存放学生信息的数组
     */
    public void printInfoByScore(Student[] students) {
        // 取到所以学生的成绩，生成一个成绩数组
        double[] scores = new double[students.length];
        // 给 scores 数组的每个元素赋值
        for (int i = 0; i < scores.length; i++) {
            scores[i] = students[i].score;
        }
        System.out.println("未排序前的成绩：" + Arrays.toString(scores));  // 未排序前的成绩：[88.8, 99.9, 77.7, 55.5, 66.6]
        // 成绩降序排列
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    double temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        System.out.println("降序后的成绩：" + Arrays.toString(scores));  // 降序后的成绩：[99.9, 88.8, 77.7, 66.6, 55.5]
        // 降序后学生信息的顺序
        for (int i = 0; i < scores.length; i++) {
            for (Student student : students) {
                if (student.score == scores[i]) {
                    System.out.println(student.name + "\t" + student.sno + "\t" + student.score + "\t");
                }
            }
        }
    }
}
// 输出结果：
// 今麦郎	1002	99.9
// 王哈哈	1001	88.8
// 碎冰冰	1003	77.7
// 加多宝	1005	66.6
// 达利园	1004	55.5