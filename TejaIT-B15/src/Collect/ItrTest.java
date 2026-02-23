package Collect;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ItrTest {

	//  these lists are used only collections data iterate or non - iterate  
	
	public void IteratorTest() {  //  non - legacy
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void ListIteratorTest() {   //  forward or backward 
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		// it traverse data from forward to backward directions  
		
		ListIterator<Integer> litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("===================");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
	
	public void EnumerationTest() {                  //  legacy 
		Vector<String> v=new Vector<String>();
		v.add("krishna");
		v.add("joshna");
		v.add("nageena");                
		
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

	public static void main(String[] args) {
		ItrTest it = new ItrTest();
		it.IteratorTest();
		//it.ListIteratorTest();
		//it.EnumerationTest();
	}

}
