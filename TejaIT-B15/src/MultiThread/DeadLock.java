package MultiThread;

public class DeadLock {
	public static void main(String[] args) {
		String lock1 = "krishna";
		String lock2 = "joshna";

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("t1 thread aquired .." + lock1);
					synchronized (lock2) {
						System.out.println("t2 thread aquired.." + lock2);

					}

				}

			}
		});

		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("t2 thread aquired.." + lock2);
					synchronized (lock1) {
						System.out.println("t1 thread aquired.." + lock1);

					}

				}

			}
		});

		t2.start();
	}
}
