package com.epam.generic;

import java.util.ArrayList;
import java.util.List;

public class Ship<T extends Droid> {

  List<? extends Droid> listAll = new ArrayList<Droid>();

  public void setListAll(List<? extends Droid> listAll) {
    this.listAll = listAll;
  }


  public List<? extends Droid> getListAll() {
    return listAll;
  }


  @Override
  public String toString() {
    return "Ship{" + "listAll=" + listAll + '}';
  }
}


