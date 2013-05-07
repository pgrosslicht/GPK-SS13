/* PK Uebung 2
 * TODO:
 * 
 * []
 * 
 * Kontrolliert von:
 * Mike: 
 * Patrick: 
 */

public class Circle implements Shape, Scaleable, Moveable, Rotate, Transformable {
  private Point middle;
  private double radius;

  public Circle(Point m, double r) {
    this.middle = m;
    this.radius = r;
  }

  /**
   * gibt die Flaeche des Kreises zurueck
   * @return Flaeche als double
   */
  public double area() {
    return Math.PI * this.radius * this.radius;
  }

  /**
   * gibt den Umfang des Kreises zurueck
   * @return Umfang als double
   */
  public double perimeter() {
    return 2 * this.radius * Math.PI;
  }

  /**
   * skaliert den Mittelpunkt des Kreises um den Faktor sx auf der x-Achse und sy auf der y-Achse
   * @param sx Skalierungsfaktor der x-Achse
   * @param sy Skalierungsfaktor der y-Achse
   */
  public void scale(double sx, double sy) {
    this.middle.scale(sx, sy);
  }

  /**
   * skaliert den Mittelpunkt des Kreises um den Faktor sx auf der x-Achse und sy auf der y-Achse und gibt einen neuen Kreis mit diesen Eigenschaften zurueck
   * @param sx Skalierungsfaktor der x-Achse
   * @param sy Skalierungsfaktor der y-Achse
   * @return skalierten Kreis
   */
  public Circle scale2(double sx, double sy) {
    return new Circle(this.middle.scale2(sx, sy), this.radius);
  }

  /**
   * bewegt den Mittelpunkt des Kreises um den Vektor (tx, ty)
   * @param tx x-Koordinate des Vektors
   * @param ty y-Koordinate des Vektors
   */
  public void move(double tx, double ty) {
    this.middle.move(tx, ty);
  }

  /**
   * bewegt den Mittelpunkt des Kreises um den Vektor (tx, ty) und gibt einen neuen Kreis mit diesen Eigenschaften zurueck
   * @param tx x-Koordinate des Vektors
   * @param ty y-Koordinate des Vektors
   * @return verschobenen Kreis
   */
  public Circle move2(double tx, double ty) {
    return new Circle(this.middle.move2(tx, ty), this.radius);
  }

  /**
   * rotiert den Mittelpunkt des Kreises um den Winkel alpha relativ zum Ursprung
   * @param alpha Winkel in Grad
   */
  public void rotate(double alpha) {
    this.middle.rotate(alpha);
  }

  /**
   * rotiert den Mittelpunkt des Kreises um den Winkel alpha relativ zum Ursprung und gibt einen neuen Kreis mit diesen Eigenschaften zurueck
   * @param alpha Winkel in Grad
   * @return rotierten Kreis
   */
  public Circle rotate2(double alpha) {
    return new Circle(this.middle.rotate2(alpha), this.radius);
  }
}
