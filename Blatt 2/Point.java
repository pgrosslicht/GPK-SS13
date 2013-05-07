/* PK Uebung 2
 * TO DO:
 *
 * []
 *
 * Kontrolliert von:
 * Mike: 
 * Patrick: 
 */

public class Point implements Scaleable, Moveable, Rotate, Transformable {
  private double x, y;

  public Point(double a, double b) {
    x = a;
    y = b;
  }

  public double dist(Point p) {
    double a = p.x - this.x;
    double b = p.y - this.y;

    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  }

  public Point middle(Point p) {
    double x = 0.5 * (this.x + p.x);
    double y = 0.5 * (this.y + p.y);

    return new Point(x, y);
  }

  /** skaliert einen Punkt auf der x-Achse um den Faktor sx, auf der y-Achse um den Faktor sy
   * @param sx Faktor um den die x-Achse skaliert werden soll
   * @param sy Faktor um den die y-Achse skaliert werden soll
   */
  public void scale(double sx, double sy) {
    this.x = this.x * sx;
    this.y = this.y * sy;
  }

  /** skaliert einen Punkt auf der x-Achse um den Faktor sx, auf der y-Achse um den Faktor sy und gibt einen neuen Punkt mit diesen Eigenschaften zurueck.
   * @param sx Faktor um den die x-Achse skaliert werden soll
   * @param sy Faktor um den die y-Achse skaliert werden soll
   * @return skalierter Punkt
   */
  public Point scale2(double sx, double sy) {
    return new Point(this.x * sx, this.y * sy);
  }

  /**
   * verschiebt den Punkt um den Vektor (tx, ty)
   * @param tx x-Koordinate des Vektors
   * @param ty y-Koordinate des Vektors
   */
  public void move(double tx, double ty) {
    this.x = this.x + tx;
    this.y = this.y + ty;
  }

  /**
   * verschiebt den Punkt um den Vektor (tx, ty) und gibt einen neuen Punkt mit diesen Eigenschaften zurueck
   * @param tx x-Koordinate des Vektors
   * @param ty y-Koordinate des Vektors
   * @return verschobener Punkt
   */
  public Point move2(double tx, double ty) {
    return new Point(this.x + tx, this.y + ty);
  }

  /**
   * dreht den Punkt um alpha Grad relativ zum Ursprung
   * @param alpha Winkel (in Grad) um den gedreht werden soll
   */
  public void rotate(double alpha) {
    alpha = Math.toRadians(alpha);
    double x = this.x * Math.cos(alpha) + this.y * Math.sin(alpha);
    double y = - (this.x * Math.sin(alpha)) + this.y * Math.cos(alpha);
    this.x = x;
    this.y = y;
  }

  /**
   * dreht den Punkt um alpha Grad relativ zum Ursprung und gibt einen neuen Punkt mit diesen Eigenschaften zurueck.
   * @param alpha Winkel (in Grad) um den gedreht werden soll
   * @return gedrehter Punkt
   */
  public Point rotate2(double alpha) {
    alpha = Math.toRadians(alpha);
    double x = this.x * Math.cos(alpha) + this.y * Math.sin(alpha);
    double y = - (this.x * Math.sin(alpha)) + this.y * Math.cos(alpha);
    return new Point(x, y);
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  @Override
  public boolean equals(Object object) {
    return object != null &&
      this.getClass() == object.getClass() &&
      this.x == ((Point) object).x &&
      this.y == ((Point) object).y;
  }
}
