package com.neuedu.demo.f_polymorphic;

public class Cow extends Animal {
    public Cow() {
    }

    public Cow(String type) {
        super(type);
    }

    public void noise() {
        System.out.println("哞哞哞~");
    }

}
