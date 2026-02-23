package logical;

public class Fibonacciseries {
	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21

		int num = 7;
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i <= num; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a + b;
		}
	}

}
