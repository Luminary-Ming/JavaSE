package com.neuedu.project.solar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

    /**
     * �Զ���һ�����ɴ��ڵķ���
     */
    public void loadFrame() {
        // ����λ��
        this.setLocation(400, 100);
        // ���ڴ�С����ߣ�
        this.setSize(Constant.WINDOW_WIDTH, Constant.WINDOW_HEIGHT);
        // null��Ĭ���������Ļˮƽ�ʹ�ֱ����
        this.setLocationRelativeTo(null);
        // �ɷ����ԣ�Ĭ�� false��
        this.setVisible(true);
        // �ɸı䴰�ڴ�С������ Ĭ����true��
        this.setResizable(false);
        // ���ñ���
        this.setTitle("̫��ϵ�˴������������еĹ켣����\uD83C\uDF0C\uD83C\uDF0C\uD83C\uDF0C");
        // ����logo
        this.setIconImage(ImageUtil.getImage("Earth.v1.0.png"));
        // �����ڲ���
        this.addWindowListener(new WindowAdapter() {
            // �رմ���
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
    }
}
