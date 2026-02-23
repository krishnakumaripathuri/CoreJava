package MultiThread;

public class TXNTask extends Thread {

	int transactionid;

	public TXNTask(int transactionid) {
		super();
		this.transactionid = transactionid;
	}

	@Override
	public void run() {
		System.out.println("transaction id::   " + transactionid + "    is processing...." + "   by::   "
				+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TXNTask tx1 = new TXNTask(101);
		Thread t1 = new Thread(tx1);

		TXNTask tx2 = new TXNTask(102);
		Thread t2 = new Thread(tx2);

		TXNTask tx3 = new TXNTask(103);
		Thread t3 = new Thread(tx3);

		TXNTask tx4 = new TXNTask(104);
		Thread t4 = new Thread(tx4);

		TXNTask tx5 = new TXNTask(105);
		Thread t5 = new Thread(tx5);

		/*
		 * Thread t2 = new Thread(new TXNTask(102)); Thread t3 = new Thread(new
		 * TXNTask(103)); Thread t4 = new Thread(new TXNTask(104)); Thread t5 = new
		 * Thread(new TXNTask(105));
		 */

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
