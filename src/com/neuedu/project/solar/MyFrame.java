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
        new MyThread().start();
    }


    // 解决图片闪烁的问题，用双缓冲方法解决闪烁问题
    Image backImg = null;
    // 重写update()方法，在窗口的里层添加一个虚拟的图片
    public void update(Graphics g){
        if(backImg == null){
            // 如果虚拟图片不存在，创建一个窗口一样大小的图片
            backImg = createImage(Constant.WINDOW_WIDTH,Constant.WINDOW_HEIGHT);
        }
        // 获取到虚拟图片的画笔
        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.GRAY);
        backg.fillRect(0,0,Constant.WINDOW_WIDTH,Constant.WINDOW_HEIGHT);
        backg.setColor(c);
        // 调用虚拟图片的paint()方法，每50ms刷新一次
        paint(backg);
        g.drawImage(backImg,0,0,null);
    }


    /**
     * 创建一个线程内部类
     */
    class MyThread extends Thread{
        public void run(){
            // 无限次调用 move()
            while (true) {
                MyFrame.this.repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }





    public void paint(Graphics g) {
    }
}
