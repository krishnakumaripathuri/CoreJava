package Oops;

public class Employee2 {

	int id;
	String name;
	long salary;
	
	public Employee2() {
		System.out.println("zero arg constructor...");
	}
	
	public Employee2(int id,String name,long salary) {
		this. id=id;
		this .name=name;
		this.salary=salary;
		System.out.println("3 arg constructors...");
		
	}
	
	
	public static void main(String[] args) {
		Employee2 e2=new Employee2();
		System.out.println(e2.id+"   "+e2.name+"   "+e2.salary);
		
		Employee2 e3=new Employee2(15,"bharath",200000);
		System.out.println(e3.id+"   "+e3.name+"    "+e3.salary);
	}
}
