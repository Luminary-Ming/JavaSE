package com.neuedu.demo.e_oop;


public interface Consumer {
    public static final int N = 5;

    public void pay();
}

class Student implements Consumer {
    public String school;

    public Student() {
    }

    public void study() {
        System.out.println("I am studying in " + school);
    }

    public void pay() {
        System.out.println("I consume with cash!");
    }
}

class TestStudent {
    public static void main(String[] args) {
        // 向上转型  父类引用指向子类的对象
        Consumer c = new Student();
        // 这个被调用的方法必须是子类覆盖（重写）的方法。
        c.pay();  // I consume with cash!
        System.out.println(c.N);  // 5


        // 子类不能再调用自己的属性和方法（父类中没有的方法）
        // c.study();
        // System.out.println(c.school);
    }
}
/**
 * 上溯造型，即向上转型（Up casting）是指子类转换为父类，这是自动转换；转换的前提是具有继承或实现关系。
 * 向上转型损失了子类新扩展的属性和方法，仅可以使用从父类中继承的属性和方法。
 * <p>
 * 上溯造型中Java的动态运行机制遵循的原则是，当父类引用指向子类对象时，
 * 是最终的指向类型 (new Student()) 而不是声明类型 (Consumer) 决定了调用谁的成员方法，
 * 但是这个被调用的方法必须是在父类中定义过的，也就是说被子类覆盖（重写）的方法。
 */

//-----------------------------------------------------------------------------------------------------------

/**
 * 下溯造型，即向下转型（Down casting）称之为强制转换，是将父类对象转换成子类类型。
 * 曾经向上转换过的对象，才能再向下转换。对象不允许不经过上溯造型而直接下溯造型。
 */

class Person {
}

class Man extends Person {
    public static void main(String[] args) {
        Person p1 = new Person();
        // 未经过上溯造型而直接下溯造型
        Man s1 = (Man) p1;   // 运行报错：ClassCastException

        // 经过上溯造型后再下溯造型
        Person p2 = new Man();
        Man s2 = (Man) p2;   // 运行不会报错
    }
}


