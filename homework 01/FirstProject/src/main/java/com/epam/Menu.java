package com.epam;

import java.util.Scanner;

public class Menu {

  private boolean exit;

  public static void main(final String[] args) {

    Menu menu = new Menu();
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
    System.out.println("\n| 1. Input the interval       |");
    System.out.println("| 2. Fibonachi numbers        |");
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
    while (choice < 0 || choice > 2) {
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

  private void actionOddEven() {
    int sumOdd = 0;
    int sumEven = 0;
    int sumBoth;
    Scanner scan = new Scanner(System.in, "UTF-8");
    System.out.print("Input begin number: ");
    int a = scan.nextInt();
    System.out.print("Input end number: ");
    int b = scan.nextInt();
    System.out.println();

    System.out.print("Odd number(from start to the end) :");
    for (int i = a; i < b; i++) {

      if (i % 2 != 0) {
        System.out.print(" " + i + " ");
        sumOdd += i;

      }
    }
    System.out.print("\nEven number(from the end to  start) :");
    for (int i = b; i > a; i--) {
      if (i % 2 == 0) {
        System.out.print(" " + i + " ");
        sumEven += i;
      }
    }
    sumBoth = sumEven + sumOdd;
    System.out.println("\n\nSum of odd : " + sumOdd);
    System.out.println("Sum of even : " + sumEven);
    System.out.println("Sum of odd and even numbers : " + sumBoth);
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
        actionOddEven();
        runMenu();
        break;
      case 2:
        getFibonacci();
        runMenu();
        break;

      default:
        System.out.println("Something wrong!");
    }
  }

  private void getFibonacci() {
    int countOdd = 0;
    int countEven = 0;
    int percetageOdd;
    int percetageEven;
    final int percetage = 100;
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.print("Enter N value : ");
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println();
    int[] a = new int[n];
    int f1 = a[0];
    int f2 = a[0];
    for (int i = 0; i < n; i++) {
      if (i < 2) {
        a[i] = 1;

      } else {
        a[i] = a[i - 1] + a[i - 2];
      }
      System.out.println(a[i]);
      if (a[i] % 2 != 0) {
        countOdd++;

        if (f1 < a[i]) {
          f1 = a[i];
        }
      } else if (a[i] % 2 == 0) {
        countEven++;
        if (f2 < a[i]) {
          f2 = a[i];
        }
      }
    }

    percetageOdd = (percetage * countOdd) / (n);
    percetageEven = (percetage * countEven) / (n);
    System.out.println("\nF1 = " + f1);
    System.out.println("F2 = " + f2);
    System.out.println("\nPercentage Odd = " + percetageOdd + "%");
    System.out.println("Percentage Even = " + percetageEven + "%\n");
  }


}







