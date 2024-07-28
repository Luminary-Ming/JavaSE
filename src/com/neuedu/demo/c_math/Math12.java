package com.neuedu.demo.c_math;

public class Math12 {
    public static void main(String[] args){
        // 水仙花数的求解
        for(int i = 100; i <1000; i++){
            // 拆分个位数字
            int a = i % 10;
            // 拆分十位数字
            int b = (i / 10) % 10;
            // 拆分百位数字
            int c = i / 100;
            // 判断立方和是否等于自身
            if (a * a * a + b * b * b + c * c * c == i){
                System.out.println(i);
            }
        }
    }
}
