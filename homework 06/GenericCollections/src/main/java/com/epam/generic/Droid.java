package com.epam.generic;


public class Droid extends Ship<Droid> implements Comparable<Droid> {

  private int health;
  private String name;


  public Droid(int health, String name) {
    this.health = health;
    this.name = name;
  }


  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int compareTo(Droid o) {
    if (this.equals(o)) {
      return 0;
    } else if (getHealth() > o.getHealth()) {
      return 1;
    } else {
      return -1;
    }
  }

  @Override
  public String toString() {
    return "Droid{" + "health=" + health + ", name='" + name + '\'' + '}';
  }
}
