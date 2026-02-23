package Oops;

public class Employee {

	public Employee() {
		System.out.println("constructor");
	}
	
	public Employee(int id) {
		System.out.println("int arg constructor id::  "+id);
	}
	
	public Employee(int id,String name) {
		System.out.println("int & string arg cconstructor id:: "+id+        "name::"+name);
	}
	
	public static void main(String[] args) {
		Employee em=new Employee();
		Employee em1=new Employee(10);
		Employee em2=new Employee(10, "krishna");
	}
}
