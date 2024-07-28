package com.neuedu.homework.$2024_07_24.company;

/**
 * SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。
 * 属性：月销售额、提成率
 */
public class SalesEmployee extends ColaEmployee {
    /**
     * 月销售额
     */
    private double monthlySales;

    /**
     * 提成率
     */
    private double royaltyRate;

    /**
     * 无参的构造方法
     */
    public SalesEmployee() {
    }

    /**
     * 根据员工姓名、员工的生日月份、月销售额、提成率创建销售人员的对象
     *
     * @param name          员工姓名
     * @param birthdayMonth 员工的生日月份
     * @param monthlySales  月销售额
     * @param royaltyRate   提成率
     */
    public SalesEmployee(String name, int birthdayMonth, double monthlySales, double royaltyRate) {
        super(name, birthdayMonth);
        this.monthlySales = monthlySales;
        this.royaltyRate = royaltyRate;
    }

    /**
     * 根据员工是否过生日，月销售额，提成率返回总工资
     *
     * @param month 月份
     * @return 总工资
     */
    @Override
    public double getSalary(int month) {
        return monthlySales * royaltyRate + super.getSalary(month);
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }

    public double getRoyaltyRate() {
        return royaltyRate;
    }

    public void setRoyaltyRate(double royaltyRate) {
        this.royaltyRate = royaltyRate;
    }
}
