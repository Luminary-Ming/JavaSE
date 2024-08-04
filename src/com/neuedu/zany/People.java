package com.neuedu.zany;

/**
 * 子类继承父类时，子类的构造方法下（不管有没有参数）默认有一个 super() ，即调用父类的无参构造方法，
 * 如果父类没有无参构造方法，编译器提示错误。（因为子类构造方法下的 super() 在父类中找不到，所以会报错）
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
        // 默认调用父类无参构造（要想父类调用有参构造要写成 super(name) ）
        super();
        System.out.print(3);
        this.name = name;
        father = new People(name + ":F");
    }

    public Child() {
        super();
        System.out.print(4);
    }

    public static void main(String[] args) {
        new Child("mike"); // 132
        System.out.println();
        new Child(); // 14
    }
}