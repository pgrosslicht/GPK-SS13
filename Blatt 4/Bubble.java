public class Bubble { 
	public static void sortiere(int[] x) {
		boolean unsortiert=true;
		int temp;
		
		while (unsortiert){
			unsortiert = false;
			for (int i=0; i < x.length-1; i++) 
			if (x[i] > x[i+1]) {                      
				temp       = x[i];
				x[i]       = x[i+1];
				x[i+1]     = temp;
				unsortiert = true;
			}          
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("\nBest case: ");
		int[] liste = {1,2,3,4,5,6,7,8,9};
		sortiere(liste);
		for (int i=0; i<liste.length; i++) 
			System.out.print(liste[i]+" ");  
		System.out.println("\nWorst case: ");
		int[] liste2 = {9,8,7,6,5,4,3,2,1};
		sortiere(liste2);
		for (int i=0; i<liste.length; i++) 
			System.out.print(liste[i]+" ");      
	} 
}
