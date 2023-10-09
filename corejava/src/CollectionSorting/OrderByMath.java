package CollectionSorting;

import java.util.Comparator;

public class OrderByMath implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.getMaths() - m2.getMaths();
	}

}


