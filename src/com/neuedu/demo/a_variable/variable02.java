package com.neuedu.demo.a_variable;

public class variable02 {
    public static void main(String[] args) {
        int a = 1;
        a = ++a; // 2  a先加1，在参与运算，所以是1+1=2
        a = a++; // 2  a先参与运算再加1，所以说 a = 2
        a = a++ + ++a; // 2 + 4 = 6
        a = ++a + a++; // 7 + 7 = 14
        System.out.println(a-- + ++a + a++ +a); // 14 + 14 + 14 + 15 = 57
        System.out.println(a); // 15

        int m,n;
        m = 6;
        n = m++ * 3;
        System.out.println(m); // 7
        System.out.println(n); // 18
    }
}
