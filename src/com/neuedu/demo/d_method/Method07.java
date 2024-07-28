package com.neuedu.demo.d_method;

/**
 * 课上练习：求圆的周长和面积
 */
public class Method07 {
    public static void main(String[] args) {
        System.out.println(c(2));
        System.out.println(s(2));
    }

    /**
     * @param r 半径
     * @return 周长
     */
    public static String c(double r) {
        return "圆的周长为：" + 2 * Math.PI * r;
    }

    /**
     * @param r 半径
     * @return 面积
     */
    public static String s(double r) {
        return "圆的面积：" + Math.PI * Math.pow(r, 2);
    }
}
