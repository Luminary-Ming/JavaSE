package com.neuedu.zany;

/**
 * String 特殊的引用传递 和 ch[] 数组的引用传递
 */
public class Example {

    String str = new String("good");
    // 字符串的底层是字符数组
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");  // good and
        // 只有字符数组可以这样输出，其他类型数组都需要调用 Arrays.toString() 方法
        System.out.print(ex.ch);  // gbc
    }

    public void change(String str, char[] ch) {
        // 此处的 str 是形参（局部变量），方法结束后，变量就会自动销毁。
        str = "test ok";
        ch[0] = 'g';
    }
}

/**
 * 特别注意：Sting 类型比较特殊，两种理解方式
 *  1. String 是引用类型，所以是引用传递。
 *    但是 String 没有任何可以改变它状态的字段/方法，所有操作 String 的方法都是返回一个新的 String 对象，
 *    所以在函数里无论怎么改变 String 都是让它指向新的对象，从而对实参没有影响。
 *    String 是只读的。
 *-
 *  2. 字符串放在常量池里面，所以是值传递
 */
