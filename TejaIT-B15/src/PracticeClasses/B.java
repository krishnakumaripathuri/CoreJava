package PracticeClasses;
// Child
public class B extends A {
String name="krishna";
public void Car() {
	System.out.println("b class car method...");
}

public void bike() {
	System.out.println("child bike ....");
}

public static void main(String[] args) {
	B b=new B(); // child class or sub - class //
	b.Car();
	System.out.println(b.name);
	System.out.println(b.id);
	b.Gold();
	
	
	System.out.println("===============================");
	
	
	A a = new A(); // parent class - super class //
	System.out.println(a.id);
	a.Gold();
	
	// a.car();  parent object can't access child data //
	// System.out.println(a.name);
	a.Car();
	System.out.println("======================");
	
	
	A a1=new B();
	a1.Car();
	a1.Gold();
	 // a1.bike();
	
	
}
}
