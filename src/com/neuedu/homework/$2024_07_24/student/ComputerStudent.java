package com.neuedu.homework.$2024_07_24.student;

public class ComputerStudent extends Student {

    /**
     * 操作能力分数
     */
    private double operationAbilityScore;

    /**
     * 英语习作分数
     */
    private double englishWritingScore;

    /**
     * 无参的构造方法
     */
    public ComputerStudent() {
    }

    /**
     * 根据学号、姓名、性别、年龄、期中考试分数、期末考试分数、操作能力分数、英语习作分数创建计算机系学生对象
     *
     * @param sno                   学号
     * @param name                  姓名
     * @param sex                   性别
     * @param age                   年龄
     * @param midtermScore          期中考试分数
     * @param finalExamScore        期末考试分数
     * @param operationAbilityScore 操作能力分数
     * @param englishWritingScore   英语习作分数
     */
    public ComputerStudent(String sno, String name, String sex, int age, double midtermScore, double finalExamScore, double operationAbilityScore, double englishWritingScore) {
        super(sno, name, sex, age, midtermScore, finalExamScore);
        this.operationAbilityScore = operationAbilityScore;
        this.englishWritingScore = englishWritingScore;
    }

    @Override
    public double getTotalScore() {
        return this.getOperationAbilityScore() * 0.4 + this.getEnglishWritingScore() * 0.2
                + this.getMidtermScore() * 0.2 + this.getFinalExamScore() * 0.2;
    }

    public double getOperationAbilityScore() {
        return operationAbilityScore;
    }

    public void setOperationAbilityScore(double operationAbilityScore) {
        this.operationAbilityScore = operationAbilityScore;
    }

    public double getEnglishWritingScore() {
        return englishWritingScore;
    }

    public void setEnglishWritingScore(double englishWritingScore) {
        this.englishWritingScore = englishWritingScore;
    }

}
