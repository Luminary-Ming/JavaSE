package com.neuedu.demo.e_oop;

import java.util.Arrays;

public class FinalTest {
    /**
     * final 关键字
     * 1. 修饰的变量为常量，不能被二次赋值
     * 2. 修饰的类不能被子类继承
     * 3. 修饰的方法不能被子类重写
     */
    // 数组 arr 不能被二次赋值，但是数组 arr 里的元素可以被再次赋值
    public final int[] arr = {1, 2, 3, 4, 5};

    public FinalTest() {
    }

    public void aa() {
        // 数组元素被二次赋值
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        new FinalTest().aa();  // [100, 2, 3, 4, 5]
    }
}
