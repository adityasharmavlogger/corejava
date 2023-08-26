package in.com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class ReadByKeyBoard {


	public static void main(String[] args) throws Exception {
		
		System.out.println("plz enter here...");
		
		InputStreamReader isReader = new InputStreamReader (System.in);
		
		BufferedReader in = new BufferedReader(isReader);
		
		FileWriter write = new FileWriter ("C:\\Users\\aadis\\Desktop\\IO\\xyz.txt");
		
		PrintWriter out = new PrintWriter(write);
		
		String line = in.readLine();
		
		while (!(line.equals("bye"))) {
			
			out.print(line);
			
			line =in.readLine();
		}
		
		System.out.println("This Compiler is stopped...!!!");
		
		out.close();
		write.close();
		isReader.close();
		
		
		
	}

}
