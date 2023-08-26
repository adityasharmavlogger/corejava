package in.com.java8;

public class TestHelloByLambda2 {
	
	public static void main(String[] args) {
		
		Hello2 h = new Hello2() {
			
			@Override
			public void sum(int a, int b) {
			}
		};
		
		h.defMethod();
		
		Hello2.staticMethod();
	}

}
