package EXCEPT;

public class ExceptionTest1 {
	public void Arithametic() {

		// something value/zero //

		System.out.println("arithametic starts...");
		try {
			int i = 100;
			int j = 0;
			int k = i / j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			e.printStackTrace(); // it prints the exception
		}
		System.out.println("arithametic ends...");

		System.out.println("=================================");

	}

	public void ArrayIndex() {
		System.out.println("array index start...");

		try {
			int arr[] = new int[4];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			// arr[4]=50;
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // it prints the exception
		}

		System.out.println("array index end...");

		System.out.println("===================================");
	}

	public void NullPointer() {
		System.out.println("null pointer starts.....");
		try {
			Integer i = null;
			int k = 30;
			int j = i + k;
			System.out.println(j);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("null pointer ends...");

		System.out.println("=================================");
	}

	public void NumberFarmate() {
		System.out.println("number farmate starts......");
		try {
			String s = "123abc";
			Integer value = Integer.valueOf(s);
			System.out.println(value);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("number farmate ends.....");

		System.out.println("===============================");
	}

	public void Interrupted() {
		System.out.println("interrupted starts.....");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try { // complite exception //
				Thread.sleep(5000); // try and catch blocks //
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("interrupted ends.......");

		System.out.println("==============================");
	}

	public void Interrupted2() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
	}
	// throws declaration will pass the exception to the caller method //
	// one try block may associated with multiple catch blocks //
	// complite exception //
	// throws declaration //

	public static void main(String[] args) throws InterruptedException {
		ExceptionTest1 et = new ExceptionTest1();
		et.Arithametic();
		et.ArrayIndex();
		et.NullPointer();
		et.NumberFarmate();
		et.Interrupted();
		et.Interrupted2();
	}
}
