package com.neuedu.demo.g_singleton;

/**
 * 懒汉式单例
 */
public class MySingleton2 {
    private static MySingleton2 mySingleton;

    private MySingleton2(){}

    public static MySingleton2 getInstance(){
        if(mySingleton == null){
            mySingleton = new MySingleton2();
        }
        return mySingleton;
    }
}
