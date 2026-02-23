package logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {

public static void main(String[] args) {
	   List<Integer> l1= Arrays.asList(1,2,3,4);
       List<Integer> l2=Arrays.asList(3,4,5,6);
       
     List<Integer> Common=l1.stream()
    		 .filter(x->x !=0)
    		.distinct()
    		.skip(2)
    		.collect(Collectors.toList());
     
   System.out.println(Common);
   
   List<Integer> common1=l2.stream()
		   .filter(x->x!=0)
		   .distinct()
		   .limit(2)
		   .collect(Collectors.toList());
   System.out.println(common1);
       
    		   
    		  
      


	
}

}
