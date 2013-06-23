public class MyTreeSet<A extends Comparable<A>> {
  private Node root;
  private int size = 0;
  private class Node {
    private A element;
    private Node left_child;
    private Node right_child;

    Node(A e) {
      this.element = e;
      this.left_child = null;
      this.right_child = null;
    }

    public boolean contains(A a) {
      int comp = a.compareTo(this.element);
      System.out.println(this.element + " " + comp);
      if (comp == 0) {
        return true;
      } else if (comp < 0 && this.left_child != null) {
        return this.left_child.contains(a);
      } else if (comp > 0 && this.right_child != null){
        return this.right_child.contains(a);
      }
      return false;
    }

    public void add(A e) {
      if (e.compareTo(this.element) < 0) {
        if (this.left_child != null) {
          this.left_child.add(e);
        } else {
          this.left_child = new Node(e);
        }
      } else {
        if (this.right_child != null) {
          this.right_child.add(e);
        } else {
          this.right_child = new Node(e);
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
    } else {
      root.add(elem);
    }
    size++;
  }

  public int size() {
    return size;
  }

  public String toString() {
    if (root != null) {
      return root.toString();
    }
    return "";
  }

  public boolean contains(A a) {
    if (root != null) {
      return root.contains(a);
    }
    return false;
  }

  public static void main(String[] args) {
    MyTreeSet<Integer> mytree = new MyTreeSet<Integer>();
    mytree.add(5);
    mytree.add(4);
    mytree.add(6);
    mytree.add(3);
    mytree.add(2);
    mytree.add(7);
    System.out.println(mytree.size());
  }
}
