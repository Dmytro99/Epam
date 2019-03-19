package com.epam.rumor;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) throws Exception {
    Rumor rumor = new Rumor();
    try {
      rumor.rumorActions();
    } catch (Exception e) {
      System.out.println("\n!!!Number of guests should be > 2!!! \nPlease try again\n");
      rumor.rumorActions();
    }

  }


}
