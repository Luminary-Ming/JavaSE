package com.neuedu.project.solar;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SolarSystemClient extends MyFrame {

    Background background = new Background("bg");
    static Sun sun = new Sun("Sun");
    Planet mercury = new Planet(sun, "1", "水星", 0.387, 0.2056, 88, "Mercury");
    Planet venus = new Planet(sun, "2", "金星", 0.72, 0.0068, 225, "Venus");
    Planet earth = new Planet(sun, "3", "地球", 1.0, 0.167, 365, "Earth");
    Planet moon = new Planet(earth, "100", "月亮", 0.3, 0, 365 / 12, "Moon");
    Planet mars = new Planet(sun, "4", "火星", 1.52, 0.0934, 687, "Mars");


    static List<Planet> smallPlanets = new ArrayList<>();

    static {
        int n = 9999;
        for (int i = 0; i < n; i++) {
            double au = Math.random() * 3 + 2;
            int t = (int) (Math.random() * 3300 + 700);
            Planet smallPlanet = new Planet(sun, "", "小行星", au, 0, t, "smallPlanet", true);
            smallPlanets.add(smallPlanet);
        }
    }


    Planet jupiter = new Planet(sun, "5", "木星", 5.2, 0.0489, 4330, "Jupiter");
    Planet saturn = new Planet(sun, "6", "土星", 9.54, 0.0557, 10832, "Saturn");
    Planet uranus = new Planet(sun, "7", "天王星", 19.218, 0.0444, 30777, "Uranus");
    Planet neptune = new Planet(sun, "8", "海王星", 30.06, 0.0112, 60328, "Neptune");


    public void paint(Graphics g) {
        background.draw(g);
        sun.draw(g);
        mercury.draw(g);
        venus.draw(g);
        earth.draw(g);
        moon.draw(g);
        mars.draw(g);

        for (Planet smPlanet : smallPlanets) {
            smPlanet.draw(g);
        }

        jupiter.draw(g);
        saturn.draw(g);
        uranus.draw(g);
        neptune.draw(g);

    }


    public static void main(String[] args) {
        new SolarSystemClient().loadFrame();
    }
}
