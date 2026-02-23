package Oops;

public class Customer {

	int id;
	String name;
	int age;
	double amount;
	public Customer(int id, String name, int age,double amount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.amount=amount;
	}
	
	public Customer() {
		
	}
	
	public static void main(String[] args) {
		Customer c=new Customer(25, "krishna",20,25000);
		System.out.println(c.id+"   "+c.name+"    "+c.age+"    "+c.amount  );
		
		 Customer c1=new Customer();
	}
}
