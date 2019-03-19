public class BSTNode {

  private String key;
  private Object value;
  private BSTNode left;
  private BSTNode right;

  public BSTNode( String key, Object value )
  {
    this.key = key;
    this.value = value;
  }


  public void put( String key, Object value )
  {
    if ( key.compareTo( this.key ) < 0 )
    {
      if ( left != null )
      {
        left.put( key, value );
      }
      else
      {
        left = new BSTNode( key, value );
      }
    }
    else if ( key.compareTo( this.key ) > 0 )
    {
      if ( right != null )
      {
        right.put( key, value );
      }
      else
      {
        right = new BSTNode( key, value );
      }
    }
    else
    {

      this.value = value;
    }
  }


  public Object get( String key )
  {
    if ( this.key.equals( key ) )
    {
      return value;
    }

    if ( key.compareTo( this.key ) < 0 )
    {
      return left == null ? null : left.get( key );
    }
    else
    {
      return right == null ? null : right.get( key );
    }
  }



//
//  public void remove (String key, BSTNode pos)
//  {
//    if (pos == null) return;
//    if (key.compareTo(pos.key)<0)
//      remove (key, pos.left);
//    else if (key.compareTo(pos.key)>0)
//      remove (key, pos.right);
//    else {
//      if (pos.left != null && pos.right != null)
//      {
//        /* pos has two children */
//        BSTNode maxFromLeft = findMax (pos.left); //need to make a findMax helper
//        //"Replacing "  pos.key " with " maxFromLeft.key
//        pos.key = maxFromLeft.key;
//        remove (maxFromLeft.key, pos.left);
//      }
//      else if(pos.left != null) {
//        /* node pointed by pos has at most one child */
//        BSTNode trash = pos;
//        //"Promoting " pos.leftChild.key " to replace " pos.key
//        pos = pos.left;
//        trash = null;
//      }
//      else if(pos.right != null) {
//        /* node pointed by pos has at most one child */
//        BSTNode trash = pos;
//        /* "Promoting " pos.rightChild.key" to replace " pos.key */
//        pos = pos.right;
//        trash = null;
//      }
//      else {
//        pos = null;
//      }
//    }
//  }
//
//  private BSTNode findMax(BSTNode left) {
//    return left;
//  }


  void print() {
    recprint(BSTFunction.getRoot());
    System.out.println();
  }

  void recprint(BSTNode p) {
    if (p == null) {
      return;
    }
    recprint(p.getLeft());
    System.out.println("Key -> " + p.getKey() + " " + " Value -> " + p.getValue());
    recprint(p.getRight());
  }

  public String getKey() {
    return key;
  }

  public Object getValue() {
    return value;
  }

  public BSTNode getLeft() {
    return left;
  }

  public BSTNode getRight() {
    return right;
  }

  @Override
  public String toString() {
    return "key='" + key + '\'' + ", value=" + value + '}';
  }
}
