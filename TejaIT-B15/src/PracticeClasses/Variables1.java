package PracticeClasses;

public class Variables1 extends Variables2 {

	
	String name = "krishna"; // instance variables //
	static double amount=123.45; // static variables //
	
	int val=30;
	int defaultval;
	
	public void test() {  // instance method //
		int val =120;
		System.out.println(val);  // default priority for local variables //
		System.out.println(this.val);  // this.instance variables //
		System.out.println(super.val); // super.class variables //
		defaultval=120;
		System.out.println(defaultval);  // default variables //
		
		int amount;
		    amount=11;
		System.out.println(amount); // local variables must initialize before calling it. //
		
	}
	
	public static void Test2() { // static method // 
		System.out.println("static method....");
	}
	
	public static void main(String[] args) {
		int id=20; // local variables //
		// class name  ref=new keyword constructor //
		Variables1 v1=new Variables1(); // object //
		System.out.println(v1.name); // ref.variablename //
		System.out.println(Variables1.amount); // classname.variable name //		
		
		v1.test();  // ref.methodname //
		Variables1.Test2(); // classname.methodname //
	}
}
