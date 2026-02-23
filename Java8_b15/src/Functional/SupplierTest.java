package Functional;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		
		// Ananomus inner type
		Supplier<Integer> S1 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return 7 * 5;
			}

		};
		System.out.println(S1.get());
		System.out.println("=======================");

		// lambda

		Supplier<Integer> S2 = () -> 8 * 8;
		System.out.println(S2.get());

	}
}
