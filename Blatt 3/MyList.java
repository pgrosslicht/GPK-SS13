/* PK Uebung 3
* TODO:
*
* [nicht getestet]
*
* Kontrolliert von:
* Mike:
* Patrick:
*/

public class MyList<A> {
	private Node<A> head = null;
	
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
		int listCount = Mylist.size();
		return listCount;
	}
	
	/**
	* gibt Element der Liste vom Index zurück
	*/
	public A get(int index) {
		return MyList(index);
	}
	
	/**
	* fügt Element n am Listenanfang hinzu
	*/
	public void addFirst(A n) {
		MyList.add(n);  
	}	
	
	/**
	* gibt das erste Element zurück und löscht es danach
	*/
	public A removeFirst(){
		private double oldfirst = MyList.get(0);
		MyList.remove(0);
		return oldfirst;
	}
}
