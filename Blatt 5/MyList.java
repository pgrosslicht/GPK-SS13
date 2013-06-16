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
        
        public MyListIterator iterator() {
                return new MyListIterator();
        }
        
        private class MyListIterator implements Iterator<A> {
                public MyListIterator() {
                        
                }
                
                public void remove() {
                        head = head.next;
                }
                
                public boolean hasNext() {
                        return head.next != null;
                }
                
                public A next() {
                        head = head.next;
                        return head.value;
                }
        }
        
        private Node head = null;
        
        public void add(A a) {
                this.head = new Node(a, this.head);
        }
        
        public static void main(String[] args) {
		MyList<String> test = new MyList<String>(); // neue Liste
		test.add(0); //fügt 0 hinzu
		test.add(1); //fügt 1 hinzu
		test.add(2); //fügt 2 hinzu
		test.add(3); //fügt 3 hinzu
		test.add(4); //fügt 4 hinzu
		test.add(5); //fügt 5 hinzu
		test.add(6); //fügt 6 hinzu
		System.out.println(test.head.value); //sollte null ausgeben
		System.out.println(test.hasNext()); //sollte true ausgeben
		System.out.println(test.next()); //sollte 0 ausgeben
		System.out.println(test.next()); //sollte 1 ausgeben
		System.out.println(test.head.value); //sollte 1 ausgeben
		System.out.println(test.remove()); //sollte 1 removen
		System.out.println(test.head.value); //sollte null ausgeben (weil 1 removed wurde)
		System.out.println(test.next()); //sollte 2 ausgeben
		System.out.println(test.head.value); //sollte 2 ausgeben
        }
}
