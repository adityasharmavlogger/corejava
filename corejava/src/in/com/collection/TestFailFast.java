package in.com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	
	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		c.add("pakaj");
		c.add("vishal");
		c.add("rahul");
		c.add("hardip");

		Iterator it = c.iterator();

		

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
