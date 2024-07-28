package com.neuedu.demo.g_singleton;

/**
 * 单例特点：
 * 1. 只有一个实例
 * 2. 构造方法私有：不允许外界创建对象
 * 3. 拥有一个静态的该类实例对象
 * 4. 对外提供一个全局 public 的创建对象的访问方法
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    //获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}


class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();  // Hello World!
    }

}
