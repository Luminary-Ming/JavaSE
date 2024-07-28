package com.neuedu.homework.$2024_07_26.fruit;

import java.util.Scanner;

/**
 * 四级项目9
 * 利用接口实现动态的创建对象：
 * （1）创建4个类:苹果、梨、桔子、园丁
 * （2）在三种水果的构造方法中打印一句话.以苹果类为例：“创建了一个苹果类的对象”
 * （3）要求从控制台输入一个字符串，根据字符串的值来判断创建三种水果中哪个类的对象。
 */
public abstract class Gardener {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个水果类！");
        String string = scanner.nextLine();

        // 判断输入类对应输出类的对象
        if (string.equals("苹果")) {
            // 匿名对象
            new Apple().createFruit();
        } else if (string.equals("橘子")) {
            new Orange().createFruit();
        } else if (string.equals("鸭梨")) {
            new Pear().createFruit();
        } else {
            System.out.println("没有找到此水果类的对象！");
        }

    }

}

// 水果类的接口
interface Fruit {
    /**
     * 创建水果对象的抽象方法
     */
    void createFruit();
}