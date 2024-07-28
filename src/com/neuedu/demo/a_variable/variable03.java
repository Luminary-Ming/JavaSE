package com.neuedu.demo.a_variable;

public class variable03 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        boolean flag = a < b && ++b > c && a - b++ < 100 || ++a + c > 40;
        System.out.println(flag); // false
        System.out.println(a);  // 11
        System.out.println(b);  // 21
        System.out.println(c);  // 30

        int x = 6, y = 8;
        boolean z;
        z = x > y && ++x == --y;
        System.out.println(x);
        System.out.println(y);
    }
}
