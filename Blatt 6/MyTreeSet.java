public class MyTreeSet {
    private TreeNode root = null;
    
    class TreeNode<A extends Comparable<A>> { // Knoten im Baum
        private A elem;  //Element
        private TreeNode<A> left = null;   // linker Teilbaum
        private TreeNode<A> right = null;  // rechter Teilbaum
        
        //Konstruktor für elem
        TreeNode (A a) {
            elem = a;
        }
        
        //2.1 boolean add(A a)
        //Laufzeit: ???
        boolean add(A a) {
            boolean hinzu = false;
            if( a < elem ) {
                if ( left != null ) {
                    left.add(a);
                }
                else {
                    left = new TreeNode(a);////////
                    hinzu = true;
                }
            }
            else if( a > elem ) {
                if ( right != null ) {
                    right.add(e);
                }
                else {
                    right = new TreeNode(a); //////////
                    hinzu = true;
                }
            }
            
            return hinzu; // a nicht größer oder kleiner als elem --> a == elem
        }
        
        //2.2 booblean remove(A a)
        //Laufzeit: 
        boolean remove(A a) {
            boolean del = false;
            if( a < elem ) {
                if( left != null ) {
                    left = left.remove(a);
                }
            }
            else if( a == elem ) {
                if( right == null ) {
                    del = true;
                }
                
            }
            else if( a > elem ) {
                if( right != null ) {
                    right = right.remove(a);   
                }
            }
            return del;        
        }
        
        //2.3 boolean contains(A a)
        //Laufzeit: linear
        boolean contains(A a) {
            int c = a.compareTo(elem);
            if( c < 0 ) {
                return left != null && left.contains(a);
            }
            else if( c == 0) {
                return true;   
            }
            else {
                return right != null && right.contains(a);   
            }
        }
        
        //2.4 int size()
        int size() {
            return true;        
        }
    }
    
    
    //Hinzufügen von Elementen (Zahlen) zum Testen
    public void add(int a) {
        if( root == null ) {
            root = new TreeNode(a);
        }
        else {
            root.add(a);
        }
    }
    
    
    
    public String toString() {
        if (root != null) {
            return root.toString();
        }
        return "";
    }
    
    //Testprogramm
    public static void main(String[] args) {
        TreeNode<Integer> testbaum = new TreeNode<Integer>();
        testbaum.add(5);
        testbaum.add(4);
        testbaum.add(6);
        testbaum.add(3);
        testbaum.add(2);
        testbaum.add(4);
        testbaum.add(7);
        System.out.println(testbaum.toString());
        
        
    }
    
    
}