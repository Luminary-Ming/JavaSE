package com.neuedu.homework.$2024_07_24.student;

/**
 * 四级项目7 题目2：
 * 编写三个系别的学生类：英语系，计算机系，文学系（要求通过继承学生类），各系有以下成绩：
 * 英语系：演讲，期末考试，期中考试；
 * 计算机系：操作能力，英语写作，期中考试，期末考试；
 * 文学系：演讲，作品，期末考试，期中考试;
 * 各系总分评测标准：
 * 英语系：
 *     演讲 50%期末考试 25%期中考试 25%
 * 计算机系：
 *     操作能力 40%英语写作 20%期末考试 20%期中考试 20%
 * 文学系：
 *     演讲 35%作品 35%期末考试 15%期中考试 15%
 * 定义一个可容纳 5个学生的学生类数组，使用随机数给该数组装入各系学生的对象，然后按如下格式输出数组中的信息：
 * 学号:XXXXXXXX 姓名：XXX 性别：X 年龄：XX 综合成绩：XX
 */
public class Student {

    /**
     * 学号
     */
    private String sno;

    /**
     * 名字
     */
    private String name;

    /**
     * 姓名
     */
    private String sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 期中考试分数
     */
    private double MidtermScore;

    /**
     * 期末考试分数
     */
    private double finalExamScore;


    /**
     * 无参的构造方法
     */
    public Student() {
    }

    /**
     * 根据学号、姓名、性别、年龄、期中分数、期末分数创建学生对象
     *
     * @param sno            学号
     * @param name           姓名
     * @param sex            性别
     * @param age            年龄
     * @param midtermScore   期中分数
     * @param finalExamScore 期末分数
     */
    public Student(String sno, String name, String sex, int age, double midtermScore, double finalExamScore) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.MidtermScore = midtermScore;
        this.finalExamScore = finalExamScore;
    }

    /**
     * 计算学生总成绩
     *
     * @return 总成绩
     */
    public double getTotalScore() {
        return 0.0;
    }

    /**
     * 输出学生信息
     *
     * @param students 学生对象
     */
    public void printInformation(Student students) {
        System.out.println("学号：" + students.sno + " " + "姓名：" + students.name + " " + "性别：" + students.sex
                + " " + "年龄：" + students.age + " " + "综合成绩：" + students.getTotalScore());
    }


    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMidtermScore() {
        return MidtermScore;
    }

    public void setMidtermScore(double midtermScore) {
        MidtermScore = midtermScore;
    }

    public double getFinalExamScore() {
        return finalExamScore;
    }

    public void setFinalExamScore(double finalExamScore) {
        this.finalExamScore = finalExamScore;
    }
}