package com.neuedu.demo.d_method;

public class Method06 {
    // 方法的重载
    /*
       方法重载的规则：
        1. 在同一个类的内部
        2. 方法名称相同
        3. 方法的参数列表不同：顺序（数据类型的顺序）、个数、数据类型
        4. 与方法的返回值类型、方法修饰符和控制符无关
    */
    public static void main(String[] args) {
        // 1-100 的和
        System.out.println(getSum(100));  // 4950
        // 100-1000 的和
        System.out.println(getSum(100,1000));  // 494550
    }

    // 计算1到end之间的累加和
    public static int getSum(int end) {
        int sum = 0;
        for (int i = 1; i < end; i++) {
            sum += i;
        }
        return sum;
    }

    // 计算从start到end之间的累加和
    public static int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void bubbleSort(){

    }


}
