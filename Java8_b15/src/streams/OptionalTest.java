package streams;

import java.util.Optional;

public class OptionalTest {
public static void main(String[] args) {
	// to avoid null checks and null pointer exception
	//Optional<String> opt1=Optional.of(null);
	//System.out.println(opt1);
	
	Optional<String> opt2=Optional.ofNullable(null);
	System.out.println(opt2);
	
	String s="java";
	if(s!=null) {
		System.out.println(s.toUpperCase());
	}else {
		System.out.println("data is getting null");
	}
	if(opt2.isPresent()) {
		
	}else {
		
	}
	
	Object opt3=Optional.ofNullable("java").orElse("data is getting null");
	System.out.println(opt3);
    // if it is mentioned the type it will execute
	
	Object opt4=Optional.ofNullable(null).orElseThrow(()->new RuntimeException("data is getting null"));
	System.out.println(opt4);       
	// if not provide type will get exception .
	
}
}
