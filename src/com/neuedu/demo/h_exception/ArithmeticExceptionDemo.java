package com.neuedu.demo.h_exception;

import java.io.IOException;
import java.util.Scanner;


public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("java A ");
        String line = scanner.nextLine();
        try {
            // 如果为空
            if (line.isEmpty()) {
                // TODO throw语句后不允许有其他语句（因为这些语句没有机会执行）
                throw new ArrayIndexOutOfBoundsException();
            }
            // 根据空格符分成两个部分存放到数组
            String[] lines = line.split(" ");
            // 将字符串强转为 int 类型
            int num1 = Integer.parseInt(lines[0]);
            int num2 = Integer.parseInt(lines[1]);
            int result = num1 / num2;
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("总是被执行");
        }
    }
}