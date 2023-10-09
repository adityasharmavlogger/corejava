package in.com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics {
	
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("aditya");
		names.add("raju");
		names.add("rajkumar");
		names.add("sanjay");

		String name = names.get(0);

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}


	}
}
