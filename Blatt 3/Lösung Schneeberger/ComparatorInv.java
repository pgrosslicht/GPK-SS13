import java.util.Comparator;


public class ComparatorInv<A extends Comparable<A>> implements Comparator<A>{

	@Override
	public int compare(A o1, A o2) {
		return o2.compareTo(o1);

	}

}
