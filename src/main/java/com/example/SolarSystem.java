package com.example;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

  public static List<Planet> getPlanets() {
    List<Planet> planets = new ArrayList<>();
    Planet mercury = new Planet("Mercury");
    mercury.setDensity(5.43);
    mercury.setHasRings(false);
    mercury.setNumberOfMoons(0);

    Planet venus = new Planet("Venus");
    venus.setDensity(5.24);
    venus.setHasRings(false);
    venus.setNumberOfMoons(0);

    Planet earth = new Planet("Earth");
    earth.setDensity(5.52);
    earth.setHasRings(false);
    earth.setNumberOfMoons(1);

    Planet mars = new Planet("Mars");
    mars.setDensity(3.940);
    mars.setHasRings(false);
    mars.setNumberOfMoons(2);

    Planet jupiter = new Planet("Jupiter");
    jupiter.setDensity(1.33);
    jupiter.setHasRings(true);
    jupiter.setNumberOfMoons(80);

    Planet saturn = new Planet("Saturn");
    saturn.setDensity(0.70);
    saturn.setHasRings(true);
    saturn.setNumberOfMoons(83);

    Planet uranus = new Planet("Uranus");
    uranus.setDensity(1.30);
    uranus.setHasRings(true);
    uranus.setNumberOfMoons(27);

    Planet neptune = new Planet("Neptune");
    neptune.setDensity(1.76);
    neptune.setHasRings(true);
    neptune.setNumberOfMoons(14);

    planets.add(mercury);
    planets.add(venus);
    planets.add(earth);
    planets.add(mars);
    planets.add(jupiter);
    planets.add(saturn);
    planets.add(uranus);
    planets.add(neptune);

    return planets;
  }

}
