public class Bubble { 
	static void sort(String[] array) {
		boolean unsortiert=true;
		String[] temp;
		
		while (unsortiert){
			unsortiert = false;
			for (int i=0; i < array.length-1; i++) 
			if (array[i].compareTo(array[i+1]) > 0 ) {                      
				temp       = array[i];
				array[i]       = array[i+1];
				array[i+1]     = temp;
				unsortiert = true;
			}          
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("\nWorst case: ");
		String[] liste = {"g","f","e","d","c","b","a"};
		sort(liste);
		for (int i=0; i<liste.length; i++) 
			System.out.print(liste[i]+" ");  
		System.out.println("\nBest case: ");
		String[] liste2 = {"a","b","c","d","e","f","g"};
		sort(liste2);
		for (int i=0; i<liste.length; i++) 
			System.out.print(liste[i]+" ");      
	} 
}
