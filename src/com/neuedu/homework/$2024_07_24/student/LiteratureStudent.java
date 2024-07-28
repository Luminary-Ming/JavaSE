package com.neuedu.homework.$2024_07_24.student;

public class LiteratureStudent extends Student {

    /**
     * 演讲分数
     */
    private double speechScore;

    /**
     * 作品分数
     */
    private double worksScore;

    /**
     * 无参的构造方法
     */
    public LiteratureStudent() {
    }

    /**
     * 根据学号、姓名、性别、年龄、期中考试分数、期末考试分数、演讲分数、作品分数创建文学系学生对象
     *
     * @param sno            学号
     * @param name           姓名
     * @param sex            性别
     * @param age            年龄
     * @param midtermScore   期中考试分数
     * @param finalExamScore 期末考试分数
     * @param speechScore    演讲分数
     * @param worksScore     作品分数
     */
    public LiteratureStudent(String sno, String name, String sex, int age, double midtermScore, double finalExamScore, double speechScore, double worksScore) {
        super(sno, name, sex, age, midtermScore, finalExamScore);
        this.speechScore = speechScore;
        this.worksScore = worksScore;
    }

    /**
     * 计算文学系学生的综合成绩
     *
     * @param totalScore 总成绩
     * @return 总成绩
     */
    @Override
    public double getTotalScore() {
        return this.getSpeechScore() * 0.35 + this.getWorksScore() * 0.35 + this.getMidtermScore() * 0.15 + this.getFinalExamScore() * 0.15;
    }

    public double getSpeechScore() {
        return speechScore;
    }

    public void setSpeechScore(double speechScore) {
        this.speechScore = speechScore;
    }

    public double getWorksScore() {
        return worksScore;
    }

    public void setWorksScore(double worksScore) {
        this.worksScore = worksScore;
    }

}

