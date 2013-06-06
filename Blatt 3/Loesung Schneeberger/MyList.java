
public class MyList <A> implements QueueI<A>{
	
	private Node <A> head = null;
	private Node <A> tail = null;
	private int size = 0;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public int size(){
		return size;
	/*	if (head == null) return 0;
		else return head.size();*/
	}
	
	public A get(int index)throws IndexOutOfBoundsException{
		
		if (head == null) throw new IndexOutOfBoundsException("no elements in list");
		else if(index<0) throw new IndexOutOfBoundsException("negative index");
		else{
			return head.get(index);
		}	
	}
	
	public void addFirst(A n){
		Node<A> newNode = new Node<A>(n, head);
		head = newNode;
		size += 1;
		if (tail == null) tail = newNode;
	}
	
	public A removeFirst(){
		if (head == null) return null;
		A ret = head.val;
		if(head == tail){	
			head = null;
			tail = null;	
		}
		else{
			head = head.next;
		}
		size -= 1;
		return ret;
	}
	
	public void addLast(A n){
		Node<A> newNode = new Node<A>(n, null);
		if (head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.setNext(newNode);
			tail = newNode;
		}	
		size += 1;
	}
	
	public A removeLast(){
		if (head == null) return null;
		A ret = tail.val;
		if(head == tail){	
			head = null;
			tail = null;	
		}
		else{
			tail = head.getPred(tail);
			tail.setNext(null);
		}
		size -= 1;
		return ret;
	}
	
	@Override
	public void enqueue(A n) {
		this.addLast(n);
	}

	@Override
	public A dequeue() {
		return this.removeFirst();
	}
	
	
	private class Node <A>{
		private A val;
		private Node <A> next = null;
		
		Node (A v, Node<A> l){
			val = v;
			next = l;
		}
		
	/*	public int size(){
			if (next == null) return 1;
			else return next.size() + 1;
		}*/
		
		public A get(int index)throws IndexOutOfBoundsException{
			if (index == 0) return val;
			else if (next == null) throw new IndexOutOfBoundsException("index too high");
			else{
				return next.get(index-1);
			}
		}
		
		public void setNext(Node<A> n) {
			next = n;
		}
		public Node<A> getPred(Node<A> n){
			if (next == null) return null;
			else if(next == n) return this;
			else return next.getPred(n);
		}
		
	}


	

}

