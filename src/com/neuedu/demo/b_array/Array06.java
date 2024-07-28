package com.neuedu.demo.b_array;

public class Array06 {
    public static void main(String[] args) {
        // 二分查找
        /*
            二分查找的前提是需要查找的数组必须是已排序的，这里实现默认前提为升序。
            查找时将数组分为三部分，依次是中值（所谓的中值就是数组中间位置的那个值）前，中值，中值后；
            将要查找的值和数组中的值进行比较，若小于中值则在中值前面找，若大于中值则在中值后面找，等于中值时直接返回。
            从描述上就可以看出这个算法适合用循环来实现。
        */
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        // 需要查找的值
        int key = 6;
        // 下标
        int index = -1;
        // 最低下标
        int low = 0;
        // 最高下标
        int high = num.length;
        while (high >= low) {
            // 中间下标
            int mid = (low + high) / 2;
            // 如果 key 小于中间值
            if (key < num[mid]) {
                // 最高下标调到中间下标前一个
                high = mid - 1;
                // 如果 key 等于中间值
            } else if (key == num[mid]) {
                index = mid;
                break;
                // key 大于中间值
            } else {
                // 最低下标调到中间下标前一位
                low = mid + 1;
            }
        }
        if (index == -1) {
            System.out.println("数组中不存在元素" + key);
        } else {
            System.out.println("元素" + key + "在数组中的下标是" + index);  // 元素6在数组中的下标是5
        }
    }
}
