package Functional;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		// Ananomus inner type
		Predicate<Integer> p1 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return 10 / 10 == 1;
			}

		};

		boolean result = p1.test(10);
		System.out.println(result);

		System.out.println("========================");
		
		// Lambda

		Predicate<String> p2 = t -> t.length() == 7;

		boolean result2 = p2.test("krishna");
		System.out.println(result2);

	}
}
