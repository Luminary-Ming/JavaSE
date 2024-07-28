package com.neuedu.homework.$2024_07_24.student;

import java.util.Arrays;

public class StudentTest {

    public StudentTest() {
    }

    public static void main(String[] args) {
        Student[] students = {
                new EnglishStudent("1001", "小张", "男", 21, 88, 77, 66),
                new ComputerStudent("1002", "小红", "女", 22, 86, 55, 74, 86),
                new ComputerStudent("1003", "小美", "女", 22, 66, 58, 70, 76),
                new LiteratureStudent("1004", "小帅", "男", 23, 74, 71, 71, 62),
                new LiteratureStudent("1005", "小李", "男", 23, 75, 79, 75, 36)
        };
        // 使用随机数给该数组装入各系学生的对象
        Student[] students1 = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            // 生成 0-4 随机数
            int num = (int) (Math.random() * 5);
            // 去掉重复值
            while (students[num] == null) {
                num = (int) (Math.random() * 5);
            }
            // 把随机的筛的结果存到新数组
            students1[i] = students[num];
            students[num] = null;
        }
        // 输出新数组
        for (int i = 0; i < students1.length; i++) {
            new Student().printInformation(students1[i]);
        }
    }
}
//   学号：1003 姓名：小美 性别：女 年龄：22 综合成绩：68.0
//   学号：1002 姓名：小红 性别：女 年龄：22 综合成绩：75.0
//   学号：1004 姓名：小帅 性别：男 年龄：23 综合成绩：68.3
//   学号：1005 姓名：小李 性别：男 年龄：23 综合成绩：61.95
//   学号：1001 姓名：小张 性别：男 年龄：21 综合成绩：74.25