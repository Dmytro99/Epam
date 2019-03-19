package com.epam.rumor;

import java.util.Scanner;

public class Rumor {

  public void rumorActions() throws Exception {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println("Input the number of gusts: ");
    int n = scanner.nextInt();
    if (n <= 2) {
      throw new Exception("Please input number > 2");
    }
    final int attempts = 10000;
    int peopleHeard = 0;
    int countEntireSpread = 0;
    for (int i = 0; i < attempts; i++) {
      boolean[] people = new boolean[n];
      people[1] = true;
      boolean alreadyHeard = false;
      int currentGuest = -1;
      int nextGuest;
      while (!alreadyHeard) {
        nextGuest = 1 + (int) (Math.random() * (n - 1));
        if (currentGuest == nextGuest) {
          while (nextGuest == currentGuest) {
            nextGuest = 1 + (int) (Math.random() * (n - 1));
          }
        }

        if (people[nextGuest]) {
          if (rumorDrift(people)) {
            countEntireSpread++;
          }
          peopleHeard += countPeopleHeard(people);
          alreadyHeard = true;
        }
        people[nextGuest] = true;
        currentGuest = nextGuest;
      }
    }

    System.out.println(
        " The probability that everyone at the party (except Alice) " + "will hear the rumor before"
            + " it stops propagating in " + attempts + " attempts: "
            + (double) countEntireSpread / attempts);
    System.out.println("An estimate of the expected number of people to hear the rumor: "
        + peopleHeard / attempts);
  }

  public static boolean rumorDrift(boolean[] rumor) {
    for (int i = 1; i < rumor.length; i++) {
      if (!rumor[i]) {
        return false;
      }

    }
    return true;
  }


  public static int countPeopleHeard(boolean[] rumor) {
    int count = 0;
    for (int i = 1; i < rumor.length; i++) {
      if (rumor[i]) {
        count++;
      }

    }

    return count;
  }

}
