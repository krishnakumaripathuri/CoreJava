package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable {
	int transactionid;

	public Task(int transactionid) {
		super();
		this.transactionid = transactionid;
	}

	@Override
	public void run() {
		System.out.println("========================");
		System.out.println("transaction id::   " + transactionid + "    is processing....by.." 
				+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.submit(new Task(101));
		es.submit(new Task(102));
		
		es.shutdown();
	}
	}


