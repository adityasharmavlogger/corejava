package CollectionSorting;

import java.util.Comparator;

public class OrderByPhysics implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.getPhysics() - m2.getPhysics();
	}

}
