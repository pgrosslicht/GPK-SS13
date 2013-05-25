/* PK Uebung 3
 * TODO:
 *
 * []
 *
 * Kontrolliert von:
 * Mike:
 * Patrick:
 */

public interface QueueI<A> {
  /**
   * Erstellen Sie das Interface QueueI, das eine solche Queue repräsentiert und
   * implementieren Sie es in MyList. Sie duerfen dabei auf alle Methoden aus der
   * vorigen Aufgabe zugreifen.
   */
  public void enqueue(A n);
  public A dequeue();
}
