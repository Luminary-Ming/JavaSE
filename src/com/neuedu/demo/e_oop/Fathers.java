package com.neuedu.demo.e_oop;

/**
 * 代码块的优先级
 */
public class Fathers {
    static {
        System.out.println("父类中的静态代码块");
    }

    Fathers() {
        System.out.println("父类中的构造函数");
    }

    {
        System.out.println("父类中的非静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("父类中的main方法");
    }
}

class Sons extends Fathers{
    static {
        System.out.println("子类中的静态代码块");
    }

    Sons() {
        //默认有一个 super()
        System.out.println("子类中的构造函数");
    }

    {
        System.out.println("子类中的非静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("子类中的main方法");
        new Sons();
    }
}
/*
静态代码块的执行顺序：静态代码块----->非静态代码块-------->构造函数

    父类中的静态代码块
    子类中的静态代码块
    子类中的main方法
    父类中的非静态代码块
    父类中的构造函数
    子类中的非静态代码块
    子类中的构造函数

 */