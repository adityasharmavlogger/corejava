package in.com.IO;

import java.io.File;
import java.sql.Date;

public class TestFile {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\aadis\\Desktop\\IO\\aditya.txt");
		
		
		if(f.exists()) {
			System.out.println("Name"+f.getName());
			System.out.println("Absolute path:"+f.getAbsolutePath());
			System.out.println("Is writable:"+f.canWrite());
			System.out.println("Is redable:"+f.canRead());
			System.out.println("Is File"+f.isFile());
			System.out.println("Is Directory"+f.isDirectory());
			System.out.println("Last Modified at"+ new Date(f.lastModified()));
			System.out.println("Size"+f.length()+"bytes long.");
		}
	}

}
