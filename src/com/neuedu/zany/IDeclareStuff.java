package com.neuedu.zany;

/**
 * 接口中的方法都是抽象方法，默认访问修饰符是 public
 * 类中的方法默认访问权限修饰符 default
 * 因此在类实现接口，方法重写时，访问权限修饰符必须写上 public
 */
public interface IDeclareStuff {

    // 接口中的成员变量都是静态常量
    // public static final 可以省略
    public static final int EASY = 3;

    // 省略了 public abstract
    void doStuff(int t);
}

// 这里写成 public class TestDeclare implements IDeclareStuff {
// 就会报错，原因是：一个Java文件可以包含多个类和接口，但必须只有一个公共（public）的类或接口
class TestDeclare implements IDeclareStuff {
    public static void main(String[] args) {
        int x = 5;
        new TestDeclare().doStuff(++x);
    }

    public void doStuff(int s) {
        s += EASY + ++s;
        System.out.println("s=" + s);
    }

    /* 如果这样写就会报错：
    void doStuff(int s) {
        s += EASY + ++s;
        System.out.println("s=" + s);
    }
    */
}
