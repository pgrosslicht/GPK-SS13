/*
 * TODO:
 * 
 * []
 * 
 * Kontrolliert von:
 * Mike: -
 * Patrick: 130502 1150
 */
import uebungsblatt1.*;

public class Testprog {
  public static void main(String[] args) {
    Point x = new Point(1.0, 5.0);
    Point y = new Point(3.0, 7.0);
    Point z = new Point(-1.0, 3.0);
    Triangle dreieck = new Triangle(x, y, z);
    Triangle middreieck = dreieck.midTriangle(); //Triangle.midTriangle() und Point.middle()

    System.out.println("dreieck: " + dreieck.toString()); //Triangle.toString() und Point.toString()
    System.out.println("middreieck: " + middreieck.toString()); 
    System.out.println("dreieck == middreieck?: " + dreieck.equals(middreieck)); //Triangle.equals()
    System.out.println("middreieck Umfang: " + middreieck.perimeter()); //Triangle.perimeter() und Point.dist()
    System.out.println("middreieck Flaeche: " + middreieck.area()); //Triangle.area() und Point.dist()
    System.out.println("x == y?: " + x.equals(y)); //Point.equals()
  }
}
