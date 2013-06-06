import java.util.Comparator;


public class MyCompList<A extends Comparable<A>> extends MyList<A>{

	public A minimum(){
		int size = super.size();
		if (size==0)return null;
		else{
			A min = super.get(0);
			for (int i=1; i<size ; i++){
				A elem = super.get(i);
				if(elem.compareTo(min) < 0) min = elem;
			}
			return min;
		}
	}
	
	public A minimum(Comparator<A> comp){
		int size = super.size();
		if (size==0)return null;
		else{
			A min = super.get(0);
			for (int i=1; i<size ; i++){
				A elem = super.get(i);
				if(comp.compare(elem, min) < 0) min = elem;
			}
			return min;
		}
	}
	
}
