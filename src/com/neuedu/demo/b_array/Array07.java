package com.neuedu.demo.b_array;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        // 数组的复制
        /*
            System.arraycopy( source, srcPos, dest, destPos, length );
            复制source数组中从下标srcPos开始的length个元素到目标数组dest，
            并从目标数组的下标为destPos的位置开始储存。
            其中各个参数的含义如下：
            @source：源数组
            @srcPos：源数组中的起始位置
            @dest：目标数组
            @destPos：目标数组中的起始位置
            @length：要复制的数组元素的个数
        */
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.arraycopy(a, 0, b, 5, 5);
        System.out.println(Arrays.toString(b));
    }
}
