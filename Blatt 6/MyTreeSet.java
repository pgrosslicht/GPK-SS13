
class TreeNode<A extends Comparable<A>> { // Knoten im Baum
    private A elem;  //Element
    private TreeNode<A> left = null;   // linker Teilbaum
    private TreeNode<A> right = null;  // rechter Teilbaum
    
    //Konstruktor für elem
    TreeNode (A a) {
        elem = a;
    }
    
    //2.1 boolean add(A a)
    boolean add(A a) {
        return true;
    }
    
    //2.2 booblean remove(A a)
    boolean remove(A a) {
        return true;        
    }
    
    //2.3 boolean contains(A a)
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

