package com.neuedu.demo.i_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        // 创建一个 ArrayList对象（面向接口编程）
        // <Object> 钻石运算符（泛型）
        List<User> list = new ArrayList<>();
        list.add(new User(1, "牧之原翔子", "女"));
        list.add(new User(2, "樱岛麻衣", "女"));
        list.add(new User(3, "星野爱", "女"));
        System.out.println(list);
        // 容器的元素个数
        System.out.println(list.size());
        /**
         * 4 种输出容器元素的方式
         */
        // 01. for 遍历容器
        for (int i = 0; i < list.size(); i++) {
            // get(int index) 通过索引值获取 arraylist 中的元素
            User user = list.get(i);
            System.out.println(user);
        }

        // 02. 增强 for
        for (User user : list) {
            System.out.println(user);
        }

        // 03. 迭代器
        Iterator<User> iterator = list.iterator();
        // 如果迭代器中有下一元素
        while (iterator.hasNext()) {
            // 取出下一元素
            User user = iterator.next();
            System.out.println(user);
        }

        // 04. JDK8+中的 lambda表达式
        list.forEach(System.out::println);
    }
}
