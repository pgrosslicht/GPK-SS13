public class MyList<A> {
  private Node<A> head = null;

  public boolean isEmpty() {
    return head == null;
  }

  private class Node<A> {
    private A val;
    private Node<A> next = null;

    Node(A v, Node<A> l) {
      val = v;
      next = l;
    }
  }
}
