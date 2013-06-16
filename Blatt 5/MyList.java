import java.util.*;

public class MyList<A> implements Iterable<A> {
  private class Node {
    A value;
    Node next;
    
    Node(A value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
  
  public MyListIterator<A> iterator() {
    return new MyListIterator();
  }
  
  private class MyListIterator<A> implements Iterator<A> {
    public MyListIterator() {
      
    }
    
    public void remove() {
      
    }
    
    public boolean hasNext() {
      return head.next != null;
    }
    
    public A next() {
      return null;
    }
  }
  
  private Node head = null;
  
  public void add(A a) {
    this.head = new Node(a, this.head);
  }
}
