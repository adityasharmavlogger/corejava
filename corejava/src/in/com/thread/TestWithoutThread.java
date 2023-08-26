package in.com.thread;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("aditya");
		WithoutThread t2 = new WithoutThread("sharma");
		
		t2.run();
		t1.run();
	}

}
