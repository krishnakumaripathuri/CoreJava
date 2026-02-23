package Collect;

import loops.student;

public class Student implements Cloneable{
int id;
String name;

public static void main(String[] args) throws CloneNotSupportedException {
	Student s1=new Student();
	s1.id=123;
	s1.name="krishna";
	System.out.println(s1.id+"  "+s1.name);
	
	// clone method   
	
	Student s2=(Student) s1.clone();
	System.out.println(s2.id+"  "+s2.name);
	System.out.println(s2.getClass());
}
}

