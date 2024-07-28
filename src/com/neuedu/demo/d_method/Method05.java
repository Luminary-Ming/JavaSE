package com.neuedu.demo.d_method;

import java.util.Arrays;

public class Method05 {
    // 引用传递（影响实参）
    // 当一个引用类型的变量作为参数传递给方法时，传递的是该变量内存地址的副本，
    // 引用传递中形参实参指向同一个对象，形参的操作会改变实参对象的改变。
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("num的原始状态：" + Arrays.toString(num));  // num的原始状态：[1, 2, 3, 4, 5]
        clear(num);  // 在clear函数中的状态[0, 0, 0, 0, 0]
        System.out.println("num的clear后的状态：" + Arrays.toString(num));  // num的clear后的状态：[0, 0, 0, 0, 0]
    }

    public static void clear(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("在clear函数中的状态" + Arrays.toString(arr));
    }
}
