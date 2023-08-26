package in.com.oops;

import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws Exception {
		
		String str ="11/08/2023";
		
		SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");
		
		Person p = new Person();
		
		p.setld(10);
		p.setName("vishal");
		p.setDob(sdf.parse(str));
		
		System.out.println(p.getld());
		
		System.out.println(p.getName());
		
		System.out.println(sdf.format(p.getDob()));
		
	}

}
