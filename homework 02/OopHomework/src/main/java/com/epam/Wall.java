package com.epam;

public class Wall extends Hypermarket {
  private EnumWall enumWall;
  private EnumAll enumAll = EnumAll.WALL;

  public EnumWall getEnumWall() {
    return enumWall;
  }

  public Wall(EnumWall enumWall) {
    this.enumWall = enumWall;
  }

  public void setEnumWall(EnumWall enumWall) {
    this.enumWall = enumWall;
  }


  @Override
  public EnumAll getEnumType() {
    return enumAll;
  }
}
