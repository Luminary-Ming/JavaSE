package com.neuedu.zany;

/**
 * 子类继承父类时，子类的构造方法下（不管有没有参数）默认有一个 super()
 */
public class People {

    String name;

    public People() {
        System.out.print(1);
    }

    public People(String name) {
        System.out.print(2);
        this.name = name;
    }
}

class Child extends People {
    People father;

    public Child(String name) {
        // 这里默认会有一个
        // super();  和子类构造方法中有没有参数无关，只能是有 super(name) 时
        super();
        System.out.print(3);
        this.name = name;
        father = new People(name + ":F");
    }

    public Child() {
        System.out.print(4);
    }

    public static void main(String[] args) {
        new Child("mike");  // 132
    }
}

/*
    如果子类构造方法中没有出现super()，那么编译器会默认加上super()，即调用父类的空构造方法，
    如果父类没有空构造方法，编译器提示错误。
 */