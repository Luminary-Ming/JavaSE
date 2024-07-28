package com.neuedu.homework.$2024_07_24.company;

/**
 * 4级项目7
 * 题目1：Cola公司的雇员分为以下若干类：
 * (1) ColaEmployee ：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
 * (2) SalariedEmployee ：	ColaEmployee 的子类，拿固定工资的员工。属性：月薪
 * (3) HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。属性：每小时的工资、每月工作的小时数
 * (4) SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
 * (5) 定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额，写一个测试类TestCompany,在main方法，把若干各种类型的员工放在一个ColaEmployee 数组里，并单元出数组中每个员工当月的工资。
 */
public class ColaEmployee {
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工的生日月份
     */
    private int birthdayMonth;

    /**
     * 无参构造方法
     */
    public ColaEmployee() {
    }


    /**
     * 根据员工姓名、员工的生日月份创建员工对象
     *
     * @param name          员工的姓名
     * @param birthdayMonth 员工的生日月份
     */
    public ColaEmployee(String name, int birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
    }

    /**
     * 根据月份确定员工是否过生日，过生日则工资 +100
     *
     * @param month 月份
     * @return 工资是否 +100
     */
    public double getSalary(int month) {
        return month == this.birthdayMonth ? 100 : 0;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayMonth() {
        return this.birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }
}


