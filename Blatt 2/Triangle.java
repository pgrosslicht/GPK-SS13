/* PK Uebung 2
 * TODO:
 * 
 * []
 * 
 * Kontrolliert von:
 * Mike: 
 * Patrick: 
 */

public class Triangle implements Shape, Scaleable, Moveable, Rotate, Transformable {
  private Point a, b, c;

  public Triangle(Point a, Point b, Point c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  /**
   * gibt den Umfang eines Dreiecks aus
   * @return Umfang als double
   */
  public double perimeter() {
    return this.a.dist(b) + this.b.dist(c) + this.c.dist(a);
  }

  /**
   * gibt die Flaeche des Dreiecks aus, berechnet durch den Satz des Heron
   * @return Flaeche als double
   */
  public double area() {
    double s;
    s = (this.a.dist(b) + this.b.dist(c) + this.c.dist(a))/2;
    return Math.sqrt(s * (s - this.a.dist(b)) * (s - this.b.dist(c)) * (s - this.c.dist(a)));
  }

  /**
   * gibt ein Dreieck aus, dessen Eckpunkte die Mittelpunkte der Seiten des alten Dreiecks sind.
   * @return neues Triangle mit besagten Eigenschaften
   */
  public Triangle midTriangle() {
    return new Triangle(a.middle(b), b.middle(c), c.middle(a));
  }

  /**
   * skaliert das Dreieck auf der x-Achse um den Faktor sx und auf der y-Achse um den Faktor sy
   * @param sx Faktor um den die x-Achse skaliert werden soll
   * @param sy Faktor um den die y-Achse skaliert werden soll
   */
  public void scale(double sx, double sy) {
    this.a.scale(sx, sy);
    this.b.scale(sx, sy);
    this.c.scale(sx, sy);
  }

  /**
   * skaliert das Dreieck auf der x-Achse um den Faktor sx und auf der y-Achse um den Faktor sy und gibt ein neues Dreieck mit diesen Eigenschaften zurueck
   * @param sx Faktor um den die x-Achse skaliert werden soll
   * @param sy Faktor um den die y-Achse skaliert werden soll
   * @return skaliertes Dreieck
   */
  public Triangle scale2(double sx, double sy) {
    return new Triangle(this.a.scale2(sx, sy), this.b.scale2(sx, sy), this.c.scale2(sx, sy));
  }

  /**
   * verschiebt das Dreieck um den Vektor (tx, ty)
   * @param tx x-Koordinate des Vektors
   * @param ty y-Koordinate des Vektors
   */
  public void move(double tx, double ty) {
    return new Triangle(this.a.move2(tx, ty), this.b.move2(tx, ty), this.c.move2(tx, ty));
    this.a.move(tx, ty);
    this.b.move(tx, ty);
    this.c.move(tx, ty);
  }

  /**
   * verschiebt das Dreieck um den Vektor (tx, ty) und gibt ein neues Dreieck mit diesen Eigenschaften zurueck
   * @param tx x-Koordinate des Vektors
   * @param ty y-Koordinate des Vektors
   * @return verschobenes Dreieck
   */
  public Triangle move2(double tx, double ty) {
    return new Triangle(this.a.move2(tx, ty), this.b.move2(tx, ty), this.c.move2(tx, ty));
  }

  /**
   * rotiert das Dreieck um den Winkel alpha (in Grad)
   * @param alpha Winkel (in Grad) um den rotiert werden soll
   */
  public void rotate(double alpha) {
    this.a.rotate(alpha);
    this.b.rotate(alpha);
    this.c.rotate(alpha);
  }

  /**
   * rotiert das Dreieck um den Winkel alpha (in Grad) und gibt ein neues Dreieck mit diesen Eigenschaften zurueck
   * @param alpha Winkel (in Grad) um den rotiert werden soll
   * @return rotiertes Dreieck
   */
  public Triangle rotate2(double alpha) {
    return new Triangle(this.a.rotate2(alpha), this.b.rotate2(alpha), this.c.rotate2(alpha));
  }

  @Override
  public String toString(){
    return a.toString() + " " + b.toString() + " " +c.toString();
  }

  @Override
  public boolean equals(Object object) {
    return object != null &&
      this.getClass() == object.getClass() &&
      a.equals(((Triangle) object).a) &&
      b.equals(((Triangle) object).b) &&
      c.equals(((Triangle) object).c);
  }
}
