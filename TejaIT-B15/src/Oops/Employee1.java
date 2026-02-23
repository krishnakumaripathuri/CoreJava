package Oops;

public class Employee1 {

	int id;
	String name;
	long salary;
	
	public Employee1 () {
		System.out.println("employee constructor..");
	}
	
	public Employee1(int empid ) {
		id=empid;  // re - initilaization  //
		System.out.println("int arg constructors..");
	}
	
	public Employee1(int empid,String empname) {
		id=empid;
		name=empname;
		System.out.println("int & string arg constructors ...");
	}
	
	public Employee1(int empid,String empname,long empsalary) {
		id=empid;
		name=empname;
		salary=empsalary;
		System.out.println("3 arg constructors...");
	}
	
	public static void main(String[] args) {
		Employee1 em=new Employee1();
		System.out.println(em.id);
		
		System.out.println(em.id+"  "+em.name+"    "+em.salary); // at a time three variables print out //  
		
		Employee1 em1=new Employee1(10);
		System.out.println(em1.id+"   "+em1.name+"   "+em.salary);
		Employee1 em2=new Employee1(15,"krishna");
		System.out.println(em2.id+"  "+em2.name+"   "+em2.salary);
		Employee1 em3=new Employee1(20, "krishna", 20000);
		System.out.println(em3.id+"   "+em3.name+"    "+em3.salary);
		
	}
}
