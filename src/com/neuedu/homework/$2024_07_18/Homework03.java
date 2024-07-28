package com.neuedu.homework.$2024_07_18;

public class Homework03 {
    public static void main(String[] args) {
        // 3.5课后作业
        /*
            3.（二）编程题
            假设某员工今年的年薪是30000元，年薪的年增长率6%。
            编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
        */
        // 今年年薪
        double salary = 30000;
        // 年薪和
        double sum = 30000;
        for (int i = 2; i < 3; i++) {
            salary = salary * (1 + 0.06);
            sum += salary;
        }
        System.out.println(sum); // 395423.8482714269
    }
}
