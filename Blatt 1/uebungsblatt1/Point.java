/* PK Uebung 1
 * TO DO:
 *
 * []
 *
 * Kontrolliert von:
 * Mike: 130502 1025
 * Patrick: 130502 1151
 */
package uebungsblatt1;

public class Point {
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
