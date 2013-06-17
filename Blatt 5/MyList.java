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
                public void remove() {
                        MyList.this.head = MyList.this.head.next;
                }
                
                public boolean hasNext() {
                        return MyList.this.head.next != null;
                }
                
                public A next() {
                        MyList.this.head = MyList.this.head.next;
                        return MyList.this.head.value;
                }
        }
        
        private Node head = null;
        
        public void add(A a) {
                this.head = new Node(a, this.head);
        }
        
        public static void main(String[] args) {
                MyList<Integer> test = new MyList<Integer>(); // neue Liste
                test.add(2); //add 2
                test.add(3); //add 3
                test.add(4); //add 4
                test.add(5); //add 5
                test.add(6); //add 6
                MyList.MyListIterator test2 = test.iterator();
                System.out.println(test.head.value); //sollte 6 ausgeben
                System.out.println(test2.hasNext()); //sollte true (5) ausgeben
                System.out.println(test2.next()); //sollte 5 ausgeben
                System.out.println(test2.next()); //sollte 4 ausgeben
                System.out.println(test.head.value); //sollte 4 ausgeben
                test2.remove(); //sollte 4 removen
                System.out.println(test.head.value); //sollte 3 ausgeben (weil 4 removed und head jetzt auf head.next zeigt)
                System.out.println(test2.next()); //sollte 2 ausgeben
                System.out.println(test.head.value); //sollte 2 ausgeben
                System.out.println(test2.hasNext()); //sollte false ausgeben (weil kein weiteres Element)
                System.out.println(test2.next()); //sollte Exception werfen
        }
}
