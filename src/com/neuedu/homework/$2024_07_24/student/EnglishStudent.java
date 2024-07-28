package com.neuedu.homework.$2024_07_24.student;

public class EnglishStudent extends Student {

    /**
     * 演讲分数
     */
    private double speechScore;

    /**
     * 无参的构造方法
     */
    public EnglishStudent() {
    }

    /**
     * 根据学号、姓名、性别、年龄、期中考试分数、期末考试分数、演讲分数创建英语系学生对象
     *
     * @param sno            学号
     * @param name           姓名
     * @param sex            性别
     * @param age            年龄
     * @param midtermScore   期中考试分数
     * @param finalExamScore 期末考试分数
     * @param speechScore    演讲分数
     */
    public EnglishStudent(String sno, String name, String sex, int age, double midtermScore, double finalExamScore, double speechScore) {
        super(sno, name, sex, age, midtermScore, finalExamScore);
        this.speechScore = speechScore;
    }

    /**
     * 计算英语系学生的总成绩
     *
     * @return 总成绩
     */
    @Override
    public double getTotalScore() {
        return this.getSpeechScore() * 0.5 + this.getMidtermScore() * 0.25 + this.getFinalExamScore() * 0.25;
    }

    public double getSpeechScore() {
        return speechScore;
    }

    public void setSpeechScore(double speechScore) {
        this.speechScore = speechScore;
    }
}
