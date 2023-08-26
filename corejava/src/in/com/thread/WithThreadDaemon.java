package in.com.thread;

public class WithThreadDaemon extends Thread{
	
	String name = null;
	int       i = 1;
	
	public WithThreadDaemon(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		while (true) {
			try { Thread.sleep(400);
				
			} catch
			(InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i +"" + name);
			
			i++;
		}
	}
}
