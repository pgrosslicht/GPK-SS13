/* PK Uebung 3
* TODO:
*
*
* wenn ich das richtig seh, funktioniert this.size() nicht, da sich das rekursiv selbst aufruft.
* auch glaub ich, dass wir nicht einfach MyList(index) machen können, wir müssen das ja alles selbst programmieren...
* dadurch gehen auch alle anderen Funktionen nicht. Schau dir das mal im Buch ab Seite 252 an
*   - Patrick
*
* hab mal das Grundgeruest gemacht, Rest sollte mithilfe von get(), addFirst() und removeFirst() nicht soo schwer sein.
*
* Kontrolliert von:
* Mike:
* Patrick:
*/

public class MyList<A> implements QueueI<A> {
  private Node<A> head = null;
  private int size = 0;

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

  /**
  * @return gibt Anzahl der Elemente der Liste als int zurück
  */
  public int size() {
    return this.size;
  }


  /**
  * gibt Element der Liste vom Index zurück
  */
  public A get(int index) {
    if (this.size() <= index || index < 0) {
      throw new IndexOutOfBoundsException();
    } else {
      Node<A> element = head;
      for (int i = 0; i<index; i++) {
        element = element.next;
      }
      return element.val;
    }
  }

  /**
  * fügt Element n am Listenanfang hinzu
  */
  public void addFirst(A n) {
    this.head = new Node<A>(n, this.head);
    this.size++;
  } 
  
  /**
  * gibt das erste Element zurück und löscht es danach
  */
  public A removeFirst(){
    if (this.size == 0) {
      throw new NullPointerException();
    } else {
      A element = head.val;
      head = head.next;
      this.size--;
      return element;
    }
  }

  /**
   * fügt Element n am Listenende hinzu
   */
  public void addLast(A n) {
    Node<A> temp = head;

    for (int i=0; i < this.size()-1; i++) {
      temp = temp.next;
    }
    temp.next = new Node<A>(n, null);
    this.size++;
  }

  /**
   * gibt das letzte Element zurück und löscht es danach
   */
  public A removeLast(){
    if (this.size() == 0) {
      throw new NullPointerException();
    } else {
      if (this.size() == 1) {
        return this.removeFirst();
      }
      Node<A> temp = head;
      for (int i = 0; i < this.size()-1; i++) {
        temp = temp.next;
      }
      A value = temp.val;
      temp = null;
      this.size--;
      return value;
    }
  }

  /**
   * fügt ein Element zur Queue
   */
  public void enqueue(A n) {
    this.addFirst(n);
  }

  /**
   * entfernt das erste Element aus der Queue
   */
  public A dequeue() {
   return this.removeLast();
  }

  /**
   * nur zum Testen
   */
  public void printList() {
    Node<A> temp = head;
    for (int i = 0; i < this.size(); i++) {
      System.out.print(temp.val + ", ");
      temp = temp.next;
    }
    System.out.println();
  }

  /**
   * nur zum Testen
   */
  public static void main2(String[] args) {
    MyList<Integer> test = new MyList<Integer>(); /* neue Liste mit Integers initialisieren */
    test.addFirst(5); /* 5 hinzufuegen, Inhalt der Liste: 5 */
    test.addFirst(7); /* 7 hinzufuegen, Inhalt der Liste: 7, 5 */
    test.addFirst(9); /* 9 hinzufuegen, Inhalt der Liste: 9, 7, 5 */
    test.addLast(3); /* 3 am Ende hinzufuegen, Inhalt der Liste: 9, 7, 5, 3 */
    System.out.println(test.size()); /* Groesse sollte jetzt 4 sein */
    test.printList();
    System.out.println(test.removeFirst()); /* entfernt 9 aus Liste, sollte 9 ausgeben, Inhalt der Liste: 7, 5, 3 */
    test.printList();
    System.out.println(test.removeLast()); /* entfernt 3 aus Liste, sollte 3 ausgeben, Inhalt der Liste: 7, 5 */
    test.printList();
    System.out.println(test.size()); /* Groesse sollte jetzt 2 sein */

    MyList<Integer> queue_test = new MyList<Integer>();
    queue_test.enqueue(4);
    queue_test.enqueue(5);
    System.out.println(queue_test.dequeue()); /* sollte 4 ausgeben */
    System.out.println(queue_test.dequeue()); /* sollte 5 ausgeben */
    // System.out.println(queue_test.dequeue()); /* sollte eine NullPointerException werfen */
  }
}
