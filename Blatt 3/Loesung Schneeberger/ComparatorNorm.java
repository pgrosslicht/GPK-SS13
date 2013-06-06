import java.util.Comparator;


public class ComparatorNorm<A extends Comparable<A>> implements Comparator<A>{

	@Override
	//herkömmliche compare-methode liefert 
	//negativ, wenn o1 < o2
	//0, wenn o1 == o2
	//positiv, wenn o1 > o2
	public int compare(A o1, A o2) {
		return o1.compareTo(o2);
		//liefert 
		//negativ, wenn o1 < o2
		//0, wenn o1 == o2
		//positiv, wenn o1 > o2
	}

}
