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
    // TODO Aufgabe 1.2
  }
}
