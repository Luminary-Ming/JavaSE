package com.neuedu.test;


public class Main {

        public  static  void  main(String args[]){

            int x=4;

            double a = 99.9;
            int b  = 9;   //三元表达式中，数据类型的变量与未定义变量的数值，结果自动转换为精度高的
            System.out.println("value  is  "+ ((x>4) ? a : b));
        }
    }









