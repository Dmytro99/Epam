package com.epam;

public class Furniture extends Hypermarket {

  private EnumAll enumAll = EnumAll.FURNITURE;
  private EnumFurniture enumFurniture;

  public Furniture(EnumFurniture enumFurniture) {
    this.enumFurniture = enumFurniture;
  }


  public EnumFurniture getEnumFurniture() {
    return enumFurniture;
  }


  public void setEnumFurniture(EnumFurniture enumFurniture) {
    this.enumFurniture = enumFurniture;
  }

  @Override
  public EnumAll getEnumType() {
    return enumAll;
  }
}
