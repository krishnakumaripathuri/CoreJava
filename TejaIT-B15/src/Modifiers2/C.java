package Modifiers2;

public class C {
	public int id;
	
      void m1() {
		System.out.println("c class m1 method...");
	}
	
	public static void main(String[] args) {
		C c=new C();
		
		System.out.println(c.id);
		c.m1();
		
	}

}
