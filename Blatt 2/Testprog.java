/* PK Uebung 2
 * TODO:
 * 
 *
 * benutzt du 'javac Testprog.java'? Der Fehler kommt eigentlich nur, wenn du das .java vergisst.
 * Hab das Programm mal bisschen gefixt (du kannst dreieck.move und dergleichen nicht in println benutzen, da das void zurückgibt), bei mir  laeufts jetzt.
 *
 * habe rotate2 an dreieck2 gelegt, damit man zeigen kann, dass rotate2 funktioniert
 *
 * Kontrolliert von:
 * Mike: 
 * Patrick: 
 */

public class Testprog {
  public static void main(String[] args) {
    Point x = new Point(-1.0, -1.0);
    Point y = new Point(-1.0, 3.0);
    Point z = new Point(2.0, -1.0);
    Triangle dreieck = new Triangle(x, y, z);
    Triangle dreieck2 = new Triangle(x, y, z);
    
    System.out.println("");
    System.out.println("PK Uebung 2 (Patrick Grosslicht, Michael Hambrusch)");
    System.out.println("");
    System.out.println("Dreieck das veraendert wird:");
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck rotate");
    dreieck.rotate(5); //rotate
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck move"); //move
    dreieck.move(3,2);
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck scale"); //scale
    dreieck.scale(5,8);
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("");

    System.out.println("Dreieck das gleich bleibt:");
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck rotate2");
    dreieck2 = dreieck.rotate2(5); //rotate2
    System.out.println("Dreieck2: " + dreieck2.toString()); //Dreieck Koords
    System.out.println("Dreieck move2");
    dreieck.move2(3,2); //move2
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck scale2");
    dreieck.scale2(5,8); //scale2
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords

  }
}
