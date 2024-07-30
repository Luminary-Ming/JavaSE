package com.neuedu.demo.h_exception;

public class Student {
    /**
     * 平时成绩
     */
    private double usualGrades;
    /**
     * 期末成绩
     */
    private double finalGrades;

    public Student(double usualGrades, double finalGrades) {
        this.usualGrades = usualGrades;
        this.finalGrades = finalGrades;
    }

    /**
     * 计算总成绩
     *
     * @return 总成绩
     */
    public double getScore() throws Exception {
        return usualGrades + finalGrades / 2;
    }

    public static void main(String[] args) {
        Student student = new Student(10, 80);
        try {
            if (student.getScore() < 60){
                throw new Exception();
            }
            System.out.println(student.getScore());
        } catch (Exception e) {
            System.out.println("总成绩小于60分！");
        }

    }


    public double getUsualGrades() {
        return usualGrades;
    }

    public void setUsualGrades(double usualGrades) {
        this.usualGrades = usualGrades;
    }

    public double getFinalGrades() {
        return finalGrades;
    }
    public void setFinalGrades(double finalGrades) {
        this.finalGrades = finalGrades;
    }
}
