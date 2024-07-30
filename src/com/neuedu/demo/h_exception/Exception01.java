package com.neuedu.demo.h_exception;

public class Exception01 {
    public static void main(String[] args){
        try {
            int[] a = new int[2];
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界：" + e);  // 数组下标越界：java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        }
        System.out.println("Out of the block");  // Out of the block
    }
}
