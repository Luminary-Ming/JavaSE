package com.neuedu.demo.e_oop;

public class Ex {

    public static void main(String[] args) {
        BB b = new BB(5);
    }
}

class AA {
    int a;
    public AA(){
        System.out.println("AA无参构造方法");
    }
    public AA(int a) {
        this.a = a;
        System.out.println("AA有参构造方法");
    }
}

class BB extends AA {
    public BB(int a) {
        // 这里默认会有一个
        // super();
        System.out.println("BB有参构造方法");
    }
}
// 输出：
// AA无参构造方法
// BB无参构造方法