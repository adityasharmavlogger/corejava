package in.com.thread;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		ByRunnable r1 = new ByRunnable("aditya");
		
		ByRunnable r2 = new ByRunnable("sharma");
		
		Thread t1   = new Thread(r1);
		
		Thread t2   = new Thread (r2);
		
		
		t1.start();
		
		t2.start();
	}

}
