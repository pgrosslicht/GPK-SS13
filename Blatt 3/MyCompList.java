/* PK Uebung 3
 * TODO:
 *
 * []
 *
 * Kontrolliert von:
 * Mike:
 * Patrick:
 */

public class MyCompList<A extends Comparable<A>> extends MyList<A> {

  public A minimum() {
    if (this.size() == 0) {
      throw new NullPointerException(); //wenn Liste leer, fail gracefully :D
    } else {
      if (this.size() == 1) {
       return this.get(0); //wenn nur ein Element in Liste, return dieses
      } else {
        A min = this.get(0);
        A value = null;
        for (int i = 0; i < this.size(); i++) {
          value = this.get(i);
          if (value.compareTo(min) == -1) {
            min = value;
          }
        }
        return min;
      }
    }
  }


  public static void main(String[] args) {
    MyCompList<Integer> test = new MyCompList<Integer>(); /* neue Liste mit Integers initialisieren */
    test.addFirst(5); /* 5 hinzufuegen, Inhalt der Liste: 5 */
    test.addFirst(7); /* 7 hinzufuegen, Inhalt der Liste: 7, 5 */
    test.addFirst(9); /* 9 hinzufuegen, Inhalt der Liste: 9, 7, 5 */
    test.addLast(3); /* 3 am Ende hinzufuegen, Inhalt der Liste: 9, 7, 5, 3 */
    System.out.println(test.minimum()); /* sollte 3 ausgeben */
    System.out.println(test.size()); /* Groesse sollte jetzt 4 sein */
    test.printList();
    System.out.println(test.removeFirst()); /* entfernt 9 aus Liste, sollte 9 ausgeben, Inhalt der Liste: 7, 5, 3 */
    test.printList();
    System.out.println(test.removeLast()); /* entfernt 3 aus Liste, sollte 3 ausgeben, Inhalt der Liste: 7, 5 */
    test.printList();
    System.out.println(test.size()); /* Groesse sollte jetzt 2 sein */


  }
}
