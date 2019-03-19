package com.epam.generic;

import static com.epam.generic.List_Integer_Include_String.addToList;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Menu {

  private boolean exit;


  private void setExit() {
    System.exit(0);
  }

  private void printHeader() {
    System.out.println("*----------------------------------------------------------*");
    System.out.println("|                          MENU                            |");

  }

  private void printMenu() {
    System.out.print("*----------------------------------------------------------*");
    System.out.println("\n| 1. To get one of droids from the ship                    |");
    System.out.println("| 2. Show sort generic by priority queue                   |");
    System.out.println("| 3.Show String in List<Integer>... and yes it is possible |");
    System.out.println("| 0. Exit                                                  |");
    System.out.println("*----------------------------------------------------------*");
  }

  public void runMenu() {
    printHeader();
    while (!exit) {
      printMenu();
      System.out.print("\nMake your choice :");
      int choice = getInput();
      System.out.println();
      performAction(choice);
      getInput();


    }
  }

  private int getInput() {
    Scanner sc = new Scanner(System.in, "UTF-8");
    int choice = -1;
    while (choice < 0 || choice > 3) {
      try {
        choice = Integer.parseInt(sc.nextLine());

      } catch (NumberFormatException e) {
        System.out.print("Opss...");
        System.out.println("We haven't this option \nPlease try again...\n");
        runMenu();
      }

    }
    return choice;
  }

  private void getDroid() {
    Ship ship = new Ship();
    List<Ship<Droid>> shipList = new ArrayList<Ship<Droid>>();
    shipList.add(0, new Droid(800, "Super Droid"));
    shipList.add(1, new Droid(1000, "Monster Droid"));
    shipList.add(2, new Droid(300, "Weak Droid"));
    shipList.add(3, new Droid(500, "Strong Droid"));

    System.out.println(shipList.get(1));

    ship.setListAll(shipList);
    ship.getListAll();
    System.out.println(ship);
    System.out.println();
  }


  private void performAction(final int choice) {
    switch (choice) {
      case 0:
        exit = true;
        System.out.println("Thank you for using application :) \n");
        setExit();
        break;
      case 1:
        getDroid();
        System.out.println();
        runMenu();
        break;
      case 2:
        sortPQueue();
        System.out.println();
        runMenu();
        break;
      case 3:
        showList();
        System.out.println();
        runMenu();
        break;

      default:
        System.out.println("Something wrong!");
    }
  }

  private void sortPQueue() {
    Droid StrongDroid = new Droid(500, "Strong Droid");
    Droid MonsterDroid = new Droid(1000, "Monster Droid");
    Droid WeakDroid = new Droid(300, "Weak Droid");
    Droid SuperDroid = new Droid(800, "Super Droid ");

    PriorityQueue<Droid> pQueue = new PriorityQueue<Droid>();
    pQueue.add(StrongDroid);
    pQueue.add(SuperDroid);
    pQueue.add(WeakDroid);
    pQueue.add(MonsterDroid);
    int count = 1;
    while (!pQueue.isEmpty()) {
      System.out.println("Priority Queue" + pQueue.remove());
      count++;
    }
  }

  private void showList() {

    System.out.println();
    List<Integer> list = new ArrayList<Integer>();
    addToList(list);
    System.out.println(list);

  }
}
