public class MyTree<A extends Comparable<A>> {
    private Node<A> root = null;
    public long getitcount = 0;
    
    //innere Knotenklasse mit Konstruktor
    private class Node<K extends Comparable<K>, V> {
        private K key;
        private V value;
        private Node<K,V> left, right;
        
        Node(K k, V v) {
            key = k;
            value = v;
            left = null;
            right = null;
        }
        
        private V get(K k) {
            getitcount++;
            if (k.equals(key))
                return value;
            if (k.compareTo(key)<0) {
                if (left == null)
                    return null;
                return left.get(k);
            } else {
                if (right == null)
                    return null;
                return right.get(k);
            }
        }
        
        //gibt Struktur aus
        public void print() {
            if (left != null)
                left.print();
            System.out.println(key+": "+value+"\n");
            if (right != null)
                right.print();
        }
        
        public String toString() {
            String l = (left == null) ? "" : left.toString();
            String r = (right == null) ? "" : right.toString();
            return l+key+": "+value+"\n"+r;
        }
    }
    
    //klasse MyTree (noch nicht generisch!)
    public MyTree<A> MyTree() {
        return null;
    }
    
    //toString zum Testen
    public String toString() {
        if (head == null)
            return "";
        else
            return head.toString();
    }
}
