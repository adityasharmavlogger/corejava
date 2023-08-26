package in.com.thread;

public class TestRacing {
	public static void main(String[] args) {
		
		Racing t1 = new Racing("aditya");
		
		Racing t2 = new Racing("sharma");
		
		t1.start();
		t2.start();
	}

}
