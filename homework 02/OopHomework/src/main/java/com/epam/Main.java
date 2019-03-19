package com.epam;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  private boolean exit;


  public static void main(String[] args) {

    Main menu = new Main();
    menu.runMenu();
  }


  private void setExit() {
    System.exit(0);
  }

  private void printHeader() {
    System.out.println("*-----------------------------*");
    System.out.println("|             MENU            |");

  }

  private void printMenu() {
    System.out.print("*-----------------------------*");
    System.out.println("\n| 1. Show all departments     |");
    System.out.println("| 2. Show furniture           |");
    System.out.println("| 3. Show wall                |");
    System.out.println("| 4. Show plumbing            |");
    System.out.println("| 5. Show paint and varnish   |");
    System.out.println("| 0. Exit                     |");
    System.out.println("*-----------------------------*");
  }

  private void runMenu() {
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
    while (choice < 0 || choice > 6) {
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

  private void showDepartments() {
    List<String> departments = new ArrayList<>();
    departments.add("1. Furniture");
    departments.add("2. Plumbing");
    departments.add("3. Wall");
    departments.add("4. Paint and varnish");

    for (String result : departments) {
      System.out.println(result);
    }

  }


  private void showFurniture() {
    List<Hypermarket> list;
    list = new ArrayList<>();

    Hypermarket furniture = new Furniture(EnumFurniture.BED);
    furniture.setPrice(1500);
    furniture.setId(10785);
    furniture.setCountry("Poland ");
    furniture.setType("bed     ");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.BED);
    furniture.setPrice(1900);
    furniture.setId(10586);
    furniture.setCountry("Germany");
    furniture.setType("bed     ");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.BENCH);
    furniture.setPrice(1600);
    furniture.setId(12636);
    furniture.setCountry("Italy  ");
    furniture.setType("bench   ");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.BENCH);
    furniture.setPrice(1950);
    furniture.setId(12286);
    furniture.setCountry("Ukraine");
    furniture.setType("bench   ");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.BOOKCASE);
    furniture.setPrice(2500);
    furniture.setId(25636);
    furniture.setCountry("Norway ");
    furniture.setType("bookcase");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.BOOKCASE);
    furniture.setPrice(1600);
    furniture.setId(12236);
    furniture.setCountry("USA    ");
    furniture.setType("bookcase");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.CUPBOARD);
    furniture.setPrice(1350);
    furniture.setId(12266);
    furniture.setCountry("Poland ");
    furniture.setType("cupboard");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.DOOR);
    furniture.setPrice(2200);
    furniture.setId(15636);
    furniture.setCountry("Russia ");
    furniture.setType("door     ");
    list.add(furniture);
    furniture = new Furniture(EnumFurniture.DOOR);
    furniture.setPrice(2800);
    furniture.setId(15566);
    furniture.setCountry("China  ");
    furniture.setType("door    ");
    list.add(furniture);
    Collections.sort(list, new Comparator<Hypermarket>() {
      public int compare(Hypermarket o1, Hypermarket o2) {
        return o1.getPrice() - o2.getPrice();
      }
    });

    List<Hypermarket> result = new ArrayList<>();
    list.stream().filter((goodList) -> ((goodList.getEnumType() == EnumAll.FURNITURE)))
        .forEachOrdered((goodList) -> {
          result.add(goodList);
        });

    for (Hypermarket hypermarket : result) {
      System.out.print("deparnment : " + hypermarket.getEnumType());
      System.out.print("\t\ttype : " + hypermarket.getType());
      System.out.print(" \t\tcountry : " + hypermarket.getCountry());
      System.out.print(" \t\tprice : " + hypermarket.getPrice());
      System.out.print(" \t\tid :" + hypermarket.getId());
      System.out.println();
    }

  }

  private void showPlumbing() {
    List<Hypermarket> list;
    list = new ArrayList<>();
    Hypermarket pluming = new Pluming(EnumPluming.BATH);
    pluming.setPrice(3500);
    pluming.setId(11166);
    pluming.setCountry("Germany");
    pluming.setType("bath  ");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.BATH);
    pluming.setPrice(4750);
    pluming.setId(15666);
    pluming.setCountry("France ");
    pluming.setType("bath  ");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.BOWL);
    pluming.setPrice(3750);
    pluming.setId(18566);
    pluming.setCountry("USA    ");
    pluming.setType("bowl  ");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.BOWL);
    pluming.setPrice(1750);
    pluming.setId(16516);
    pluming.setCountry("Canada ");
    pluming.setType("bowl  ");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.SHOWER);
    pluming.setPrice(4050);
    pluming.setId(11526);
    pluming.setCountry("Norway ");
    pluming.setType("shower");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.SINK);
    pluming.setPrice(2650);
    pluming.setId(11256);
    pluming.setCountry("Belarus");
    pluming.setType("sink  ");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.TAP);
    pluming.setPrice(1000);
    pluming.setId(18456);
    pluming.setCountry("Poland ");
    pluming.setType("tap   ");
    list.add(pluming);
    pluming = new Pluming(EnumPluming.TAP);
    pluming.setPrice(1020);
    pluming.setId(18555);
    pluming.setCountry("Ukraine");
    pluming.setType("tap   ");
    list.add(pluming);

    Collections.sort(list, new Comparator<Hypermarket>() {
      public int compare(Hypermarket o1, Hypermarket o2) {
        return o1.getPrice() - o2.getPrice();
      }
    });

    List<Hypermarket> result = new ArrayList<>();
    list.stream().filter((goodList) -> ((goodList.getEnumType() == EnumAll.PLUMBING)))
        .forEachOrdered((goodList) -> {
          result.add(goodList);
        });
    for (Hypermarket hypermarket : result) {
      System.out.print("deparnment : " + hypermarket.getEnumType());
      System.out.print("\t\ttype : " + hypermarket.getType());
      System.out.print(" \t\tcountry : " + hypermarket.getCountry());
      System.out.print(" \t\tprice : " + hypermarket.getPrice());
      System.out.print(" \t\tid : " + hypermarket.getId());
      System.out.println();
    }

  }

  private void showWall() {
    List<Hypermarket> list;
    list = new ArrayList<>();
    Hypermarket wall = new Wall(EnumWall.LIMESTONE);
    wall.setPrice(365);
    wall.setId(18155);
    wall.setCountry("France ");
    wall.setType("limestone");
    list.add(wall);
    wall = new Wall(EnumWall.LIMESTONE);
    wall.setPrice(482);
    wall.setId(24555);
    wall.setCountry("Germany");
    wall.setType("limestone");
    list.add(wall);
    wall = new Wall(EnumWall.PLASTER);
    wall.setPrice(471);
    wall.setId(24745);
    wall.setCountry("Poland ");
    wall.setType("plaster  ");
    list.add(wall);
    wall = new Wall(EnumWall.PLASTER);
    wall.setPrice(882);
    wall.setId(24515);
    wall.setCountry("Belarus");
    wall.setType("plaster  ");
    list.add(wall);
    wall = new Wall(EnumWall.WALLPAPER);
    wall.setPrice(500);
    wall.setId(24865);
    wall.setCountry("Ukraine");
    wall.setType("wallpaper");
    list.add(wall);
    wall = new Wall(EnumWall.WALLPAPER);
    wall.setPrice(425);
    wall.setId(25475);
    wall.setCountry("Germany");
    wall.setType("wallpaper");
    list.add(wall);

    Collections.sort(list, new Comparator<Hypermarket>() {
      public int compare(Hypermarket o1, Hypermarket o2) {
        return o1.getPrice() - o2.getPrice();
      }
    });

    List<Hypermarket> result = new ArrayList<>();
    list.stream().filter((goodList) -> ((goodList.getEnumType() == EnumAll.WALL)))
        .forEachOrdered((goodList) -> {
          result.add(goodList);
        });
    for (Hypermarket hypermarket : result) {
      System.out.print("deparnment : " + hypermarket.getEnumType());
      System.out.print("\t\ttype : " + hypermarket.getType());
      System.out.print(" \t\tcountry : " + hypermarket.getCountry());
      System.out.print(" \t\tprice : " + hypermarket.getPrice());
      System.out.print(" \t\tid : " + hypermarket.getId());
      System.out.println();
    }

  }


  private void showPaintAndVarnish() {
    List<Hypermarket> list;
    list = new ArrayList<>();
    Hypermarket paintAndVarnish = new PaintAndVarnish(EnumPaintAndVarnish.VARNISH);
    paintAndVarnish.setPrice(745);
    paintAndVarnish.setId(25155);
    paintAndVarnish.setCountry("Ukraine");
    paintAndVarnish.setType("varnish     ");
    list.add(paintAndVarnish);
    paintAndVarnish = new PaintAndVarnish(EnumPaintAndVarnish.VARNISH);
    paintAndVarnish.setPrice(425);
    paintAndVarnish.setId(34555);
    paintAndVarnish.setCountry("Poland ");
    paintAndVarnish.setType("varnish     ");
    list.add(paintAndVarnish);
    paintAndVarnish = new PaintAndVarnish(EnumPaintAndVarnish.ENAMEL_PAINT);
    paintAndVarnish.setPrice(752);
    paintAndVarnish.setId(24625);
    paintAndVarnish.setCountry("Norway ");
    paintAndVarnish.setType("enamel paint");
    list.add(paintAndVarnish);
    paintAndVarnish = new PaintAndVarnish(EnumPaintAndVarnish.OIL_PAINT);
    paintAndVarnish.setPrice(348);
    paintAndVarnish.setId(34755);
    paintAndVarnish.setCountry("USA    ");
    paintAndVarnish.setType("oil paint   ");
    list.add(paintAndVarnish);
    paintAndVarnish = new PaintAndVarnish(EnumPaintAndVarnish.POWDER_PAINT);
    paintAndVarnish.setPrice(751);
    paintAndVarnish.setId(82262);
    paintAndVarnish.setCountry("Canada ");
    paintAndVarnish.setType("powder paint");
    list.add(paintAndVarnish);

    Collections.sort(list, new Comparator<Hypermarket>() {
      public int compare(Hypermarket o1, Hypermarket o2) {
        return o1.getPrice() - o2.getPrice();
      }
    });

    List<Hypermarket> result = new ArrayList<>();
    list.stream().filter((goodList) -> ((goodList.getEnumType() == EnumAll.PAINT_AND_VARNISH)))
        .forEachOrdered((goodList) -> {
          result.add(goodList);
        });
    for (Hypermarket hypermarket : result) {
      System.out.print("deparnment : " + hypermarket.getEnumType());
      System.out.print("\t\ttype : " + hypermarket.getType());
      System.out.print(" \t\tcountry : " + hypermarket.getCountry());
      System.out.print(" \t\tprice : " + hypermarket.getPrice());
      System.out.print(" \t\tid : " + hypermarket.getId());
      System.out.println();
    }
  }




  private void performAction(final int choice) {
    switch (choice) {
      case 0:
        exit = true;
        System.out.println("Thank you for using application :) \n");
        setExit();
        break;
      case 1:
        showDepartments();
        System.out.println();
        runMenu();
        break;
      case 2:
        showFurniture();
        System.out.println();
        runMenu();
        break;
      case 3:
        showWall();
        System.out.println();
        runMenu();
        break;
      case 4:
        showPlumbing();
        System.out.println();
        runMenu();
        break;
      case 5:
        showPaintAndVarnish();
        System.out.println();
        runMenu();
        break;
      default:
        System.out.println("Something wrong!");
        runMenu();
    }
  }


}





