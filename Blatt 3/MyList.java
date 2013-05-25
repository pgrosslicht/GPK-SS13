/* PK Uebung 3
* TODO:
*
* Fehlerbehandlung
* addLast() und removeLast()
*
* wenn ich das richtig seh, funktioniert size() nicht, da sich das rekursiv selbst aufruft.
* auch glaub ich, dass wir nicht einfach MyList(index) machen können, wir müssen das ja alles selbst programmieren...
* dadurch gehen auch alle anderen Funktionen nicht. Schau dir das mal im Buch ab Seite 252 an
*   - Patrick
*
* hab mal das Grundgeruest gemacht, rest sollte mithilfe von get(), addFirst() und removeFirst() nicht soo schwer sein.
*
* Kontrolliert von:
* Mike:
* Patrick:
*/

public class MyList<A> {
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
		return size;
	}
	
	/**
	* gibt Element der Liste vom Index zurück
	*/
	public A get(int index) {
    Node<A> element = head;
    for (int i = 0; i<index; i++) {
      element = element.next;
    }
    return element.val;
	}
	
	/**
	* fügt Element n am Listenanfang hinzu
	*/
	public void addFirst(A n) {
    this.head = new Node<A>(n, this.head);
    size++;
	}	
	
	/**
	* gibt das erste Element zurück und löscht es danach
	*/
	public A removeFirst(){
    A element = head.val;
    head = head.next;
    size--;
    return element;
	}

  /**
   * nur zum Testen
   */
  public static void main(String[] args) {
    MyList<Integer> test = new MyList<Integer>(); /* neue Liste mit Integers initialisieren */
    test.addFirst(5); /* 5 hinzufuegen, Inhalt der Liste: 5 */
    test.addFirst(7); /* 7 hinzufuegen, Inhalt der Liste: 7, 5 */
    test.addFirst(9); /* 9 hinzufuegen, Inhalt der Liste: 9, 7, 5 */
    System.out.println(test.size()); /* Groesse sollte jetzt 3 sein */
    System.out.println(test.get(0)); /* sollte 9 ausgeben */
    System.out.println(test.get(1)); /* sollte 7 ausgeben */
    System.out.println(test.get(2)); /* sollte 5 ausgeben */
    System.out.println(test.removeFirst()); /* entfernt 9 aus Liste, sollte 9 ausgeben, Inhalt der Liste: 7, 5 */
    System.out.println(test.size()); /* Groesse sollte jetzt 2 sein */
  }
}
