package com.neuedu.project.solar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest extends Frame {

    /**
     * 自定义一个生成窗口的方法
     */
    public void loadFrame() {
        // 窗口位置
        this.setLocation(400, 100);
        // 窗口大小（宽高）
        this.setSize(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
        // null：默认相对于屏幕水平和垂直居中
        this.setLocationRelativeTo(null);
        // 可访问性（默认 false）
        this.setVisible(true);
        // 可改变窗口大小（伸缩 默认是true）
        this.setResizable(false);
        // 设置标题
        this.setTitle("太阳系八大行星运行轨迹！！\uD83C\uDF0C\uD83C\uDF0C\uD83C\uDF0C");
        // 设置logo

        // 匿名内部类
        this.addWindowListener(new WindowAdapter() {
            // 关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;// 转换为Graphics2D类型
        String value = "张金龙";// 绘制的文本
        int x = 15; // 文本位置的横坐标
        int y = 60; // 文本位置的纵坐标
        Font font = new Font("楷体", Font.BOLD, 60); // 创建字体对象
        g2.setFont(font); // 设置字体
        // 创建循环渐变的GraphientPaint对象
        GradientPaint paint = new GradientPaint(20, 20, Color.BLUE, 100, 120, Color.RED, true);
        g2.setPaint(paint);// 设置渐变
        g2.drawString(value, x, y); // 绘制文本

       /* font = new Font("华文行楷", Font.BOLD, 60); // 创建新的字体对象
        g2.setFont(font); // 设置字体
        x = 80; // 文本位置的横坐标
        y = 130; // 文本位置的纵坐标
        value = "编程词典";// 绘制的文本
        g2.drawString(value, x, y); // 绘制文本*/
    }


    public static void main(String[] args) {
        new FrameTest().loadFrame();


    }
}