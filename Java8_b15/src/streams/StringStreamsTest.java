package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StringStreamsTest {
public static void main(String[] args) {
	List<String> list=Arrays.asList("krishnaa","bhargavi","thabitha","mariyamma","daniyelu");
	list.stream().filter(x->x.length()==8)
	.map(x->x)
	.sorted()
	.distinct()
	.limit(4)
	.skip(1)
	.forEach(x->System.out.println(x));
	System.out.println("==========FOREACH========");
	
	list.stream().forEach(x->System.out.println(x));
	
	System.out.println("=====================TERMINAL OPERATION=============================");
	System.out.println("===============FIND OPERATIONS===============");
	Optional<String> findfirst=list.stream().findFirst();
	System.out.println("FINDFIRST:: "+findfirst.get());
	
	Optional<String> findany=list.stream().findAny();
	System.out.println("FINDANY:: "+findany.get());
	
	System.out.println("==================MATCH OPERATIONS=========================");
	boolean allmatch=list.stream().allMatch(x->x.length()==9);
	System.out.println("ALLMATCH:: "+allmatch);
	
	boolean anymatch=list.stream().anyMatch(x->x.length()==7);
	System.out.println("ANYMATCH :: "+anymatch);
	
	boolean nonematch=list.stream().noneMatch(x->x.length()==11);
	System.out.println("NONE:: "+nonematch);
	
	System.out.println("===================COUNT=====================");
	
	long count=list.stream().count();
	System.out.println("count:: "+count);
	
	System.out.println("=================COLLECT=================");
	List<String> name=list.stream().filter(x->x.length()==8).collect(Collectors.toList());
	System.out.println(name);
}
}
