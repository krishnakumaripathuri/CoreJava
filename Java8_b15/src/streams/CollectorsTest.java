package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsTest {
public static void main(String[] args) {
	
	Employee e1 = new Employee(1, "krishna", 22, "java", 120000);
		Employee  e2 = new Employee(2, "daniyelu", 35, "aws", 550000);
		Employee e3 = new Employee(3, "bhargavi", 18, "sql",  55000);
		Employee e4 = new Employee(4, "thabitha", 16, "java",550000);
		Employee e5 = new Employee(5, "mariyamma", 33, "sql",120000);
		Employee e6 = new Employee(6, "mohana", 38, "aws",   850000);
		Employee e7 = new Employee(7, "sandhya", 28, "java", 155000);
		Employee e8 = new Employee(8, "adithya", 30, "sql",  550000);
		Employee e9 = new Employee(9, "suresh", 32, "aws",   650000);
		Employee e10=new Employee (10, "baby", 29, "sql",     50000);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
		
		// ---------------TOLIST()-----------------------
		System.out.println("---------------TOLIST()-----------------------");
		List<Employee> list1=list.stream().filter(x->x.getDept().equalsIgnoreCase("java")).collect(Collectors.toList());
		System.out.println(list1);
		
		// --------------------TOSET()-----------------------
        System.out.println("--------------------TOSET()-----------------------");
		Set<String> dept=list.stream()
				//.map(x->x.getDept())
	            .map(Employee::getDept)
				.distinct()
				.collect(Collectors.toSet());
		System.out.println(dept);
		
		// -----------------------TOMAP()--------------------
	   System.out.println("-----------------------TOMAP()--------------------");
		Map<Integer, String> map=list.stream()
				.collect(Collectors.toMap(x->x.getId(),x->x.getName()));
		//.collect(Collectors.toMap(Employee::getId,Employee::getName));
		System.out.println(map);
		
		Map<Integer,Employee> empmap=list.stream().collect(Collectors.toMap(Employee::getId,Function.identity()));
		System.out.println(empmap);
		
		// ---------------------------TOJOINING()-------------------
		System.out.println("---------------------------TOJOINING()-------------------");
		String name=list.stream().map(Employee::getName)
		.collect(Collectors.joining(","));
		
		System.out.println(name);
		
		// ----------------------COUNTING()------------------------
		System.out.println("----------------------COUNTING()------------------------");
		Long count=list.stream()
				.filter(x->x.getDept().equalsIgnoreCase("java"))
				.collect(Collectors.counting());
		
		System.out.println(count);
		
		// -----------------------COUNTINGANDTHEN()-----------------
		System.out.println("-----------------------COUNTINGANDTHEN()-----------------");
		LinkedHashMap<Integer,Employee> linkedHashMap=list.stream()
		.collect(Collectors.collectingAndThen(Collectors.toMap(Employee::getId,Function.identity()),LinkedHashMap::new));
		System.out.println("linkedhashmap :: "+linkedHashMap);
		
		LinkedHashSet<String> linkedhashset=list.stream()
				.map(Employee::getName)
				.collect(Collectors.collectingAndThen(Collectors.toSet(),LinkedHashSet::new));
				System.out.println("linkedhashset :: "+linkedhashset);
				
	LinkedList<String> linkedlist=list.stream()
			.map(Employee::getName)
			.collect(Collectors.collectingAndThen(Collectors.toList(),LinkedList::new));
	System.out.println("linkedlist :: "+linkedlist);
				
				
		
	    // -----------------MAXBY & MINBY--------------------------
		System.out.println("-----------------MAXBY & MINBY--------------------------");
		Optional<Long> max=list.stream()
		.map(Employee::getSalary)
		.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(max);
		              
		
		Optional<Long> min=list.stream()
				.map(Employee::getSalary)
				.collect(Collectors.minBy(Comparator.naturalOrder()));
				System.out.println(min);
				
				// -------------------SUMMINGINT,SUMMINGDOUBLE,SUMMINGLONG-------------------
				System.out.println("-------------------SUMMINGINT,SUMMINGDOUBLE,SUMMINGLONG-------------------");
				double sum=list.stream().map(Employee::getSalary)
				.collect(Collectors.summingDouble(x->x));
				System.out.println(sum);
				
				
				int sum1=list.stream().map(Employee::getSalary)
						.collect(Collectors.summingInt(x->x.intValue()));
						System.out.println(sum1);
						
						
				
						long sum2=list.stream().map(Employee::getSalary)
								.collect(Collectors.summingLong(x->x));
								System.out.println(sum2);
								
		
		// --------------------AVERAGEINT,AVERAGEDOUBLE,AVERAGELONG-------------------------
		System.out.println("--------------------AVERAGEINT,AVERAGEDOUBLE,AVERAGELONG-------------------------");
				
		Double avg=list.stream().map(Employee::getSalary)
				.collect(Collectors.averagingDouble(x->x.intValue()));
				System.out.println(avg);
				
				
	   // ----------------------SUMMERIZING---------------------------		
	System.out.println("----------------------SUMMERIZING---------------------------");
	DoubleSummaryStatistics dss=list.stream().map(Employee::getSalary).collect(Collectors.summarizingDouble(x->x));
	System.out.println(dss);
	
	System.out.println("min ::"+dss.getMin());
	System.out.println("max ::"+dss.getMax());
	System.out.println("avg ::"+dss.getAverage());
	System.out.println("sum ::"+dss.getSum());
	System.out.println("count ::"+dss.getCount());
						
						
		//------------------------------------GROUPINGBY---------------------------------------
	System.out.println("--------------------------GROUPINGBY------------------------------");
	Map<String,List<Employee>> deptmap=list.stream().collect(Collectors.groupingBy(Employee::getDept));
	System.out.println("deptmap :: "+deptmap);
	
	Map<String, Long> mapcount=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
	System.out.println(mapcount);
	
	Map<String, Double> deptavg=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(deptavg);
			
	// ---------------------------------PARTITIONINGBY------------------------------------
	System.out.println("-------------------PARTITIONINGBY----------------------------");
	Map<Boolean,List<Employee>> partitioningby=list.stream().collect(Collectors.partitioningBy(x->x.getAge()>20));
	System.out.println("partitioninby :: "+partitioningby);

	//------------------------------ITERATE THE MAPDATA---------------------------------
//	System.out.println("-------------------------ITERATE THE MAPDATA------------------");
//	Map<String, Long> maplist=list.stream().collect(Collectors.toMap(Employee::getDept,Employee::getSalary));
   //        Iterator<Employee> itr=list.iterator();
      
           System.out.println("================================ SECOND HIGHEST SALARY ======================================================");
           Long secondhighestsalary=list.stream()
        		   .map(x->x.getSalary())
        		   .distinct()
        		   .sorted(Comparator.reverseOrder())
        		   .skip(1)
        		   .findFirst().get();
           System.out.println("secondhighestsalary :: "+secondhighestsalary);
           
           System.out.println("================================== DUPLICATE ELEMENTS =======================================");
            list.stream()
           .map(x->x.getSalary())
           .sorted(Comparator.reverseOrder())
           .skip(2)
           .limit(3)
           .forEach(x->System.out.println(x));
            
       
    
				
}
}
