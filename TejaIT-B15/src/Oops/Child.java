package Oops;

public class Child extends Parent {

   //  @Override //

	public void M1(int id) {
		System.out.println("child m1 method..id::"+id);
	}
	
	public void M2() {
		System.out.println("child m2 method");
	}
	
	public void M3() {
		System.out.println("child m3 method");
	}
	
	public static void main(String[] args) {
		Child c1=new Child();
		
		c1.M1(10);
		c1.M2();
		c1.M3();
	}

}
