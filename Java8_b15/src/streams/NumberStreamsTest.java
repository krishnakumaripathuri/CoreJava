package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NumberStreamsTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 3, 45, 58, 2, 1, 95, 45, 85, 15, 13, 12, 7, 9, 6, 4);
		list.stream().filter(x -> x % 2 == 0) // to apply condition   (INTERMIDIATE OPERATION)
				     .map(x -> x * 2) // to apply the logic
				     .sorted() // to sort the objects
				     .distinct() // to remove the duplicate objects
				     .limit(4) // limit the result
				     .skip(2) // skip the result
				     .forEach(x -> System.out.println(x)); // to iterate the objects  (TERMINAL OPERATION)
		
		System.out.println("=====================================");

		list.stream().forEach(x -> System.out.println(x));
	System.out.println("=====================collect===================");
	List<Integer> oddlist=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
	System.out.println(oddlist);
	
	System.out.println("=================min============");
	int min=list.stream().mapToInt(x->x).min().getAsInt();
	System.out.println("min ::"+min);
	
	System.out.println("==================max===============");
	OptionalInt max =list.stream().mapToInt(x->x).max();
	System.out.println("max  ::"+max.getAsInt());
	
	System.out.println("===============count===============");
	long count=list.stream().count();
	System.out.println(" count ::"+count);
	
	System.out.println("============sum===================");
	long sum=list.stream().mapToInt(x->x).sum();
	System.out.println("sum :: "+sum);
	
	System.out.println("============match operations======================");
	boolean anymatch=list.stream().anyMatch(x->x==2);
	System.out.println(anymatch);
	
	boolean allmatch=list.stream().allMatch(x->x<100);
	System.out.println(allmatch);
	
	boolean nonematch=list.stream().noneMatch(x->x==2);
	System.out.println(nonematch);
	
	System.out.println("================find operations==================");
	Optional<Integer> findfirst=list.stream().findFirst();
	System.out.println(findfirst.get());
	
	Optional<Integer> findany=list.stream().findAny();
	System.out.println(findany.get());
	}
}




// Stream API:
//  It is used to process the collection of Objects
//  Stream will process the sequence of Objects and it can be pipelined to get the
// required result
//  Streams doesn’t change original data, it will pipeline the data only by using methods,
// like filter, map, distinct etc.,
//  It doesn’t store any data
//  It will useful to do functional programming, using lamda expression
//  Streams will support both parallel and sequential processing
//  All the Java stream API interfaces and classes are in java.util.stream package
