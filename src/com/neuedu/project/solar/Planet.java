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

    /**
     * theta角度
     */
    private double theta;

    /**
     * 单位时间内的速度
     */
    private double speed;

    /**
     * 判断是否是小行星，默认值：false
     */
    private boolean smallPlanet;

    public Planet() {
    }

    public Planet(AbstractSolarObject center, String no, String name, double au, double e
            , int t, String key) {
        this.center = center;
        this.img = ImageUtil.imgMap.get(key);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);

        this.no = no;
        this.name = name;
        this.longAxis = getlongAxisByAu(au);
        this.shortAxis = getshortAxisByE(e) / 2;
        this.theta = 0.0;
        this.speed = getSpeedByT(t);
        this.x = this.center.x + this.center.width / 2 - this.width / 2 + longAxis;
        this.y = this.center.y + this.center.height / 2 - this.height / 2;
    }

    public Planet(AbstractSolarObject center, String no, String name, double au, double e
            , int t, String key, boolean smallPlanet) {
        this(center, no, name, au, e, t, key);
        this.smallPlanet = smallPlanet;
    }

    @Override
    public void move() {
        x = (int) (longAxis * Math.cos(theta) + this.center.x + this.center.width / 2 - this.width / 2);
        y = (int) (shortAxis * Math.sin(theta) + this.center.y + this.center.height / 2 - this.height / 2);
        theta += speed;
        //System.out.println("地球的x坐标" + this.x);
        // System.out.println("地球的y坐标" + this.y);
    }

    public void draw(Graphics g) {
        if (!smallPlanet) {
            drawTrace(g);
        }
        super.draw(g);
        move();

    }

    private void drawTrace(Graphics g) {
        int x = center.x + center.width / 2 - longAxis;
        int y = center.y + center.height / 2 - shortAxis;
        int width = 2 * longAxis;
        int height = 2 * shortAxis;
        g.setColor(Color.WHITE);
        g.drawOval(x, y, width, height);
        g.drawRect(this.x, this.y, this.width, this.height);
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
        return 365.0 / t * Constant.SPEED_RATH;
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
