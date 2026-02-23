package Oops;

public class OverLoading1 {
	
	// polymorphism //
	
	// same class-same method names but different parameters and no.of parameters //

	public void M1() {
		System.out.println("this is m1 method..");
	}
	
	public void M1(int id) {
		System.out.println("m1 method ...id::"+id);
	}
	
	public void M1(int id,String name) {
		System.out.println("m1 method ...id::"+id+"name::"+name);
	}
	
	public void M1(short amt) {
		System.out.println("m1 method...amt::"+amt);
	}
	
	public static void main(String[] args) {
		
		OverLoading1 ol1=new OverLoading1();
		
		ol1.M1();
		ol1.M1(123);
		ol1.M1(20,"krishna");
		ol1.M1(142);
		
	}
}
