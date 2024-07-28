package com.neuedu.demo.g_singleton;

public class SingletonTest {
    public static void main(String[] args) {
        MySingleton1 mySingleton1 = MySingleton1.getInstance();
        MySingleton1 mySingleton2 = MySingleton1.getInstance();
        // 因为是单例，两个实例对象一定相同
        System.out.println(mySingleton1 == mySingleton2);  // true
    }
}
