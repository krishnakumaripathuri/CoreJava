package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		Customer c1 = new Customer(101, "krishna", 74165010, 9505);
		System.out.println(c1);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajas\\Videos\\Customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); // written code converts into byte code //
		oos.writeObject(c1); // writing object
		oos.close();
		fos.close();
		System.out.println("serialization done....");
	}
}
