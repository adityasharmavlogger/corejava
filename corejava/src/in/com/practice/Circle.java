package in.com.practice;

public class Circle extends Shape {
	
	
	private int radius =0;
	
	
	public static final double PI=3.14;
	   
	
	public void setRadius(int radius) {
		this.radius=radius;
		
	}
	
	public int getradius() {
		return radius;
		
	}
	
	public   double carea () {
		
		double carea = PI * (getradius()*getradius());
		System.out.println("circle area "+ carea);
		return carea;
	
	}	
	}
	
	




