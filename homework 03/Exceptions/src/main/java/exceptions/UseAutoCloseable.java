package exceptions;


public class UseAutoCloseable implements AutoCloseable {

public void read(){
  System.out.println("Method for read something...");
}
  public void close() throws Exception {
    System.out.println("I'm closing...");
    throw new Exception("Try to throw Exception in close method...");
  }
}
