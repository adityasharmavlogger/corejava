package in.com.collection;

public class TestAutoboxing {
	
	public static void main(String[] args) {
		
		

		double d = 6.3;
		Double od = new Double(d);
		double d1 = od.doubleValue();

		char c = 'A';
		Character oc = new Character(c);
		char c1 = oc.charValue();

		boolean b = true;
		Boolean ob = new Boolean(b);
		boolean b1 = ob.booleanValue();

		
		od = d; 
		d = od; 
		oc = c;
		c = oc;

		ob = b;
		b = ob;

		System.out.println(d);
		System.out.println(od);
		System.out.println(c);
		System.out.println(oc);
		System.out.println(ob);
		System.out.println(ob);

	}

}
