package com.epam;

public class Pluming extends Hypermarket {

  private EnumPluming enumPluming;
  private EnumAll enumType = EnumAll.PLUMBING;

  public EnumPluming getEnumPluming() {
    return enumPluming;
  }

  public Pluming(EnumPluming enumPluming) {
    this.enumPluming = enumPluming;
  }

  public void setEnumPluming(EnumPluming enumPluming) {
    this.enumPluming = enumPluming;
  }

  @Override
  public EnumAll getEnumType() {
    return enumType;
  }
}
