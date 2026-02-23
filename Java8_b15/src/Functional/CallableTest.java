package Functional;

import java.util.concurrent.Callable;

public class CallableTest {
public static void main(String[] args) throws Exception {
	Callable<Integer> c1=new Callable<Integer>() {
		
		@Override
		public Integer call() throws Exception {
			return 506;
		}
	};
	
	Integer val=c1.call();
	System.out.println(val);
	
	System.out.println("=====================");
	
Callable<Integer> c2=() -> 708;
	Integer val1=c2.call();
	System.out.println(val1);

}
}
