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
}
