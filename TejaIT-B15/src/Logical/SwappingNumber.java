package Logical;

public class SwappingNumber {

	// swapping number //
	 
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		i=i+j; // 10+20=30
		j=i-j;  // 30-20=10
		i=i-j;   // 30-10=20
		
		System.out.println("i::"+i);
		System.out.println("j::"+j);
	}
	
	// j=j+i
	// i=j-i;
	// j=j-i;		
}
