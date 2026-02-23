package StringHandling;

public class StringTest1 {
	public static void main(String[] args) {
		// String is characters of sequence or character array
		// String is object types
		// String is a class
		// String is immutable class

		char[] ch = { 'b', 'h', 'a', 'r', 'a', 't', 'h' };
		System.out.println(ch);

		String s1 = new String();
		System.out.println(s1);

		String name = "krishna"; // literal
		System.out.println(name);
		
		String name2=new String("bharath");   // String Object 
		System.out.println(name2);
	}
}
