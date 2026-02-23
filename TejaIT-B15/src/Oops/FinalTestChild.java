package Oops;

public class FinalTestChild extends FinalTestParent {

     int id =10; 
	
	@Override
	public void m1() {
		System.out.println("child m1 method...");
	}
	
	@Override
	public void m2() {
		 id=155;
	  System.out.println(id);
	}
	
	public static void main(String[] args) {
		FinalTestChild FTD=new FinalTestChild();
		
		FTD.m1();
		FTD.m2();
		
	}
}
