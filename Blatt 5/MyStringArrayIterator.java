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
    String[] tempArray = new String[this.theArray.length-1];
    for(int i = 0; i < tempArray.length; i++) {
      if(i < index) {
        tempArray[i] = this.theArray[i];
      }
      else { // i >= index
        tempArray[i] = this.theArray[i+1];
      }
      //this.theArray = tempArray; dadurch gings nicht.
    }
    this.theArray = tempArray;
  }
  public static void main(String[] args) {
    String[] test = {"Test1", "Test2", "Test3", "Test4"};
    MyStringArrayIterator test2 = new MyStringArrayIterator(test);
    System.out.println(test2.next());
    System.out.println(test2.next());
    System.out.println(test2.next());
    test2.remove();
      System.out.println(test2.theArray[0]);
      System.out.println(test2.theArray[1]);
      System.out.println(test2.theArray[2]);
  }
}
