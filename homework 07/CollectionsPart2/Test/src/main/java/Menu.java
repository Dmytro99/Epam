import java.util.Scanner;

public class Menu {


  private BSTFunction tree;


  private boolean exit;

  private void setExit() {
    System.exit(0);
  }

  private void printHeader() {
    System.out.println("*------------------------*");
    System.out.println("|         MENU           |");

  }

  private void printMenu() {
    System.out.print("*------------------------*");
    System.out.println("\n| 1.Show tree            |");
    System.out.println("| 2.Get element          |");
    System.out.println("| 3.Remove element       |");
    System.out.println("| 0.Exit                 |");
    System.out.println("*------------------------*");
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

  private void getElement() {
     BSTFunction tree = new BSTFunction();
    System.out.println(tree.get("b"));
  }

  private void showTree() {
    BSTFunction tree = new BSTFunction();
    tree.print();
}

  private void removeElement() {
    System.out.println("not ready");
  }


  private void performAction(final int choice) {
    EnumChoice enumChoice = EnumChoice.get(choice);
    System.out.println("You Chose '" + enumChoice.message() + "'\n\n");
    switch (choice) {
      case 0:
        EnumChoice.get(0);
        exit = true;
        System.out.println("Thank you for using application :) \n");
        setExit();
        break;
      case 1:
        EnumChoice.get(1);
        showTree();
        System.out.println();
        runMenu();
        break;
      case 2:
        EnumChoice.get(2);
        getElement();
        System.out.println();
        runMenu();
        break;
      case 3:
        EnumChoice.get(3);
        removeElement();
        System.out.println();
        runMenu();
        break;
      default:
        System.out.println("Something wrong!");
        runMenu();
    }
  }


}
