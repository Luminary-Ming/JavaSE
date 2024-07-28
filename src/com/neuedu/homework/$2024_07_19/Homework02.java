package com.neuedu.homework.$2024_07_19;

import java.util.Arrays;

public class Homework02 {
    public static void main(String[] args) {
        /*
            04.数组课后题
           （三）编程题
            2、将一个字符数组的值（neusofteducation）拷贝到另一个字符数组中。
        */
        // 定义字符数组
        char[] a = {'n', 'e', 'u', 's', 'o', 'f', 't', 'e', 'd', 'u', 'c', 'a', 't', 'i', 'o', 'n' };
        // b 字符数组与 a 字符数组长度一致
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            // 把 a 复制给 b
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));  // [n, e, u, s, o, f, t, e, d, u, c, a, t, i, o, n]
    }
}
