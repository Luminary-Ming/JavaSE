package com.neuedu.demo.d_method;

public class Method04 {
    // 值传递（不影响实参）
    // 在方法调用的时候，实参是将自己的一份拷贝赋给形参，在方法内，对该参数值的修改不影响原来的实参。
    // baseValue 的值复制了一份给 value， baseValue 本身数值不变
    public static void updateBaseValue(int value) {
        value = 2 * value;
        System.out.println("value的值是" + value);  // value的值是60
    }

    public static void main(String[] args) {
        int baseValue = 30;
        System.out.println("调用前baseValue的值：" + baseValue);  // 调用前baseValue的值：30
        updateBaseValue(baseValue);
        System.out.println("调用后baseValue的值：" + baseValue);  // 调用后baseValue的值：30

    }
}
