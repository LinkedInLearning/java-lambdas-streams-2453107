package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {

  public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
    return planets.stream()
            .filter(planet -> planet.getName().startsWith("M"))
            .collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithRings(List<Planet> planets) {
    return null;
  }

  public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
    return null;
  }

  public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
    return null;
  }

}
