package com.neuedu.demo.f_polymorphic;

public class AnimalTest {
    public static void main(String[] args) {
       /*
            多态：一个类型多种形态
            Java 中买组多态的条件：
            1. 必须要有继承或实现
            2. 子类必须有方法的重写
            3. 父类的引用指向子类的对象
        */

        // 结构：
        // 父类：Animal 引用：animal1 子类的对象：new Cat()
        Animal animal1 = new Cat();
        animal1.noise();  // 喵喵喵~
        animal1.sleep();

        Animal animal2 = new Cow();
        animal2.noise();  // 哞哞哞~

        Animal animal3 = new Pig();
        animal3.noise();  // 哼哼哼~

        // 多态和向上转型一样，损失了子类新扩展的属性和方法，仅可以使用从父类中继承的属性和方法。
        // System.out.println(animal1.sensitive);  // 编译报错
        // animal1.eatRat();  // 编译报错
    }
}
