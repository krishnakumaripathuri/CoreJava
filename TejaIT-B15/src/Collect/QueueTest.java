package Collect;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	public void queueTest() {
		Queue<Integer> q = new LinkedList<>();
		q.add(11);
		q.add(13);
		q.add(15);
		q.add(16);
		q.add(18);

		q.remove();
		q.remove();
		
		for (Integer i : q) {
			System.out.println(i);
		}
	}
	
	public void PriorityQueueTest() {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("aa");
		pq.add("kk");
		pq.add("zz");
		pq.add("bb");
		pq.add("jj");
		
		pq.remove();
		pq.remove();
		
		for(String s:pq) {
			System.out.println(s);
		}
		
		
	}

	public static void main(String[] args) {
		QueueTest q = new QueueTest();
		//q.queueTest();
		q.PriorityQueueTest();
	}
}
