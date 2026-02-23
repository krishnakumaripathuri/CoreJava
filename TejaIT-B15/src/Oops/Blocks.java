package Oops;

public class Blocks {
	
	//  static block //
	
	static { 
		System.out.println("static block..");
		
		}
	// instance block //
	
	{
		System.out.println("instance bolck..");
	}
	
	
     //constructor//

	public Blocks() {  
		System.out.println("constructor..");
	}
	
	public void m1() {
		System.out.println("m1 method...");
	}
	
	public static void main(String[] args) {
		Blocks b = new Blocks();  // constructor && instance blocks //
		
	}
}
