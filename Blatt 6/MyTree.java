public class MyTree<A extends Comparable<A>> {
  private Node<A> root;
  private class Node<A> {
    private A element;
    private Node<A> left_child;
    private Node<A> right_child;

    public void Node(A e) {
      element = e;
    }

    public void add(A e) {
    
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
  }
}

