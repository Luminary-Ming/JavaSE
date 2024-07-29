package com.neuedu.zany;

/**
 * static 修饰的静态变量被所有实例（对象）共享
 */
public class StaticFoo {
    // 成员变量
    int num;
    // 静态变量
    static int x;

    public static void main(String[] args) {
        StaticFoo foo1 = new StaticFoo();
        foo1.num++;
        foo1.x++;
        StaticFoo foo2 = new StaticFoo();
        foo2.num--;
        foo2.x++;
        StaticFoo foo3 = new StaticFoo();
        foo3.num++;
        foo3.x++;
        StaticFoo.x++;
        System.out.println(foo2.num);  // -1
        System.out.println(foo3.num);  // 1
        System.out.println(foo3.x);  // 4
    }
}
/**
 * static 修饰的静态变量被所有实例（对象）共享，因此 x 不断变化；
 * 而 num 是成员变量，成员变量随着对象的创建而存在，随着对象的回收而释放。
 */