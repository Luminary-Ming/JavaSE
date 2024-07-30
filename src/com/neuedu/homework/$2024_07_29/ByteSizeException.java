package com.neuedu.homework.$2024_07_29;

/**
 * 编写一个检查给定的数字的数据类型是否为byte的程序，如果此数字超出byte数据类型表示的数的范围，
 * 则引发用户自定义的异常ByteSizeException,并显示相应的错误信息
 * •步骤1：创建用户自定义异常类ByteSizeException
 * •步骤2：在main方法中编写逻辑代码
 * •步骤3：运行并测试
 */
public class ByteSizeException extends Exception {
    public ByteSizeException() {
    }

    public ByteSizeException(String message) {
        super(message);
    }
}
