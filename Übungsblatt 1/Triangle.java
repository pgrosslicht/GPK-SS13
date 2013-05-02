/*
TODO:

4. Erstellen Sie eine Methode area() die den Flacheninhalt des Dreiecks
zuruckliefert.

Kontrolliert von:
Mike: -
Patrick: -
_____________________________________________________________________________
*/


public class Triangle{
  private Point a,b,c;
	
	public Triangle(Point a, Point b, Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double perimeter(){
		return this.a.dist(b) + this.b.dist(c) + this.c.dist(a);	
	}
	
	public Triangle midTriangle(){
		return new Triangle(a.middle(b), b.middle(c), c.middle(a));
	}
	
	@Override
	public String toString() {
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
