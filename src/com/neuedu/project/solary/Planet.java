package com.neuedu.project.solary;

/**
 * 太阳系行星类型
 */

public class Planet extends AbstractSolarObject {

    /**
     * 行星的序号
     */
    String no;

    /**
     * 行星的名字
     */
    String name;

    /**
     * 椭圆规矩的半长轴
     */
    int longAxis;

    /**
     * 椭圆规矩的半短轴
     */
    int shortAxis;

    double theta;

    /**
     * 单位时间内的速度
     */
    double speed;


    public Planet() {
    }

    public Planet(String no, String name, double au, double e, int t) {
        this.no = no;
        this.name = name;
        this.longAxis = getlongAxisByAu(au);
        this.shortAxis = getshortAxisByE(e);
        this.theta = 0.0;
        this.speed = getSpeedByT(t);

    }

    @Override
    public void move() {
        x = (int) (longAxis * Math.cos(theta));
        y = (int) (shortAxis * Math.sin(theta));
        theta += speed;
        System.out.println("地球的x坐标" + this.x);
        System.out.println("地球的y坐标" + this.y);
    }

    public void run() {
        while (true) {
            move();
        }
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

}
