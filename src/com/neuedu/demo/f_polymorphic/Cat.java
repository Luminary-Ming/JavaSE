package com.neuedu.demo.f_polymorphic;

public class Cat extends Animal {

    String sensitive;

    public Cat() {
    }

    public Cat(String type,String sensitive) {
        super(type);
        this.sensitive =sensitive;
    }

    @Override
    public void noise() {
        System.out.println("喵喵喵~");
    }

    public void eatRat(){}
}
