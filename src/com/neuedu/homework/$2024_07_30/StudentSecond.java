package com.neuedu.homework.$2024_07_30;

/**
 * 09.做一个学生类，其中包括属性学号id，学生姓名sname，年龄sage(String类型)，在类中写一个方法来实现年龄自动增加的功能(原年龄上加1)，并测试该功能方法
 */
public class StudentSecond {
    /**
     * 学生学号
     */
    private int id;
    /**
     * 学生姓名
     */
    private String sname;
    /**
     * 学生年龄
     */
    private String sage;

    public StudentSecond(int id, String sname, String sage) {
        this.id = id;
        this.sname = sname;
        this.sage = sage;
    }

    // 年龄 +1
    public int sageAdd() {
        return Integer.parseInt(sage) + 1;
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

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }
}

class StudentSecondTest {
    public static void main(String[] args) {
        StudentSecond student = new StudentSecond(114511, "张三", "56");
        System.out.println("id:" + student.getId() + " " + student.getSname() + " " + "原年龄："
                + student.getSage() + " " + "调用方法后年龄：" + student.sageAdd());
    }
}
// id:114511 张三 原年龄：56 调用方法后年龄：57