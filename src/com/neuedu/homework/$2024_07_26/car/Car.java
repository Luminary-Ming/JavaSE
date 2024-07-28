package com.neuedu.homework.$2024_07_26.car;

public class Car extends Vehicle {

    /**
     * 轿车载人数
     */
    private int loader;

    /**
     * @param brand  汽车品牌
     * @param color  汽车颜色
     * @param loader 汽车载人数
     */
    public Car(String brand, String color, int loader) {
        super(brand, color);
        this.loader = loader;
    }

    public void run() {
        System.out.println("颜色为" + getColor() + "的" + getBrand() + "，载人数是" + getLoader() + "正在赛道上飞驰！");
    }


    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
}
