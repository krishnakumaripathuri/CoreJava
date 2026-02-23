package Oops;

public class OverLoading2 {
	
	//  same method names and same parameters-but taken different data types // 
	

	public void M1(int id) {
		System.out.println("m1 method  id::"+id);
	}
	
	public void M1(String name) {
		System.out.println("m1 method  name::"+name);
	}
	
	public void M1(double amt) {
		System.out.println("m1 methos  double::"+amt);
	}
	
	public static void main(String[] args) {
		OverLoading2 ol2=new OverLoading2();
		
		ol2.M1(30);
		ol2.M1("krishna");
		ol2.M1(12.52);
	}
}
