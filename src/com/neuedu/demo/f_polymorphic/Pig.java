package com.neuedu.demo.f_polymorphic;

public class Pig extends Animal {
    public Pig() {
    }

    public Pig(String type) {
        super(type);
    }

    public void noise() {
        System.out.println("哼哼哼~");
    }
}