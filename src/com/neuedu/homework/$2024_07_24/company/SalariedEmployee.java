package com.neuedu.homework.$2024_07_24.company;

/**
 * SalariedEmployee ：	ColaEmployee 的子类，拿固定工资的员工。
 * 属性：月薪
 */
class SalariedEmployee extends ColaEmployee {
    /**
     * 月薪
     */
    private double monthSalary;

    /**
     * 无参构造方法
     */
    public SalariedEmployee() {
    }


    /**
     * 根据员工姓名、员工的生日月份、月薪创建按月薪拿工资的员工对象
     *
     * @param name          员工姓名
     * @param birthdayMonth 员工的生日月份
     * @param monthSalary   月薪
     */
    public SalariedEmployee(String name, int birthdayMonth, double monthSalary) {
        super(name, birthdayMonth);
        this.monthSalary = monthSalary;
    }

    /**
     * 如果员工过生日月薪工资 +100
     *
     * @param month 月份
     * @return 月薪工资
     */
    @Override
    public double getSalary(int month) {
        return this.monthSalary + super.getSalary(month);
    }


    public double getMonthSalary() {
        return this.monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }
}
