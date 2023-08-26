package in.com.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadExternalizable {
	
	public static void main(String[] args)throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\aadis\\Desktop\\IO\\tcl.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Object o = in.readObject();
		
		Person p  =(Person) o;
		
		
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.address);
		
		
		in.close();
		file.close();
		
		
		
	}

}
