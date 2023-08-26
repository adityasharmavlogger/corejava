package in.com.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerialzable {
	
	public static void main(String[] args) throws Exception {
		
		Marksheet m = new Marksheet();
		m.id        = 1;
		m.name      = "aditya";
		m.physics   = 75;
		m.chemistry = 88;
		m.maths     = 78;
		m.total     = m.physics+m.chemistry+m.maths;
		
		
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\aadis\\Desktop\\IO\\aditya.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(m);
		
		out.close();
		file.close();
		
		System.out.println("Object write successfully");
		
		
	}

}
