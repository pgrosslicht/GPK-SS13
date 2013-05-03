/* PK Uebung 1
 * TODO:
 * 
 * []
 * 
 * Kontrolliert von:
 * Mike: 130503 1011
 * Patrick: 130502 1150
 */
import uebungsblatt1.*;

public class Testprog {
  public static void main(String[] args) {
    Point x = new Point(-1.0, -1.0);
    Point y = new Point(-1.0, 3.0);
    Point z = new Point(2.0, -1.0);
    Triangle dreieck = new Triangle(x, y, z);
    Triangle middreieck = dreieck.midTriangle(); //Triangle.midTriangle() und Point.middle()

    System.out.println("");
    System.out.println("PK Uebung 1 (Patrick Grosslicht, Michael Hambrusch)");
    System.out.println("");
    System.out.println("Dreieck: " + dreieck.toString()); //Triangle.toString() und Point.toString()
    System.out.println("Dreieck Umfang: " + dreieck.perimeter()); //Triangle.perimeter() und Point.dist()
    System.out.println("Dreieck Flaeche: " + dreieck.area()); //Triangle.area() und Point.dist()
    System.out.println("");
    System.out.println("midDreieck: " + middreieck.toString()); 
    System.out.println("midDreieck Umfang: " + middreieck.perimeter()); //Triangle.perimeter() und Point.dist()
    System.out.println("midDreieck Flaeche: " + middreieck.area()); //Triangle.area() und Point.dist()
    System.out.println("");
    System.out.println("Punkt x == Punkt y ?: " + x.equals(y)); //Point.equals()
    System.out.println("Dreieck == midDreieck ?: " + dreieck.equals(middreieck)); //Triangle.equals()
  }
}
