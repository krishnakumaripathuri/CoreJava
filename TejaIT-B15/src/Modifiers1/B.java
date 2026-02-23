package Modifiers1;

 class B {

	
	 protected int id;
	
	 protected void m1() {
		System.out.println("b class m1 method...");
	}
	
	public static void main(String[] args) {
		B b=new B();
		
		System.out.println(b.id);
		b.m1();
		
	}
}
