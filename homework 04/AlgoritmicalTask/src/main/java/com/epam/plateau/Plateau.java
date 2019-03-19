package com.epam.plateau;

public class Plateau {

  public static void main(String[] args) {
    int location = 0;
    int count = 1;
    int max = 0;
    int numberAfter = 0;
    int numberBefore = 0;
    int number = 0;
    int[] array = new int[]{2, 2, 5, 5, 5, 5, 11, 6, 7, 7, 4, 3};

    for (int i = 0; i < array.length - 1; i++) {

      if (array[i] == array[i + 1]) {
        count++;
      } else {
        if (count > max) {

          max = count;

          number = array[i];
          location = i + 1 - max;
        }
        count = 1;
      }
    }

    for (int i = 1; i < array.length; i++) {
      numberBefore = array[location - 1];
    }
    for (int i = 0; i < array.length - 1; i++) {
      numberAfter = array[location + max];
    }
    System.out.println("index of element: " + location);
    System.out.println("amount of numbers: " + max);
    System.out.println(numberAfter);
    System.out.println(numberBefore);

  }


}

