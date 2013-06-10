public class BubbleSort {
	
	public void sort(String[] array) {
		boolean unsortiert = true;
		String temp;
		int countervertauscht = 0;
		int counterdurchlauf = 0;
		int laufzeit = 0;
		while (unsortiert) {
			counterdurchlauf++;
			unsortiert = false;
			for (int i = 0; i < array.length-1; i++) {
				laufzeit++;
				if (array[i].compareTo(array[i+1]) > 0) {
					countervertauscht++;
					//  System.out.println("vertausche " + array[i] + " mit " + array[i+1]);
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					unsortiert = true;
				}
			}
		}
		// System.out.println("Laufzeit: " + laufzeit + " Vertauscht: " + countervertauscht + " Durchlauf: "+ counterdurchlauf);
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		String[] test = {"a", "c", "b", "z", "u"};
		bs.sort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]);
		}
		System.out.println();
		BubbleSort bs2 = new BubbleSort();
		String[] test2 = {"a", "b", "b", "c", "d"};
		bs2.sort(test2);
		for (int i = 0; i < test2.length; i++) {
			System.out.print(test2[i]);
		}/*
		System.out.println();
		BubbleSort bs3 = new BubbleSort();
		String[] test3 = {"a", "b", "c", "d"};
		bs3.sort(test3);
		for (int i = 0; i < test3.length; i++) {
		System.out.print(test3[i]);
		} */
		System.out.println("\nBest case: ");
		BubbleSort bs4 = new BubbleSort();
		String[] test4 = {"a", "b", "c", "d"};
		bs4.sort(test4);
		for (int i = 0; i < test4.length; i++) {
			System.out.print(test4[i]);
		}
		System.out.println("\nWorst case: ");
		BubbleSort bs5 = new BubbleSort();
		String[] test5 = { "d", "c", "b", "a"};
		bs5.sort(test5);
		for (int i = 0; i < test5.length; i++) {
			System.out.print(test5[i]);
		}
		System.out.println();
	}
}
