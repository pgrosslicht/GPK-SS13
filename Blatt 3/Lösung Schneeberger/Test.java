import java.util.Comparator;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyCompList<Integer> list = new MyCompList<Integer>();
		list.addFirst(15);
		list.addFirst(14);
		list.addFirst(16);
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addLast(0);
		list.addFirst(17);
		

		Comparator<Integer> c = new ComparatorInv<Integer>();
		Comparator<Integer> c1 = new ComparatorNorm<Integer>();
		System.out.println(list.minimum());
		System.out.println(list.minimum(c));
		System.out.println(list.minimum(c1));

	}

}
