package StringHandling;

public class Test2 {
	public void m1(String str) {
		System.out.println("string ...." + str);
	}

	public void m1(StringBuffer sbr) {
		System.out.println("String Buffer..." + sbr);
	}

	public void m1(StringBuilder sbu) {
		System.out.println("String Builder..." + sbu);
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		// t2.m1(null); // ambiguous error

		t2.m1("krishna");

		StringBuffer sbf = new StringBuffer("String Buffer....");
		t2.m1(sbf);

		StringBuilder sbu = new StringBuilder("String Builder...");
		t2.m1(sbu);

	}

}
