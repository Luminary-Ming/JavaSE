package com.neuedu.zany;

/**
 * 继承中的数据类型转换
 */
public class Dog {
}

class Harrier extends Dog {
}

class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Harrier();
        Harrier h2 = (Harrier) d2;

        // 编译报错：d2 的数据类型是父类的 Dog ， h3 的数据类型是子类的 Harrier
        // Harrier h3 = d2;
    }
}
