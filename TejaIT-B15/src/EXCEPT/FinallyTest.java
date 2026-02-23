package EXCEPT;

public class FinallyTest {

	// either exception getting or not always finally block will execute //
	
	public void m1() {
		try {
			int i = 100;
			int j = 0;
			int k = i / j;
			System.out.println(k);
			System.out.println("try block");
		} catch (ArithmeticException e) {
			System.out.println("catch block");
			e.printStackTrace();
		} finally {
			// connections,session,files //
			System.out.println("finally block");
		}

	}

	public static void main(String[] args) {
		FinallyTest ft = new FinallyTest();
		ft.m1();
	}
}
