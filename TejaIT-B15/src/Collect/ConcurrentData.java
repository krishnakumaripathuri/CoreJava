package Collect;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentData {
	
	public void OnMap() {
		Map<Integer,String> map=new ConcurrentHashMap<Integer, String>();
		map.put(105,"daniyelu");
		map.put(701,"krishna");
		map.put(505,"mariyamma");
		map.put(101,"bhargavi");
		map.put(103,"thabitha");
		for(Entry<Integer,String> entry:map.entrySet()) {
			map.put(102,"buelah");
			map.remove(701);
						System.out.println(entry);
			
		}
		
		System.out.println("==========");
		for(Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry);
		}
	}
	
	public void OnSet() {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(101);
		s1.add(102);
		s1.add(103);
		s1.add(105);
		for(Integer i:s1) {
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	ConcurrentData cd=new ConcurrentData();
	//cd.OnMap();
	cd.OnSet();
}
}
