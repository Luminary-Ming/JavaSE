package com.neuedu.demo.c_math;

public class Math03 {
    public static void main(String[] args) {
        char ch2 = '\u03A6';
        System.out.println(ch2);
        //课上练习
        int h = 384;
        // 定义常量
        final double G = 9.8;
        double m = 0.183;
        //Math.sqrt() 开根号
        double t = Math.sqrt( 2 * h / G );
        double v = G * t;
        //到地面高度为0，重力势能为0
        double Ep = 0;
        //动能
        //Math.pow() 平方根
        double Ek = 1.0/2 * m * Math.pow(v,2);
        System.out.println(t);
        System.out.println(Ep);
        System.out.println(Ek);
    }
}
