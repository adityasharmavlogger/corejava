package in.com.IO;

import java.io.Serializable;

public class Marksheet implements Serializable {
	
	int id = 0;
	String name = null;
	int physics =0;
	int chemistry = 0;
	int maths =0;
	transient int total =0;

}
