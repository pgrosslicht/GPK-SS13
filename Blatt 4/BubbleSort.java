public class BubbleSort {
	
	public void sort(String[] array) {
		boolean unsortiert = true;
		String temp;
		while (unsortiert) {
			for (int i = 0; i < array.length-1; i++) {
				unsortiert = false;
				if (array[i].compareTo(array[i+1]) > 0) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					unsortiert = true;
				}
			}
		}
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
		bs2.sort(test);
		for (int i = 0; i < test2.length; i++) {
			System.out.print(test2[i]);
		}
		System.out.println();
		BubbleSort bs3 = new BubbleSort();
		String[] test3 = {"a", "b", "c", "d"};
		bs3.sort(test);
		for (int i = 0; i < test3.length; i++) {
			System.out.print(test3[i]);
		}
		System.out.println();
	}
}
