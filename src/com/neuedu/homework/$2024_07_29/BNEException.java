package com.neuedu.homework.$2024_07_29;

/**
 * 08.异常处理
 * 自定义异常类 BNEException。编写帐户类Account，属性包括帐号和余额；方法包括存钱方法save(double d)，增加收入后，
 * 打印输出余额；取钱方法pay(double d)，减少收入后，打印输出余额，当余额小于0时，抛出余额不足的异常BNEException。
 * 编写测试类，创建Account的对象，并且调用该对象的save和pay方法。
 */
public class BNEException extends Exception{
    public BNEException() {
    }

    public BNEException(String message) {
        super(message);
    }
}
