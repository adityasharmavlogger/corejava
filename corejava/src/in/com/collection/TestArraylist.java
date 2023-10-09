package in.com.collection;

import java.util.ArrayList;

public class TestArraylist {
	
	public static void main(String[] args) {
		
		ArrayList c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		
		System.out.println("size:" + c.size());
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		
		
		int ind = c.indexOf(3);
		System.out.println("Index" + ind);
	}

}
