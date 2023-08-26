package in.com.java8;

public class TestHello {
	
	public static void main(String[] args) {
		
		Hello h = new Hello() {
			
			@Override
			public void sum() {
				System.out.println("sum method...!!!");
				
			}
		};
		
		h.sum();
		
	}

}
