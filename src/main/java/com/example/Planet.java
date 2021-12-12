package com.example;

public class Planet {

  private String name;
  private double density;
  private boolean hasRings;
  private int numberOfMoons;

  public Planet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDensity() {
    return density;
  }

  public void setDensity(double density) {
    this.density = density;
  }

  public boolean getHasRings() {
    return hasRings;
  }

  public void setHasRings(boolean hasRings) {
    this.hasRings = hasRings;
  }

  public int getNumberOfMoons() {
    return numberOfMoons;
  }

  public void setNumberOfMoons(int numberOfMoons) {
    this.numberOfMoons = numberOfMoons;
  }
}
