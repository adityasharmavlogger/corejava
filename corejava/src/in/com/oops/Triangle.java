package in.com.oops;

public class Triangle extends Shape {
	
	private int base = 0;
	
	private int height = 0;
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
	     this.base = base;
	}
	public void setHeight(int height) {
		this.height= height;
}
	
	
	public int getHeight() {
		return height;
	}
	
	
	public void area() {
		
		double Area = (getBase() * getHeight() / 2);
		
		System.out.println("Triangle Area = " +Area);
		
	}

}
