package com.neuedu.demo.g_singleton;

/**
 * 单例特点：
 * 1. 构造方法私有：不允许外界创建对象
 * 2. 拥有一个静态的该类实例对象
 * 3. 对外提供一个全局 public 的创建对象的访问方法
 *
 *  饿汉式单例
 */

public class MySingleton1 {
    // 静态的该类实例对象
    private static MySingleton1 mySingleton = new MySingleton1();

    // 私有构造方法
    private MySingleton1(){}

    // 对外提供一个全局 public 的创建对象的访问方法
    public static MySingleton1 getInstance(){
        return mySingleton;
    }

}
