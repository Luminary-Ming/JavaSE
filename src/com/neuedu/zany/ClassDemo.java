package com.neuedu.zany;

/**
 * 静态变量从属于类，被类的所以对象共享
 * 静态变量可以直接用类名调用
 */
public class ClassDemo {
    // 静态变量：从属于类，被类的所以对象共享
    public static int sum = 1;

    // 每创建一个对象时，sum 的值发生变化
    public ClassDemo(){
        sum = sum + 5;
    }
}

class ClassDemoTest{
    public static void main(String[] args){
        // 创建两个 ClassDemo 的对象
        ClassDemo demo01 = new ClassDemo();
        ClassDemo demo02 = new ClassDemo();

        // 静态变量可以直接用类名调用
        System.out.println(ClassDemo.sum);  // 11
    }
}
