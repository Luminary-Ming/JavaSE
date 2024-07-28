package com.neuedu.homework.$2024_07_24.company;


/**
 * 测试类 TestCompany
 * 在main方法，把若干各种类型的员工放在一个 ColaEmployee 数组里，并单元出数组中每个员工当月的工资。
 */
public class CompanyTest {
    public static void main(String[] args) {
        // 创建数组 colaEmployees[] 存放 3 名员工对象
        ColaEmployee[] colaEmployees = {
                new SalariedEmployee("小王", 6, 3500),
                new HourlyEmployee("小张", 9, 50, 200),
                new SalesEmployee("小李", 11, 10000, 0.05),
        };

        for (int i = 0; i < colaEmployees.length; i++) {
            // 输出每个员工在 11 月份的工资
            // 使用匿名对象
            new Company().printInformation(colaEmployees[i], 6);
        }
    }
}
//      在6月份，员工小王的工资是：3600.0
//      在6月份，员工小张的工资是：11000.0
//      在6月份，员工小李的工资是：600.0