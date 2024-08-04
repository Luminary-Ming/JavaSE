package com.neuedu.zany;

/**
 * String 特殊的引用传递 和 ch[] 数组的引用传递
 */
public class StringExample {
    String str = new String("good");
    // 字符串的底层是字符数组
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        StringExample ex = new StringExample();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");  // good and
        // 只有字符数组可以这样输出，其他类型数组都需要调用 Arrays.toString() 方法
        System.out.println(ex.ch);  // gbc
    }

    public void change(String str, char[] ch) {
        // 此处的 str 是形参（局部变量），方法结束后，变量就会自动销毁。
        str = "test ok";
        ch[0] = 'g';
    }
}
/**
 * 特别注意：Sting 类型比较特殊，两种理解方式
 * 1. String 是引用类型，所以是引用传递。
 * 但是 String 没有任何可以改变它状态的字段/方法，所有操作 String 的方法都是返回一个新的 String 对象，
 * 所以在函数里无论怎么改变 String 都是让它指向新的对象，从而对实参没有影响。
 * String 是只读的。
 * -
 * 2. 字符串放在常量池里面，所以是值传递
 */


/**
 * 直接定义一个字符串 和 用 new 定义一个字符串的不同
 */
class StringTest {
    public static void main(String[] args) {
        // 直接定义一个字符串是创建的地址
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 == str2); // true  地址一样

        // 用 new 定义一个字符串是创建的对象
        String str3 = new String("456");
        String str4 = new String("456");
        System.out.println(str3 == str4);  // false  地址不一样
        System.out.println(str3.equals(str4));  // true  值一样


        String str5 = "abc";
        String str6 = "ab" + "c";
        System.out.println(str5 == str6);  // true  地址一样
        System.out.println(str5.equals(str6));  // true  值一样


        String str7 = "abc";
        String str8 = "ab";
        String str9 = str8 + "c";
        System.out.println(str7 == str9);  // false  地址不一样
        System.out.println(str7.equals(str9));  // true  值一样
    }
}
/**
 * 栈区存引用和基本类型，不能存对象，而堆区存对象。==是比较地址，equals()比较对象内容。
 */
