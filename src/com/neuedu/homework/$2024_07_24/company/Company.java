package com.neuedu.homework.$2024_07_24.company;

/**
 * 定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额
 */
public class Company {

    /**
     * 无参的构造方法
     */
    public Company() {
    }

    public void printInformation(ColaEmployee colaEmployee, int month) {
        System.out.println("在" + month + "月份，" + "员工" + colaEmployee.getName() + "的工资是：" + colaEmployee.getSalary(month));
    }
}
