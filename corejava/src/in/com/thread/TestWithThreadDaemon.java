package in.com.thread;

public class TestWithThreadDaemon {
	
	public static void main(String[] args) {
		
		WithThread t1 = new WithThread("parents");
		
		t1.setDaemon(true);
		
		t1.start();
		
		for (int i = 1; i <= 10; i++) {
			
			try { Thread.sleep(200);

			} catch 
			(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i+"main");
			
		}
	}

}
