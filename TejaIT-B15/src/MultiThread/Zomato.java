package MultiThread;

public class Zomato extends Thread {

	@Override
	public void run() {
		
		// running - execution of run method //
		for (int i = 0; i < 10; i++) {
			System.out.println("thread id:: " + Thread.currentThread().getId()+"   "+i);
			try {
				Thread.sleep(3000); // waiting state //
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// dead - completion of run method execution //

	}

	public static void main(String[] args) {
		Zomato zm = new Zomato();

		Thread t1 = new Thread(zm); // born or new - creating thread object //
		t1.start(); // runnable - starting a thread //
		// t1.start();

		Thread t2 = new Thread(zm);
		t2.start();
	}
	 

}
