/* PK Uebung 2
 * TODO:
 *
 * []
 *
 * Kontrolliert von:
 * Mike:
 * Patrick:
 */

public interface Transformable {
  /**
   * rotiert ein Objekt um den Winkel alpha relativ zum Ursprung und gibt ein neues Objekt mit den genannten Eigenschaften zurueck.
   */
  Transformable rotate2(double alpha);

  /**
   * bewegt ein Objekt um den Vektor (tx, ty) und gibt ein neues Objekt mit den genannten Eigenschaften zurueck.
   */
  Transformable move2(double tx, double ty);

  /**
   * skaliert ein Objekt um die Faktoren sx und sy und gibt ein neues Objekt mit den genannten Eigenschaften zurueck.
   */
  Transformable scale2(double sx, double sy);
}
