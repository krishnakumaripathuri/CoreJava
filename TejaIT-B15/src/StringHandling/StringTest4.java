package StringHandling;

public class StringTest4 {
	public static void main(String[] args) {
		String s1 = "Keerthi";
		String s2 = "keerthana";
		String s3 = s1 + s2;
		System.out.println(s3);

		// String is a immutable class - we can't modifty the data
		String s4 = "KEERTHI";
		String s5 = s4.concat("   KEERTHANA");
		System.out.println(s5);

	}
}

