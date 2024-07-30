package com.neuedu.homework.$2024_07_29;

import java.util.Scanner;

public class ByteTest {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        try{
            int num = scanner.nextInt();
            if (num > 127 || num < -128) {
                throw new ByteSizeException("超出byte数据类型表示的数的范围！");
            }
        }catch(ByteSizeException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
