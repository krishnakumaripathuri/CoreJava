package Logical;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,5,1,15,11,10,7,8,9);
	list.stream().filter(x->x%2==0).forEach(System.out::println);
}
}
