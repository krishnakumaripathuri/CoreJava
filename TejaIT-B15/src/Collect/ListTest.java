package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	

	public void ArreyListTest() {
		// <> - generic
		// <E> - element type - use only classes
		// type - integer , string , double , employee , customer
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.add(0, 55);    //  we are adding in specific number to replace then index number are forword moving  //
		al.remove(0);     // we are remove the number then index numbers are backword  moving //
		
		System.out.println(al.get(2));  // we need particular value use this  method it will fetch the index number // 
		System.out.println("-----------------------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}

		System.out.println("==========");

		for (Integer val : al) {
			System.out.println(val);
		}
	}
		
		public void LinkListTest() {
			LinkedList<Integer> li=new LinkedList<Integer>();
			li.add(10);
			li.add(20);
			li.add(30);
			li.add(40);
			
			for(Integer val:li) {
				System.out.println(val);
			}
		}
		
		public void VectorTest() {
		Vector<String> v=new Vector<String>();
	v.add("krishna");
	v.add("joshna");
	v.add("nageena");
	v.add("harika");
	v.add("manogna");
	
	for(String str:v) {
		System.out.println(str);
	}
		}
		
		public void StackTest() {
			Stack<String> s=new Stack<String>();
			s.push("krishna");
			s.add("joshna");
			s.add("nageena");
			s.add("harika");
			s.add("manogna");
			s.pop();
			
			
			s.pop();
			System.out.println("pop element  "+s.peek());
			
			for(String str:s) {
				System.out.println(str);
			}
		}
	

	public static void main(String[] args) {
		ListTest listtest = new ListTest();
		// listtest.ArreyListTest();
		//listtest.LinkListTest();
		//listtest.VectorTest();
		listtest.StackTest();
		
	}

}
