package com.neuedu.demo.e_oop;

public class Dog {
    /**
     * 名字
     */
    String name;
    /**
     * 年龄
     */
    int age;
    /**
     * id号
     */
    int id;  // 默认值为0

    public Dog(String name) {
        id++;
        // 方法中的变量与属性重名，因此使用 this 关键字
        this.name = name;
    }

    public Dog() {
    }

    /*
     * 在一个构造方法中，调用其他重载的构造方法
     */
    public Dog(String name, int age) {
        this(name);      //通过this( )调用了重载构造方法
        this.age = age;
    }

    /*
     * 把this作为一个局部变量，它的值是当前对象的引用
     * 返回值类型是 Dog
     */
    public Dog clone() {
        id++;
        return this;
    }

    public void print() {
        System.out.println("it is " + this.name + " number " + this.id);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Cai Wang");
        Dog dog2 = new Dog("Wang Wang");
        dog1.print();  // it is Cai Wang number 1
        dog2.print();  // it is Wang Wang number 1
        // this 引用的 dog1 对象，同一个id属性
        Dog caiWang = dog1.clone();
        caiWang.print();  // it is Cai Wang number 2
        // this 引用的 dog2 对象，同一个id属性
        dog2.clone().clone().print();    // it is Wang Wang number 3
    }
}
