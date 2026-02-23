package Collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TataProducts  implements Comparable<TataProducts>{
	int id;
	String name;
	double price;

	public TataProducts(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	@Override
	public int compareTo(TataProducts o) {
		//return this.id-o.id;  // based  on id 
		//return this.name.compareTo(o.name); // based on name
		return (int) (this.price-o.id);   //  based on price 
	}
	


	@Override
	public String toString() {
		return "TataProducts [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		TataProducts t1 = new TataProducts(101, "tata salt", 12.35);
		TataProducts t2 = new TataProducts(102, "tata engine", 32.05);
		TataProducts t3 = new TataProducts(103, "tata rice", 02.355);
		TataProducts t4 = new TataProducts(104, "tata motors", 55.35);
		TataProducts t5 = new TataProducts(105, "tata water", 11.35);
		List<TataProducts> list = new ArrayList<TataProducts>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		Collections.sort(list);
		for(TataProducts i:list) {
			System.out.println( i. id+"  "+ i .name +"  "+i. price);
			//System.out.println(i);
			
		}
	}


}
