package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DESerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("C:\\Users\\rajas\\Videos\\Customer.txt");
	ObjectInputStream obs=new ObjectInputStream(fis);
	Object obj= obs.readObject();
	
	Customer c=(Customer) obj;
	System.out.println(c);
	obs.close();
	fis.close();
	
	}
}
