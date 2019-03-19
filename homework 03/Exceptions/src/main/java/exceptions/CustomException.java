package exceptions;

import java.util.Scanner;

public class CustomException extends Exception {

  public void CustomEx() throws Exception {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.print("Enter N value : ");
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println();
    int[] a = new int[n];
    if(n > 25){
      throw new Exception("The input number is too big!!!");
    }
    for (int i = 0; i < n; i++) {
      if (i < 2) {
        a[i] = 1;

      }else{
        a[i] = a[i - 1] + a[i - 2];
      }
      System.out.println(a[i]);

    }


  }
}
