package com.neuedu.homework.$2024_07_23;

/**
 * 06. 面向对象基础课后编程题
 * 02. 创建一个Telephone类，属性有电话号码number，还有2个构造方法，其中一个没有参数，一个带参数。
 */
public class Telephone {
    /**
     * 电话号码
     */
    String number;

    /**
     * 无参的构造方法
     */
    public Telephone(){}

    /**
     * 根据电话号码构造电话对象
     * @param number 电话号码
     */
    public Telephone(String number){
        this.number = number;
    }

}
