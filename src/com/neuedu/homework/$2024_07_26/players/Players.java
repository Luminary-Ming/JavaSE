package com.neuedu.homework.$2024_07_26.players;

/**
 * 07. 面向对象高级特效课后编程题
 * 01. 创建一个球员类，并且该类最多只允许创建十一个对象。提示利用 static 和封装性来完成。
 */
public class Players {

    /**
     * 创建对象的次数
     */
    public static int count = 0;

    /**
     * 私有的构造方法，不允许外界随意创建对象
     */
    private Players() {
        // 每创建一个对象次数 +1
        count++;
    }

    /**
     * 提供其他类获取对象的方法
     *
     * @return Players类的一个对象
     */
    public static Players create() {
        return new Players();
    }


}

// 测试类
class PlayersTest {
    public static void main(String[] args) {
        // 循环创建对象
        while (true) {
            System.out.println("创建了一个对象！");
            // 调用获取对象的方法
            Players.create();
            // 创建对象次数等于 11 时跳出循环
            if (Players.count == 11) {
                System.out.println("sorry！你已经创建了11个对象了，不能再继续创建对象。");
                break;
            }
        }
    }
}
/*
    输出：
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    创建了一个对象！
    sorry！你已经创建了11个对象了，不能再继续创建对象。
 */
