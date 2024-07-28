package com.neuedu.homework.$2024_07_24.company;

/**
 * HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
 * 属性：每小时的工资、每月工作的小时数
 */
public class HourlyEmployee extends ColaEmployee {
    /**
     * 每小时的工资
     */
    private double hourSalary;

    /**
     * 每月工作的小时数
     */
    private double hour;

    /**
     * 无参的构造方法
     */
    public HourlyEmployee() {
    }


    /**
     * 根据员工姓名、员工的生日月份、每小时的工资、每月工作的小时数创建按小时拿工资的员工对象
     *
     * @param name          员工姓名
     * @param birthdayMonth 员工的生日月份
     * @param hourSalary    每小时的工资
     * @param hour          每月工作的小时数
     */
    public HourlyEmployee(String name, int birthdayMonth, double hourSalary, double hour) {
        super(name, birthdayMonth);
        this.hourSalary = hourSalary;
        this.hour = hour;
    }

    /**
     * 根据员工是否过生日、每月工作的小时数、每小时的工资返回总工资
     *
     * @param month 月份
     * @return 总工资
     */
    @Override
    public double getSalary(int month) {
        // 工作小时超过 160
        if (this.hour > 160) {
            return (160 + (this.hour - 160) * 1.5) * this.hourSalary + super.getSalary(month);
        }
        return hour * this.hourSalary + super.getSalary(month);
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }
}
