import java.util.Iterator;

public class MyStringArrayIterator implements Iterator<String> {
	
	public String[] theArray;
	private int index = 0;
	
	public MyStringArrayIterator(String[] array) {
		this.theArray = array;
	}
	
	public boolean hasNext() {
		return index < this.theArray.length;
	}
	
	public String next() {
		return theArray[index++];
	}
	
	public void remove() {
		index--;
		String[] tempArray = new String[this.theArray.length-1];
		for(int i = 0; i < tempArray.length; i++) {
			if(i < index) {
				tempArray[i] = this.theArray[i];
			}
			else { // i >= index
				tempArray[i] = this.theArray[i+1];
			}
		}
		this.theArray = tempArray;
	}
	
	public static void main(String[] args) {
		String[] test = {"Test0", "Test1", "Test2", "Test3", "Test4", "Test5", "Test6"};
		MyStringArrayIterator test2 = new MyStringArrayIterator(test);
		System.out.println(test2.next()); 	//gibt Test0 aus
		System.out.println(test2.next()); 	//gibt Test1 aus
		System.out.println(test2.next()); 	//gibt Test2 aus
		System.out.println("remove hier");
		test2.remove();				//remove von Test2
		System.out.println(test2.next());	//gibt Test3 aus
		System.out.println(test2.next());	//gibt Test4 aus
		System.out.println(test2.next());	//gibt Test5 aus
		
		//modifiziertes Array absolut ausgegeben:
		System.out.println("\nArray absolut ausgegeben: ");
		System.out.println(test2.theArray[0]);	//Test0
		System.out.println(test2.theArray[1]);	//Test1
		System.out.println(test2.theArray[2]);	//Test3
		System.out.println(test2.theArray[3]);	//Test4
		System.out.println(test2.theArray[4]);	//Test5
	}
}
