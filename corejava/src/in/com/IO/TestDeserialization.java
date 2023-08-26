package in.com.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args)throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\aadis\\Desktop\\IO\\aditya.txt");
		
		ObjectInputStream in  = new ObjectInputStream(file);
		Object o              = in.readObject();
		Marksheet   m            = (Marksheet) o;
		
		
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.total);
		
		
		in.close();
		file.close();

	}

}
