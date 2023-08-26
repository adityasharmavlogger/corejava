package in.com.IO;

import java.io.FileReader;
import java.util.Scanner;


public class TestScanner {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader ("C:\\Users\\aadis\\Desktop\\IO\\aditya.txt");
		
		Scanner sc = new Scanner (file);
		
		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		file.close();
		}

}
