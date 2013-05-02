/*
TO DO:

4. Erstellen Sie die Methode toString(). Sie konnen dabei selbst das Ausgabeformat
wahlen.
5. Erstellen Sie eine Methode equals(Object o), mit der Sie Point mit
einem anderen Punkt vergleichen. Sie konnen sich aussuchen, ob Sie
equals mit instanceof oder getClass() implementieren, achten Sie aber
darauf, dass equals(null) immer false zuruckliefern muss.
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
}
