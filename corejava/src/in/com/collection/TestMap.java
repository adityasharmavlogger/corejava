package in.com.collection;

import java.util.HashMap;


import javax.swing.text.html.HTMLDocument.Iterator;

public class TestMap {
	public static void main(String[] args) {

		HashMap map = new HashMap();

		// Store key and value pair
		map.put("R01", "Ram");
		map.put("R02", "Shyam");
		map.put("R03", "Jay");
		map.put("R04", "Vijay");

		System.out.print("R03: ");
		System.out.println(map.get("R03"));

		
		
		Set keys = map.keySet();
		Iterator it = keys.iterator();

		System.out.println("**Keys of Map**");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
		Collection vals = map.values();
		it = vals.iterator();

		System.out.println("**Values of Map**");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
