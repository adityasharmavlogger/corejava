package in.com.java8;

public class TestHelloByLambda1 {
	
	public static void main(String[] args) {
		
		
		Hello1 h = (a,b) -> {
			
			int c =a +b;
			System.out.println("sum = " +c);
		};
		h.sum(10,20);
	}

}
