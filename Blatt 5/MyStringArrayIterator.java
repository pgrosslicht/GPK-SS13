import java.util.Iterator;

public class MyStringArrayIterator implements Iterator<String> {
	
	private String[] theArray;
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
		String[] tempArray = new String[this.theArray.length-1];
		for(int i = 0; i < tempArray.length; i++) {
			if(i < index) {
				tempArray[i] = this.theArray[i];
			}
			else { // i >= index
				tempArray[i] = this.theArray[i+1];
			}
			this.theArray = tempArray;
		}
	}
}
