/*
TODO:

[]

Kontrolliert von:
Mike: 130502 1039
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
	
	public double area(){
		double s;
		s = this.a.dist(b) + this.b.dist(c) + this.c.dist(a);
		return Math.sqrt(s * (s - this.a.dist(b)) * (s - this.b.dist(c)) * (s - this.c.dist(a)));
	}
	
	@Override
	public String toString(){
		return a.toString() + " " + b.toString() + " " +c.toString();
	}
	
	@Override
	public boolean equals(Object object){
		return object != null &&
			this.getClass() == object.getClass() &&
			a.equals(((Triangle) object).a) &&
			b.equals(((Triangle) object).b) &&
			c.equals(((Triangle) object).c);
	}

}
