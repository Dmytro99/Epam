package com.epam.minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

  char[][] minefield;
  int width;
  int height;
  int mines;

  public void show() {
    setScanner();
    minefield = new char[height][width];
    pointMinefield();
    placeMines();
    drawMinefield();
    System.out.println();
    calculateHints();
    drawMinefield();
  }


  public void setScanner() {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.print("Please input the number of columns: ");
    width = scanner.nextInt();
    System.out.print("Please input the number of rows: ");
    height = scanner.nextInt();
    System.out.print("Please input the number of mines: ");
    mines = scanner.nextInt();
    System.out.println();

  }


  public void placeMines() {
    int minesPlace = 0;
    Random random = new Random();
    while (minesPlace < mines) {
      int x = random.nextInt(width);
      int y = random.nextInt(height);
      if (minefield[y][x] != '*') {
        minefield[y][x] = '*';
        minesPlace++;
      }
    }
  }

  public void pointMinefield() {
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        minefield[y][x] = '.';
      }
    }
  }

  public void drawMinefield() {
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        System.out.print(minefield[y][x]);
      }
      System.out.println();
    }
  }

  public void calculateHints() {
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        if (minefield[y][x] != '*') {
          minefield[y][x] = minesNear(y, x);
        }
      }
    }
  }

  public char minesNear(int y, int x) {
    int mines = 0;
    mines += mineCheck(y - 1, x - 1);
    mines += mineCheck(y - 1, x);
    mines += mineCheck(y - 1, x + 1);
    mines += mineCheck(y, x - 1);
    mines += mineCheck(y, x + 1);
    mines += mineCheck(y + 1, x - 1);
    mines += mineCheck(y + 1, x);
    mines += mineCheck(y + 1, x + 1);
    return (char) (mines + 48);
  }

  public int mineCheck(int y, int x) {
    if (y >= 0 && y < height && x >= 0 && x < width && minefield[y][x] == '*') {
      return 1;
    } else {
      return 0;
    }

  }
}