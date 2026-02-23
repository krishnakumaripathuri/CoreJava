package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 implements Runnable{
	int transactionid;

	public Task2(int transactionid) {
		super();
		this.transactionid = transactionid;
	}

	@Override
	public void run() {
		
		System.out.println("transaction id::   " + transactionid + "    is processing....by.." 
				+ Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.submit(new Task2(101));
		es.submit(new Task2(102));
		es.submit(new Task2(103));
		es.submit(new Task2(104));
		es.submit(new Task2(105));
		es.shutdown();

	}
}
