package in.com.oopsabstract;

public class TestLogic extends Logic {
	
	public static void main(String[] args) {
		
		TestLogic l = new TestLogic();
		
		l.sum();
		l.area(); 
		
	}

	@Override
	public int area() {
		System.out.println("area method...!!!");
		return 0;
	}

	@Override
	public int sum() {
		System.out.println("sum method...!!!");
		return 0;
	}

}
