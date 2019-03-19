public class MainTree {

  public static void main(String[] args) {

    BSTFunction tree = new BSTFunction();
    tree.put("b", "binary");
    tree.put("f", "factory");
    tree.put("a", "apple");
    tree.put("e", "elementary");
    tree.put("c", "clever");
    tree.put("g", "garden");
    tree.put("d", "dormitory");
    Menu menu = new Menu();
    menu.runMenu();

  }

}
