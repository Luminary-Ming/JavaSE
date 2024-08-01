package com.neuedu.project.solar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

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
        this.setTitle("太阳系八大行星正在运行的轨迹！！\uD83C\uDF0C\uD83C\uDF0C\uD83C\uDF0C");
        // 设置logo
        this.setIconImage(ImageUtil.getImage("Earth.v1.0.png"));
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
    }
}
