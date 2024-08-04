package com.neuedu.zany;

import java.io.IOException;

public class Test1 {
    public float aMethod(float a, float b) throws IOException {
        return 0.5f;
    }
}

class Test2 extends Test1 {
    // 子类的方法访问权限修饰符不能严格于父类
//     float aMethod(float a, float b) {
//        return 0.2f;
//    }

    // 子类方法中声明的异常必须是父类方法中异常的子类
//    public float aMethod(float a, float b) throws Exception{
//        return 0.2f;
//    }
}
