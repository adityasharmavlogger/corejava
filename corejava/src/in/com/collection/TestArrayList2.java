package in.com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {
	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		
		
		c.add(56);        
		c.add(30.5);     
		c.add("pankaj"); 
		c.add(true);    

		
		
		int i = (int) c.get(0);
		double d = (double) c.get(1);
		String s = (String) c.get(2);

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);

		
		boolean flag = c.contains("Ram");
		System.out.println(flag);

		
		int ind = c.indexOf("Ram");
		System.out.println("Index of pankaj " + ind);

		
		c.set(2, "Vishal");

		
		String r = (String) c.remove(2);
		System.out.println(r);

		
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
		

	
