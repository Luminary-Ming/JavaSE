package com.neuedu.project.solary;

public class SolarSystemClient {
    public static void main(String[] args) {
        Sun sun = new Sun(500, 800);
        System.out.println(sun.x);
        Planet earth = new Planet("3", "地球", 1, 0.0167, 365);
        earth.run();
    }
}
