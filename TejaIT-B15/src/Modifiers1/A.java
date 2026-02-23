package Modifiers1;

import Modifiers2.C;
import Modifiers2.D;

  class A extends C {

	protected int id;
		
	
       protected void m1() {
		System.out.println("a class m1 method..");
		System.out.println("a.m1");
		
	}
	
	 public static void main(String[] args) {
		A a=new A();
		System.out.println(a.id);
		a.m1();
		System.out.println("a.m1");

		a.m1();

		
	
		
		
		B b=new B();
		System.out.println(b.id);
		b.m1();
		
		C c=new C();
		System.out.println(c.id);
	     
		

		
		D d=new D();
		System.out.println(d.id);
		d.m1();
		
	}
	}


