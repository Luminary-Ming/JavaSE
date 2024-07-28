package com.neuedu.homework.$2024_07_16;

public class Homework02 {
    public static void main(String[] args) {
        //四级项目1
        /*  题目2 (1)
            定义四个变量，a=’A’;b=’B’,c=’C’,d=’D’;
            现在编程实现a与d变量中的值交换，b与c中的值交换。
            最后输出a、b、c、d中的值。
         */
        System.out.println("题目2 (1)");
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';
        char temp1;
        char temp2;
        temp1 = a;
        a = b;
        b = temp1;
        temp2 = c;
        c = d;
        d = temp2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /*
            题目2 (2)
            给定一个0～1000的整数，求各位数的和。
            例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
         */
        System.out.println("题目2 (2)");
        int num = (int)(Math.random()*1000);
        int hundred = num / 100;
        int ten = num / 10 % 10;
        int one = num % 10;
        System.out.println(num);
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);
        System.out.println(hundred + ten + one);

        /*
            题目2 (3)
            华氏温度和摄氏温度互相转换，
            从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
            将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行
         */
        System.out.println("题目2 (3)");
        //华氏度 212度
        int fahrenheit_scale1 = 212;
        //摄氏度
        int centigrade1 = (fahrenheit_scale1 - 32) * 5 / 9;
        System.out.println(centigrade1);
        //摄氏度 360度
        int centigrade2 = 360;
        //华氏度
        int fahrenheit_scale2 = centigrade2 * 9 / 5 + 32;
        System.out.println(centigrade2);

        /*
            题目2 (4)
            给定一个任意的大写字母A~Z，转换为小写字母
         */
        // ASCII a = 97, A = 65  两者相差 32
        System.out.println("题目2 (4)");
        char f = 'F';
        System.out.println((char)(f + 32));
    }
}
