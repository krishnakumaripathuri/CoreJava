package Oops;

public abstract class NSE {
	
	//hides the un - necessary data , show the necessary date //
	
	// normal methods - implementation // 
	
	//we can provide implementation for abstract class access in child class only //
	

	public void StockInfo() {
		System.out.println("infosys,tcs,zomato,bajaj,jio");
	}
	
	public void IPO() {
		System.out.println("flipkart,blinkit,amazon");
	}
	
	public void Holidays() {
		System.out.println("agu15,dec25,jan1");
	}
	
	// abstract methods - data hiding //
	
	public abstract void brokeragecharges();
		
	
	public static void main(String[] args) {
	  //	NSE nse=new NSE();  // we can't Creat Object in abstract method //
	}
	
	{
		System.out.println("NSE instance blocks");  // we can Creat Instance Blocks in abstract method //
	}
	
	static {
		System.out.println("NSE static blocks");  // we can Creat Static Blocks in abstract method // 
	}
	
	public NSE() {
		System.out.println("NSE Constructor ");  // we can Creat Constructor in abstract method //
	}
	
}
