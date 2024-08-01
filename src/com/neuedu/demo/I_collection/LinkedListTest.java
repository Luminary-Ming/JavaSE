package com.neuedu.demo.I_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        int time = 100000;
        getTimeMillisByArrayList(time);   // 使用ArrayList向结尾位置添加了1000000条数据消耗47388ms
        getTimeMillisByLinkedList(time);  // 使用LinkedList向结尾位置添加了1000000条数据消耗154ms
    }

    /**
     * 通过 ArrayList 测试添加数据的时间
     *
     * @param n n条数据
     */
    public static void getTimeMillisByArrayList(int n) {
        // 获取当前系统时间的毫秒数
        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }
        // 获取遍历完当前系统时间的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("使用ArrayList向结尾位置添加了" + n + "条数据消耗" + (end - start) + "ms");
    }

    /**
     * 通过 LinkedList 测试添加数据的时间
     *
     * @param n n条数据
     */
    public static void getTimeMillisByLinkedList(int n) {
        // 获取当前系统时间的毫秒数
        long start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.addFirst(i);
        }
        // 获取遍历完当前系统时间的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("使用LinkedList向结尾位置添加了" + n + "条数据消耗" + (end - start) + "ms");
    }
}
/**
 * 在数组中间插入或删除元素时： LinkedList 最快
 * 在数组首尾增删元素时： ArrayList 最快
 */