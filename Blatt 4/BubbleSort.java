public class BubbleSort {

  public void sort(String[] array) {
    boolean unsortiert = true;
    String temp;
    while (unsortiert) {
      for (int i = 0; i < array.length-1; i++) {
        unsortiert = false;
        if (array[i].compareTo(array[i+1]) > 0) {
          temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          unsortiert = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    BubbleSort bs = new BubbleSort();
    String[] test = {"a", "c", "b", "z", "u"};
    bs.sort(test);
    for (int i = 0; i < test.length; i++) {
      System.out.println(test[i]);
    }
  }
}
