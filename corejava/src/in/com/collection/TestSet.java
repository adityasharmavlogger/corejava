package in.com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
public static void main(String[] args) {
		
		HashSet s = new HashSet();

		s.add(10); 
		s.add(20.5); 
		s.add("aditya"); 
		s.add(true); 
		
		System.out.println(s.contains("aditya"));

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}


}
