/*
TO DO:

[]

Kontrolliert von:
Mike: 130502 1025
Patrick: -
__________________________________________________________________________________
*/

public class Point{
  private double x;
	private double y;
	
	public Point(double a, double b){
		x = a;
		y = b;
	}
		
	public double dist(Point p){
		// a = p.x - this.x
		double a = p.x-this.x;
		// b = p.y - this.y 
		double b = p.y-this.y;
		
		//quadratwurzel von a² + b² = c
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));	
	}
	
	public Point middle(Point p){
		//Mittelpunkt von aktuellen objekt und objekt p
		double x = Math.abs(this.x - p.x);
		double y = Math.abs(this.y - p.y);
		
		return new Point(x,y);
		
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
	 		this.y ==((Point) object).y;
	 }
	 
}
