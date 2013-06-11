public class MyList<A> {
  private class Node {
    A value;
    Node next;

    Node(A value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private Node head = null;

  public void add(A a) {
    this.head = new Node(a, this.head);
  }
}
