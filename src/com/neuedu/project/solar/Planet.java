package com.neuedu.project.solar;

import java.awt.*;

/**
 * 太阳系行星类型
 */

public class Planet extends AbstractSolarObject {

    /**
     * 行星的序号
     */
    private String no;

    /**
     * 行星的名字
     */
    private String name;

    /**
     * 椭圆规矩的半长轴
     */
    private int longAxis;

    /**
     * 椭圆规矩的半短轴
     */
    private int shortAxis;

    private double theta;

    /**
     * 单位时间内的速度
     */
    private double speed;


    public Planet() {
    }

    public Planet(AbstractSolarObject center, String no, String name, double au, double e, int t, String imgName, int width, int height) {
        this.center = center;
        this.img = ImageUtil.getImage(imgName);
        this.width = width;
        this.height = height;

        this.no = no;
        this.name = name;
        this.longAxis = getlongAxisByAu(au);
        this.shortAxis = getshortAxisByE(e) / 2;
        this.theta = 0.0;
        this.speed = getSpeedByT(t);
        this.x = this.center.x + center.width / 2 - this.width + this.longAxis;
        this.y = this.center.y + center.height / 2 - this.height;
    }

    @Override
    public void move() {
        x = (int) (longAxis * Math.cos(theta));
        y = (int) (shortAxis * Math.sin(theta));
        theta += speed;
        System.out.println("地球的x坐标" + this.x);
        System.out.println("地球的y坐标" + this.y);
    }

    public void draw(Graphics g, int width, int height) {
        super.draw(g, this.width, this.height);
        drawTrace(g);
    }

    private void drawTrace(Graphics g) {
        int x = center.x + center.width / 2 - longAxis - 50;
        int y = center.y + center.height / 2 - shortAxis;
        int width = 2 * longAxis + 100;
        int height = 2 * shortAxis;
        g.setColor(Color.WHITE);
        g.drawOval(x, y, width, height);
    }

    public void run() {
        while (true) {
            move();
        }
    }

    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }


    /**
     * @param au 行星距离太阳的天文单位
     * @return 半长轴
     */
    private int getlongAxisByAu(double au) {
        return (int) (au * Constant.RATE);
    }

    /**
     * @param e 行星轨迹的离心率
     * @return 半短轴
     */
    private int getshortAxisByE(double e) {
        return (int) (longAxis * Math.sqrt(1 - Math.pow(e, 2)));
    }

    /**
     * @param t 行星的公转周期（地球日）
     * @return 单位时间线速度方向的改变量
     */
    private double getSpeedByT(int t) {
        return 365.0 / t * 0.1;
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLongAxis() {
        return longAxis;
    }

    public void setLongAxis(int longAxis) {
        this.longAxis = longAxis;
    }

    public int getShortAxis() {
        return shortAxis;
    }

    public void setShortAxis(int shortAxis) {
        this.shortAxis = shortAxis;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
