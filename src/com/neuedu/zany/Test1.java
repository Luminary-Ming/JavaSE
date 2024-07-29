package com.neuedu.zany;

import java.io.IOException;

/**
 * 子类继承父类，子类的访问权限修饰符不能严格于父类的访问权限修饰符
 */
public class Test1 {
    public float aMethod(float a, float b) throws IOException {
        return 0.5f;
    }
}

class Test2 extends Test1 {
    /**
     * Test2 的 aMethod 方法访问权限修饰符严格于父类的 aMethod方法 不满足子类继承父类的规则
     */
//    float aMethod(float a, float b) {
//        return 0.2f;
//    }
}


