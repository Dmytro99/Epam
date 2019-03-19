public class BSTFunction extends Menu {

  private static BSTNode root;

  public static BSTNode getRoot() {
    return root;
  }

  public void put( String key, Object value )
  {
    if ( root == null )
    {
      root = new BSTNode( key, value );
    }
    else
    {
      root.put( key, value );
    }
  }

  public Object get( String key )
  {
    return root == null ? null : root.get( key );
  }

  public void print(){
    root.print();
  }


//  public void  remove(){
//    root.remove("a", BSTFunction.getRoot().getRight());
////    return key;
//  }

  @Override
  public String toString() {
    return "BSTFunction{" + "root=" + root + '}';
  }
}
