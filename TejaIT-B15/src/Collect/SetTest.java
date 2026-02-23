package Collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	
	public void HashSetTest() { // it can not in-session order 
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(5);   //  it don't allow duplicate value it will be override
		hs.add(20);
		hs.add(null);  // it allows null value 
		for(Integer i:hs) {
			System.out.println(i);
			
		}
	}
	
	public void LinkedHasSetTest() {     // it follows in-session order
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(5);
		lhs.add(20);
		lhs.add(25);
		lhs.add(25);     //  it don't allow duplicate value it will be override 
		lhs.add(null);       // it allows null value //
		for(Integer i:lhs) {
			System.out.println(i);
		}
	}
	
	public void TreeSetTest() { //  it follows sorted order or assending order 
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(25);
		ts.add(55);
		ts.add(95);
		ts.add(75);
		// ts.add(null);     //  it don't allows null value  //
		for(Integer i:ts) {
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	SetTest st=new SetTest();
	st.HashSetTest();
	//  st.LinkedHasSetTest();
	// st.TreeSetTest();
}
}
