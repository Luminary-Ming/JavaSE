package com.neuedu.demo.f_polymorphic;

public class Animal {
    /**
     * 动物种类
     */
    String type;

    public Animal() {
    }

    public Animal(String type) {
        this.type = type;
    }

    public void noise() {
        System.out.println("动物的叫声");
    }

    public void sleep(){}
}
