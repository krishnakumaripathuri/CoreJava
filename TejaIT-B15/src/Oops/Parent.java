package Oops;

public class Parent {
	
	public void M1(int id) {
		System.out.println("parent m1 method..id::"+id);
	}
	
	public void M2() {
		System.out.println("parent m2 method..");
	}
	
	public void M3() {
		System.out.println("parent m3 method...");
	}
	
	public static void main(String[] args) {
		Parent p1=new Parent();
		
		p1.M1(10);
		p1.M2();
		p1.M3();
	}

}
