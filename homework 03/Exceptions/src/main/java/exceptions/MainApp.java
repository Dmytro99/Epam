package exceptions;

import java.io.BufferedReader;

public class MainApp {

  public static void main(String[] args)  {
    try {

      CustomException customException = new CustomException();
      customException.CustomEx();

    }catch (Exception e){
      System.err.print(e);
    }
//    System.out.println("\n\n");
//    try(UseAutoCloseable useAutoCloseable = new UseAutoCloseable()) {
//useAutoCloseable.read();


    }

}


