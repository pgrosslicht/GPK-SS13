import java.util.*;

public class MyTreeSet<A extends Comparable<A>> implements Iterable<A> {
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

    /**
     * Hilfsmethode für toString
     * @param n wie oft | wiederholt werden soll
     * @return n-mal |
     */
    private String indentation (int n) {
      String output = new String(new char[n]).replace('\0', '|'); //char mit Länge n erstellen, in String umwandeln, entstehende 0er mit c ersetzen
      return output;
    }

    /**
     * formatiert den Baum
     * @param n Aktueller Node
     * @param level Aktuelle Tiefe im Baum für Indentation
     * @return ASCII-Repräsentation des Baums
     */
    private String toString(Node n, int level){
      String result = "";
      if (n != null) {
        result += indentation(level) + "- " + n.element + "\n";
        result += toString(n.left_child, level + 1);
        result += toString(n.right_child, level + 1);
      }
      return result;
    }

    /**
     * überprüft ob sich a im Baum befindet.
     * Laufzeit: Best-Case: O(1) (erstes Element), Average-Case: O(log(n)), Worst-Case: O(n) (entartete Liste)
     * @param a Element, das gesucht werden soll
     * @return true, wenn gefunden, ansonsten false
     */
    public boolean contains(A a) {
      int comp = a.compareTo(this.element);
      if (comp == 0) {
        return true;
      } else if (comp < 0 && this.left_child != null) {
        return this.left_child.contains(a);
      } else if (comp > 0 && this.right_child != null){
        return this.right_child.contains(a);
      }
      return false;
    }

    private boolean remove (A a) {
      Node node = this;
      Node last = null;
      do {
        int comp = a.compareTo(node.element);
        if (comp < 0) {
          last = node;
          node = node.left_child;
        } else if (comp == 0) {
          Node substitute;
          if (node.right_child == null) {
            substitute = node.left_child;
          } else {
            substitute = node.right_child;
            if (node.left_child != null) {
              Node right = node.right_child;
              while (right.left_child != null) {
                right = right.left_child;
              }
              right.left_child = node.left_child;
            }
          }
          if (last == null) {
            return true;
          } else if (last.left_child == node) {
            last.left_child = substitute;
          } else {
            last.right_child = substitute;
          }
          return true;
        } else {
          last = node;
          node = node.right_child;
        }
      } while (node != null);
      /* return this; */
      return false;
    }

    /* rekursive Methode
     * public boolean add(A e) {
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
      return false;
    }
    */
  
    public boolean add (A e) {
      Node node = this;
      while (true) {
        int comp = e.compareTo(node.element);
        if (comp == 0) {
          return false;
        } else if (comp < 0) {
          if (node.left_child != null) {
            node = node.left_child;
          } else {
            node.left_child = new Node(e);
            return true;
          }
        } else {
          if (node.right_child != null) {
            node = node.right_child;
          } else {
            node.right_child = new Node(e);
            return true;
          }
        }
      }
    }

  }

  public void MyTree() {
    root = null;
  }



  private class MyTreeSetIterator implements Iterator<A> {
    private Stack<Node> NodePath = new Stack<Node>();

    public MyTreeSetIterator(){
      pushNode(MyTreeSet.this.root);
    }

    @Override
    public boolean hasNext() {
      return !NodePath.isEmpty();
    }

    @Override
    public A next() {
      Node current = NodePath.pop();
      A ret = current.element;
      if(current.left_child != null){
        pushNode(current.left_child);
      }
      return ret;

    }

    /**
     * pushes the right path of a tree on the NodePath stack
     * @param start - node where the tree starts
     */
    private void pushNode(Node start){
      Node current = start;
      while(current != null){
        NodePath.push(current);
        current = current.right_child;
      }
    }

    @Override
    public void remove() {
    }
  }

  public Iterator<A> iterator() {
    return new MyTreeSetIterator();
  }

  public boolean add(A elem) {
    if (root == null) {
      root = new Node(elem);
      size++;
      return true;
    } else {
      boolean add = root.add(elem);
      if (add) 
        size++; 
      return add;
    }
  }

  /**
   * Gibt die aktuelle Größe (Anzahl der Elemente, die nicht null sind) zurück. Laufzeit ist hierbei konstant (O(1)).
   * @return Größe des Baums
   */
  public int size() {
    return size;
  }

  public boolean remove(A a) {
    boolean remove = root.remove(a);
    if (remove)
      size--;
    return remove;
  }

  public String toString() {
    if (root != null) {
      return root.toString(root, 0);
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
    mytree.add(10);
    mytree.add(8);
    mytree.add(20);
    mytree.add(5);
    mytree.add(11);
    mytree.add(30);
    System.out.println("size: " + mytree.size());
    System.out.println("25 hinzufügen: " + mytree.add(25));
    System.out.println("size: " + mytree.size());
    System.out.println("25 hinzufügen: " + mytree.add(25));
    System.out.println("size: " + mytree.size());
                  Iterator<Integer> test2 = mytree.iterator();
                  System.out.println(test2.next()); //sollte 5 ausgeben
                  System.out.println(test2.next()); //sollte 5 ausgeben
                  System.out.println(test2.next()); //sollte 5 ausgeben
                  System.out.println(test2.next()); //sollte 5 ausgeben
                  System.out.println(test2.next()); //sollte 5 ausgeben
                  System.out.println(test2.next()); //sollte 5 ausgeben
    System.out.println("Ausgangsbaum: ");
    System.out.print(mytree.toString());
    System.out.println("size: " + mytree.size());
    System.out.println();
    System.out.println("2 remove: " + mytree.remove(2));
    System.out.print(mytree.toString());
    System.out.println("size: " + mytree.size());
    System.out.println();
    System.out.println("4 remove: " + mytree.remove(4));
    System.out.print(mytree.toString());
    System.out.println("size: " + mytree.size());
    System.out.println();
    System.out.println("8 remove: " + mytree.remove(8));
    System.out.println(mytree.toString());
    System.out.println("size: " + mytree.size());
  }
}

