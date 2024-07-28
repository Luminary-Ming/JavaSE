package com.neuedu.homework.$2024_07_23;

/**
 * 06. 面向对象基础课后编程题
 * 03. 定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
 * (1)无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
 * (2) 输出笔记本信息的方法
 * 然后编写一个测试类，测试笔记本类的各个方法。
 */
public class NotebookComputer {
    /**
     * 笔记本颜色
     */
    char color;
    /**
     * 笔记本型号
     */
    int cpuModel;

    /**
     * 无参的构造方法
     */
    public NotebookComputer() {
    }

    /**
     * 根据笔记本颜色、型号构造笔记本电脑对象
     *
     * @param color    笔记本颜色
     * @param cpuModel 笔记本型号
     */
    public NotebookComputer(char color, int cpuModel) {
        this.color = color;
        this.cpuModel = cpuModel;
    }

    public static void main(String[] args) {
        NotebookComputer notebookComputer = new NotebookComputer('A', 2243);
        notebookComputer.printInformation();  // 笔记本的颜色是：A	笔记本的型号是：2243

    }

    /**
     * 输出笔记本电脑信息的方法
     */
    public void printInformation() {
        System.out.println("笔记本的颜色是：" + this.color + "\t" + "笔记本的型号是：" + this.cpuModel);
    }
}
