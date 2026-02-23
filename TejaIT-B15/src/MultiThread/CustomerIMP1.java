package MultiThread;

public class CustomerIMP1 {
	public static void main(String[] args) {
		Customer c1 = new Customer();

		// with draw thread //

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					c1.WithDraw(15000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();

		// deposite thread //

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				c1.Deposite(20000);

			}
		});
		t2.start();
	}

}
