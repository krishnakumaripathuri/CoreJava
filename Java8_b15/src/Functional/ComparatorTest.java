
package Functional;

import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		Comparator<Integer> Com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return (506 - 205);
			}
		};

		Com.compare(506, 205);
		System.out.println("Comparatortest.............");

		System.out.println("=============================");

		Comparator<Integer> Com1 = (Integer o1, Integer o2) -> (506 - 205);
		                    Com1.compare(506, 205);
		System.out.println("Comparator test 2  .............");

	}
}
