package com.neuedu.homework.$2024_07_30;

import java.util.Objects;

/**
 * 08.做一个学生类Student，其中包括属性学号id，学生姓名sname，
 * 在类中重写一个equals方法来根据学号和姓名来判断两个学生的是不是同一个学生，并测试该功能方法
 */
public class Student {
    /**
     * 学生学号
     */
    private int id;
    /**
     * 学生姓名
     */
    private String sname;


    public Student(int id, String sname) {
        this.id = id;
        this.sname = sname;

    }

    /**
     * 判断两个学生的是不是同一个学生
     * @param o 对象
     * @return true 或者 false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(sname, student.sname);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student(114511,"王德发");
        Student student2 = new Student(114511,"王德发");
        Student student3 = new Student(114512,"王德柱");
        System.out.println(student1.equals(student2));  // true
        System.out.println(student1.equals(student3));  // false
    }
}