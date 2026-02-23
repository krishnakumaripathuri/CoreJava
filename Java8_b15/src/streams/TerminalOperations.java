package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TerminalOperations {
public static void main(String[] args) {
	// RANGE
	IntStream.range(0, 15).forEach(System.out::println);
	System.out.println("===================");
	
	// PARALLEL
	IntStream.range(5, 20).parallel().forEach(System.out::println);
	
	// PARALLEL NUMBERS ORDER
	IntStream.range(10,20 ).parallel().forEachOrdered(System.out::println);
	
	System.out.println("===========TO ARRAY================");
	List<Integer> list=Arrays.asList(12,14,1,5,7,8,17,19);
	Object[] arr1=list.toArray();     // CORE JAVA   
	//System.out.println("arr1 :: "+arr1);
	Object[] arr2=list.stream().toArray();
	//System.out.println("arr2 :: "+arr2);
	Integer[] arr3=list.stream().toArray(x->new Integer[x]);
	//System.out.println("arr3 :: "+arr3);
	Integer[] arr4=list.stream().toArray(Integer[]::new);
	//System.out.println("arr4 :: "+arr4);
	
	System.out.println("==============REDUCE=============");
	int sum=list.stream().reduce((x,y)->x+y).get();
	System.out.println(sum);
	list.stream().reduce((x,y)->Integer.min(x,y)).get();
	list.stream().reduce(Integer::max).get();
}
}
