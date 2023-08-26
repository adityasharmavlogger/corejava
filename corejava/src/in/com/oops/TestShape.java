package in.com.oops;

public class TestShape {
	
	public static void main(String[] args) {
		Shape []s  = new Shape [3];
		s[0]= new Circle(2);
		s[1]= new Triangle();
		s[2]= new Rectangle();
		for (int i = 0; i < s.length; i++) {
			s[i].area();
			
		}
		
		
			

	}
		
	}


