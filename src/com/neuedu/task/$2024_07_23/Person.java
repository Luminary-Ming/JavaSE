package com.neuedu.task.$2024_07_23;

/**
 * 四级项目6
 * 题目3：
 * 1.定义一个人类Person：
 * (1)定义一个方法 sayHello()，可以向对方发出问候语“hello,my name is XXX”
 * (2)有三个属性：名字、身高、体重
 * (3)通过构造方法，分别给三个属性赋值
 * 2.定义一个Constructor类：
 * (1)创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
 * (2)分别调用对象的sayHello()方法。
 */
public class Person {
    /**
     * 姓名
     */
    String name;
    /**
     * 高度
     */
    double height;
    /**
     * 重量
     */
    double weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Person person1 = new Person("周杰伦", 185, 56.5);
        Person person2 = new Person("李荣浩", 175, 54.3);
        System.out.println(person1.sayHello(person2));  // hello! 李荣浩 my name is 周杰伦
    }

    /**
     * 向对方打招呼并且介绍自己
     *
     * @param anotherPerson 打招呼的人
     * @return hello! 李荣浩 my name is 周杰伦
     */
    public String sayHello(Person anotherPerson) {
        return "hello! " + anotherPerson.name + " my name is " + this.name;
    }
}

class Constructor {
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    String age;
    /**
     * 身高
     */
    double height;

    public Constructor(String name, String age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Constructor constructor1 = new Constructor("zhangsan", "33岁", 1.73);
        Constructor constructor2 = new Constructor("lishi", "44岁", 1.74);
        System.out.println(constructor1.sayHello(constructor2));  // hello! lishi my name is zhangsan
    }

    /**
     * 向对方打招呼并且介绍自己
     *
     * @param anotherConstructor 打招呼的人
     * @return hello! 李荣浩 my name is 周杰伦
     */
    public String sayHello(Constructor anotherConstructor) {
        return "hello! " + anotherConstructor.name + " my name is " + this.name;
    }


}