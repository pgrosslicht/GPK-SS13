/* PK Uebung 3
 * TODO:
 * 
 * [irgendwie check ich das nicht.]
 * error: Class names, 'Testprog', are only accepted if annotation processing is explicitly requested
 * 1 error
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

    System.out.println("Dreieck das veraendert wird:");
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck rotate: " + dreieck.rotate(5)); //rotate
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck move: " + dreieck.move(3,2)); //move
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck scale: " + dreieck.rotate(5,8)); //scale
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords

    System.out.println("Dreieck das gleich bleibt:");
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck rotate2: " + dreieck.rotate2(5)); //rotate2
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck move2: " + dreieck.move2(3,2)); //move2
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords
    System.out.println("Dreieck scale2: " + dreieck.scale2(5,8)); //scale2
    System.out.println("Dreieck: " + dreieck.toString()); //Dreieck Koords

  }
}
