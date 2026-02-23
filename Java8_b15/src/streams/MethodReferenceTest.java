package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 1, 15, 0, 2, 6, 4, 8, 10);

		list.stream()
		.filter(x -> x % 2 == 0)
		.map(x -> x + 2)
		.forEach(System.out::println);

		System.out.println("===============using static method=================");
		// using lambda
		list.stream()
		.filter(x -> References.even(x))
		.map(x -> References.addition(x))
		.forEach(System.out::println);

		System.out.println("=======================");
		// using method references
		list.stream()
		.filter(References::even)
		.map(References::addition)
		.forEach(System.out::println);

		System.out.println("===============using instance method=================");
		References ref = new References();
		// using lambda
		list.stream()
		.filter(x -> ref.odd(x))
		.map(x -> ref.multiply(x))
		.forEach(System.out::println);

		System.out.println("=======================");
		// using method references
		list.stream()
		.filter(ref::odd)
		.map(ref::multiply)
		.forEach(System.out::println);
		
		System.out.println("=======================ARBITORY METHOD REFERENCE=========================");
		List<String>list1=Arrays.asList("suresh","krishna","rakesh","rajesh","kumari","joshna","nageena","harika");
		list1.stream()
		.filter(x->x.contains("s"))
		.map(x->x.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++++++++++");
        list1.stream()
		.filter(x->x.contains("a"))
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("=====================new object======================");
		        // inpute // output
		//Function<String,Integer> fun= t -> new Student(t);
		Function<Integer, Student> fun=Student::new;
		Student stu=fun.apply(101);
		System.out.println(stu);
		
	}

}
