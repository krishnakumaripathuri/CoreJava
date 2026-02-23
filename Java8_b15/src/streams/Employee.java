package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String name;
	int age;
	String dept;
	long salary;

	public Employee(int id, String name, int age, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
  public void setId(int id) {
		this.id = id;
	}
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}

     public int getAge() {
		return age;
	}
     public void setAge(int age) {
		this.age = age;
	}
public String getDept() {
		return dept;
	}
public void setDept(String dept) {
		this.dept = dept;
	}
public long getSalary() {
		return salary;
	}
public void setSalary(long salary) {
		this.salary = salary;
	}
@Override
	public String toString() {
		return "Employee[id= " + id + ", name=  " + name + ", age=  " + age + ", dept=  " + dept + ", salary= "+ salary + "]";
				
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "krishna", 22, "java", 120000);
		Employee e2 = new Employee(2, "daniyelu", 35, "aws", 550000);
		Employee e3 = new Employee(3, "bhargavi", 18, "sql",  55000);
		Employee e4 = new Employee(4, "thabitha", 16, "java",550000);
		Employee e5 = new Employee(5, "mariyamma", 33, "sql",120000);
		Employee e6 = new Employee(6, "mohana", 38, "aws",   850000);
		Employee e7 = new Employee(7, "sandhya", 28, "java", 155000);
		Employee e8 = new Employee(8, "adithya", 30, "sql",  550000);
		Employee e9 = new Employee(9, "suresh", 32, "aws",   650000);
		Employee e10=new Employee (10, "baby", 29, "sql",     50000);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		                          list.stream()
		                              .filter(y -> y.salary!=0)
		                              .map(y -> y.dept)
		                              .sorted()
		                              .distinct()
		                              .limit(6)
		                              .skip(0)
	                                  .forEach(y -> System.out.println(y));
		                           System.out.println("=========================");

		System.out.println("=================TERMINAL OPERATIONS===========");
		System.out.println("=============COLLECT==============");
		List<Employee> list1 = list.stream().collect(Collectors.toList());
		System.out.println(list1);

		System.out.println("====================MIN==================");
		long salary = list.stream().mapToLong(y -> y.salary).min().getAsLong();
		System.out.println("minimum salary ::" + salary);

		int age = list.stream().mapToInt(y -> y.age).min().getAsInt();
		System.out.println("minimum age ::" + age);

		System.out.println("=================MAX============");
		long salary1 = list.stream().mapToLong(y -> y.salary).max().getAsLong();
		System.out.println("maximum salary ::  " + salary1);

		int age1 = list.stream().mapToInt(y -> y.age).max().getAsInt();
		System.out.println("maximum age  ::" + age1);

		System.out.println("===================COUNT======================");
		long count = list.stream().count();
		System.out.println("count ::" + count);

		System.out.println("======================SUM====================");
		long sum = list.stream().mapToLong(y -> y.salary).sum();
		System.out.println("total sum of salary ::" + sum);

		System.out.println("=================MATCH OPERATION==============");
		boolean allmatch = list.stream().allMatch(y -> y.equals(5));
		System.out.println("allmatch::  " + allmatch);

		boolean anymatch = list.stream().anyMatch(y -> y.equals("java"));
		System.out.println("anymatch  :: " + anymatch);

		boolean nonematch = list.stream().noneMatch(y -> y.equals("aws"));
		System.out.println("nonematch ::  " + nonematch);

		System.out.println("=======================FIND OPERATION=========================");
		Optional<Employee> findany = list.stream().findAny();
		System.out.println("findany ::  " + findany.get());

		Optional<Employee> findfirst = list.stream().findFirst();
		System.out.println("findfirst ::  " + findfirst.get());
	
      System.out.println("====================== NAMES SORTING ORDER===================================");
		List<Employee> listno=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
		Comparator<Employee> byname=(o1,o2)->o1.name.compareTo(o2.name);
		Collections.sort(list,byname);
		list.stream().forEach(System.out::println);
		
		System.out.println("============================ SECOND HIGHEST SALARY============================");
		
	long secondhighestsalary=list.stream().map(y->y.salary)
	             .distinct()
	             .sorted(Comparator.reverseOrder())
	             .skip(1)
	             .findFirst().get();
	            System.out.println("secondhighestsalary ::  "+secondhighestsalary);
	            
	     System.out.println("=================DEPT COUNT======================");
	           long deptcount= list.stream().map(y->y.dept)
	            .distinct()
	            .count();
	            System.out.println("deptcount:: "+deptcount);
	            
	     System.out.println("=============================================================");
	                                     
	           	            
	            
		
	}
}
