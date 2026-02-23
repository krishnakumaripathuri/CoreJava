package Collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSetSafe {
	//while we are iterating the data ,if you disturb by adding element or removing element you will get 
	// concurrentmodificationexception by you using  concurrenthashmapmethod //   
	
	public void OnMap() {    
	Map<Integer,String> map=new ConcurrentHashMap<Integer, String>();
	map.put(9505,"krish");
	map.put(741, "keerthi");
	map.put(950,"daniyelu");
	for(Entry<Integer,String> entry:map.entrySet()) {
		if(entry.getKey()==741) {              //  its not allow duplicate values it is override 
		map.put(1650,"krishna");
		map.remove(741);
			System.out.println(entry);
		}
		
	}
	System.out.println("==================");
	for(Entry<Integer,String> entry:map.entrySet()) {
		System.out.println(entry);
	}
	
	}
	
	public void OnSet() {
		Set<Integer> st=new CopyOnWriteArraySet<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		
		for(Integer i:st) {               //  its not allow duplicate value and it is override
			System.out.println(i);
			if(i==10) {
				st.add(35);
				st.remove(20);
			}
		}
		 System.out.println("===============");
		for(Integer i:st) {
			System.out.println(i);
		}
	}
	
	public void OnList() {    // it is  duplicats values are  its allows   
		List<Integer> li=new CopyOnWriteArrayList<Integer>();
		li.add(15);
		li.add(20);
		li.add(55);
		li.add(25);
		
		for(Integer i:li) {
			System.out.println(i);
			if(i==55);
			li.add(20);
			li.remove(1);
		}
		System.out.println("===============");
		for(Integer i:li) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
	FailSetSafe fss=new FailSetSafe();
	fss.OnMap();
	//fss.OnSet();
	//fss.OnList();
	
}
}
