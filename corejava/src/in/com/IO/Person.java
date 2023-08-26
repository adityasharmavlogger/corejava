package in.com.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {
	
	int id =0;
	transient String name = null;
	
	String address = null;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		
		out.writeObject(name);

		out.writeObject(address);

		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		id = in.readInt();
		name =(String) in.readObject();
		address =(String)in.readObject();
		
	}
	
	

}
