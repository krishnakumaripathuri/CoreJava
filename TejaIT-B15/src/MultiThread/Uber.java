package MultiThread;

public class Uber extends Thread {
	@Override
	public void run() {
		Data();
	}

	// which holds the class level lock - Ub //

	public static synchronized void Data() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread id::" + Thread.currentThread().getId() + "     " + i);
		}
	}

	// data consistency //

	public static void main(String[] args) {
		Uber u1 = new Uber();
		Thread t1 = new Thread(u1);
		t1.start();

		Thread t2 = new Thread(u1);
		t2.start();

		Uber u2 = new Uber();
		Thread t3 = new Thread(u2);
		t3.start();

		Thread t4 = new Thread(u2);
		t4.start();

		Uber u3 = new Uber();
		Thread t5 = new Thread(u3);
		t5.start();

		Thread t6 = new Thread(u3);
		t6.start();
	}

}
