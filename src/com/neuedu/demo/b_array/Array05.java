package com.neuedu.demo.b_array;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args){
        // 输入6个整数，找出最大值和最大值出现的次数
        Scanner ming = new Scanner(System.in);
        System.out.println("请输入6个整数");
        int[] array= new int[6];
        for(int i = 0;i<array.length;i++){
            System.out.println("请输入第"+(i+1)+"个整数");
            array[i] = ming.nextInt();
        }
        java.util.Arrays.sort(array);
        int max = array[5];
        int count = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i] == max){
                count++;
            }
        }
        System.out.println("最大值是"+max+"，出现的次数是"+count);
    }
}
