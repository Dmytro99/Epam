package com.epam;

public class PaintAndVarnish extends Hypermarket {

  private EnumPaintAndVarnish enumPaintAndVarnish;
  private EnumAll enumAll = EnumAll.PAINT_AND_VARNISH;

  public PaintAndVarnish(EnumPaintAndVarnish enumPaintAndVarnish) {
    this.enumPaintAndVarnish = enumPaintAndVarnish;
  }

  public EnumPaintAndVarnish getEnumPaintAndVarnish() {
    return enumPaintAndVarnish;
  }

  public void setEnumPaintAndVarnish(EnumPaintAndVarnish enumPaintAndVarnish) {
    this.enumPaintAndVarnish = enumPaintAndVarnish;
  }

  @Override
  public EnumAll getEnumType() {
    return enumAll;
  }
}
