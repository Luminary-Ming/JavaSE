package com.neuedu.task.$2024_07_23;

/**
 * 四级项目6
 * 题目2：定义一个矩形类Rectangle：
 * (1)定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
 * (2)有2个属性：长length、宽width
 * (3)通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
 */
public class Rectangle {
    /**
     * 长度
     */
    int length;
    /**
     * 宽度
     */
    int width;

    /**
     * @param length
     * @param width
     */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.showAll();  // 长为：3 宽为：4 周长是：14 面积是：12
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPer() {
        return (this.length + this.width) * 2;
    }

    public void showAll() {
        System.out.println("长为：" + this.length + " " + "宽为：" + this.width + " " + "周长是：" + getPer() + " " + "面积是：" + getArea());
    }
}
