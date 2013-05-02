/*
 * TODO:
 * 
 * [ Funktionen überprüfen! Bekomme Kompilierungsfehler bei mir ...]
 * 
 * Kontrolliert von:
 * Mike: 130502 2305
 * Patrick: 130502 1150
 */

import uebungsblatt1.*;

public class Testprog {
  public static void main(String[] args) {
    Point x = new Point(1.0, 5.0);
    Point y = new Point(3.0, 7.0);
    Point z = new Point(-1.0, 3.0);
    Triangle dreieck = new Triangle(x, y, z);
    Triangle middreieck = dreieck.midTriangle();

    System.out.println("dreieck: " + dreieck.toString());
    System.out.println("middreieck: " + middreieck.toString());
    System.out.println("dreieck == middreieck?: " + dreieck.equals(middreieck));
    System.out.println("middreieck Umfang: " + middreieck.perimeter());
    System.out.println("middreieck Fläche: " + middreieck.area());
    System.out.println("x == y?: " + x.equals(y));

/*
    System.out.println("1.2   Distanz: " + x.dist(y));
    System.out.println("1.3   Mitte: " + x.middle(y));
    System.out.println("1.5   x == y?: " + x.equals(y));
    System.out.println("2.2   Dreieck: " + dreieck.toString());
    System.out.println("2.2.1 Umfang: " + dreieck.perimeter());
    System.out.println("2.2.2 midUmfang: " + middreieck.perimeter());
    System.out.println("2.3   midTriangle: " + middreieck.toString());
    System.out.println("2.4.1 Flaeche: " + dreieck.area());
    System.out.println("2.4.2 midFlaeche: " + middreieck.area());
    System.out.println("2.6   Dreieck == middreieck?: " + dreieck.equals(middreieck)); 
*/


  }
}