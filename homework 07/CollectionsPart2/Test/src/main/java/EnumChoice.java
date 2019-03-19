import java.util.Scanner;

public enum EnumChoice {

  SHOW_TREE(1, "Show tree"),
  GET_ELEMENT(2, "Get element"),
  REMOVE_ELEMENT(3, "Remove element"),
  EXIT(0, "Exit");






  private final String message;
  private final int code;

  public static EnumChoice get(int code) {
    for(EnumChoice c : EnumChoice.values()) {
      if(code==c.code) {
        return c;
      }
    }
    return null;
  }

  EnumChoice(int code, String message) {
    this.code= code;
    this.message = message;
  }
  public int getCode() { return this.code; }
  public String message() { return this.message; }
}



