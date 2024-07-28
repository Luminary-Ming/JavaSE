package com.neuedu.zany;

public class Example {

    String str = new String("good");

    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {

        Example ex = new Example();

        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");  // good and

        System.out.print(ex.ch);  // gbc

    }

    public void change(String str, char[] ch) {
        // 此处的 str 是形参（局部变量），方法结束后，变量就会自动销毁。
        str = "test ok";

        ch[0] = 'g';

    }


}
