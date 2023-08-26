package in.com.oops;

public class Circle extends Shape {
	
	private int radius = 0;
	public static final double PI = 3.14;
	
	
	public Circle(int radius) {
		this.radius=radius;
		
	}


	public int  getRadius () {
		return radius;
		
	}
	
	public void setRadius (int radius ) {
		this.radius = radius;
	}
	
	public void area () {
		double cArea = PI* (getRadius()*getRadius());
		System.out.println("Circle area"+ cArea);
		
	}
}
