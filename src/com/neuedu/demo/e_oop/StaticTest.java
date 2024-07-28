package com.neuedu.demo.e_oop;

public class StaticTest {
    /**
     * static 关键字
     * 可以修饰类，但只能是内部类
     * 1. 成员内部类（ field inner class ）
     * 2. 静态内部类（由 static 关键字修饰的成员内部类）
     * 3. 局部内部类（ local inner class ）
     * 4. 匿名内部类（接口或者抽象类）
     */

    public void aa() {

        /**
         * 局部内部类
         */
        class AA {
        }

    }


    /**
     * 静态内部类
     */
    static class BB {
    }

    /**
     * 成员内部类
     */
    class CC {
    }


}
