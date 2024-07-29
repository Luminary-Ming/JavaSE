package com.neuedu.zany;

/**
 * 接口中都是抽象方法，默认访问权限修饰符是 public
 * 类中的方法默认访问权限修饰符是 default
 * 在类实现接口，方法重写时，访问权限修饰符必须写上 public
 */
public interface IDeclareStuff {
    public static final int EASY = 3;

    // 接口中的方法都是抽象方法
    // 省略掉了 public abstract 关键字
    void doStuff(int t);
}

// 这里写成 public class TestDeclare implements IDeclareStuff {
// 就会报错，原因是：一个Java文件可以包含多个类和接口，但必须只有一个公共（public）的类或接口
class TestDeclare implements IDeclareStuff {
    public static void main(String[] args) {
        int x = 5;
        new TestDeclare().doStuff(++x);
    }

    /* 如果这样写就会报错：
    void doStuff(int s) {
        s += EASY + ++s;
        System.out.println("s=" + s);
    }
    */
    // 正确写法：
    public void doStuff(int s) {
        s += EASY + ++s;
        System.out.println("s=" + s);
    }
}
/**
 * 接口中所有方法默认都是public（至于为什么要是public，原因在于如果不是public，那么只能在同个包下被实现，可访问权限就降低很多了）
 * 那么在实现类中，实现的类相当于子类，子类的访问权限是不能严格于父类的。
 * 而在java中一个类如果没有权限的修饰符，默认是 [ default ] (同一个包内的其它类才可访问)，所以在实现类中一定要写 public
 */
