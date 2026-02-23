package variables;

public class variabletypes2 {

	String name="krishna";             //instance variable
	
	static double balance=45.39;       //static variable
	
	
	public static void main(String[] args) {
		
		int value=455;                  //local variable
		System.out.println("value::"+value);
		
		
		product prod=new product();
		System.out.println(prod.name);
		
		
		System.out.println(variabletypes2.balance);
		
		
	}
	
}
