package Functional;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		// ananomous inner type //
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}

		};
		con.accept("BHARATH");
		System.out.println("========================");

		// lambda //

		Consumer<String> con2 = t -> System.out.println(t);
		con2.accept("BHARATH");

	}
}
