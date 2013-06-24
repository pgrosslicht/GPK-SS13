public class MyTree<A extends Comparable<A>> {
  private Node root;
  private class Node {
    private A element;
    private Node left_child;
    private Node right_child;

    Node(A e) {
      this.element = e;
      this.left_child = null;
      this.right_child = null;
    }

    public void add(A e) {
      if (e.compareTo(this.element) < 0) {
        if (this.left_child != null) {
          this.left_child.add(e);
        } else {
          this.left_child = new Node(e);
      System.out.println("new node left" + this.element);
        }
      } else {
        if (this.right_child != null) {
          this.right_child.add(e);
        } else {
          this.right_child = new Node(e);
      System.out.println("new node right" + this.element);
        }
      }
    }
  }

  public void MyTree() {
    root = null;
  }

  public void add(A elem) {
    if (root == null) {
      root = new Node(elem);
      System.out.println("test");
    } else {
      root.add(elem);
    }
  }

  public String toString() {
    if (root != null) {
      return root.toString();
    }
    return "";
  }

  public static void main(String[] args) {
    MyTree<Integer> mytree = new MyTree<Integer>();
    mytree.add(5);
    mytree.add(4);
    mytree.add(6);
    mytree.add(3);
    mytree.add(2);
    mytree.add(4);
    mytree.add(7);
    System.out.println(mytree.toString());
  }
}

