package com.neuedu.project.solar;


import java.awt.*;

public class SolarSystemClient extends MyFrame {

    Background background = new Background("bg.v1.0.png", 1920, 1080);
    Sun sun = new Sun("Sun.v1.0.png", 50, 50);
    Planet mercury = new Planet(sun, "1", "水星", 0.387, 0.2056, 88, "Mercury.v1.0.png", 50, 30);
    Planet venus = new Planet(sun, "2", "金星", 0.72, 0.0068, 225, "Venus.v1.0.png", 50, 50);
    Planet earth = new Planet(sun, "3", "地球", 1.0, 0.167, 365, "Earth.v1.0.png", 90, 60);
    Planet mars = new Planet(sun, "4", "火星", 1.52, 0.0934, 687, "Mars.v1.0.png", 70, 40);
    Planet jupiter = new Planet(sun, "5", "木星", 5.2, 0.0489, 4330, "Jupiter.v1.0.png", 300, 300);
    Planet saturn = new Planet(sun, "6", "土星", 9.54, 0.0557, 10832, "Saturn.v1.0.png", 500, 500);
    Planet uranus = new Planet(sun, "7", "天王星", 19.218, 0.0444, 30777, "Uranus.v1.0.png", 102, 102);
    Planet neptune = new Planet(sun, "8", "海王星", 30.06, 0.0112, 60328, "Neptune.v1.0.png", 99, 99);


    public void paint(Graphics g) {
        background.draw(g, background.width, background.height);
        sun.draw(g, sun.width, sun.height);
        mercury.draw(g, mercury.width, mercury.height);
        venus.draw(g, venus.width, venus.height);
        earth.draw(g, earth.width, earth.height);
        mars.draw(g, mars.width, mars.height);
        jupiter.draw(g, jupiter.width, jupiter.height);
        saturn.draw(g, saturn.width, saturn.height);
        uranus.draw(g, uranus.width, uranus.height);
        neptune.draw(g, neptune.width, neptune.height);

        mercury.move(60, 8);
        venus.move(70,20);
        earth.move(-205,30);
        mars.move(-40,90);
        jupiter.move(-600,-100);
        saturn.move(60,-20);
        uranus.move(50,50);
        neptune.move(50,50);
    }

    public static void main(String[] args) {
        new SolarSystemClient().loadFrame();
    }
}
