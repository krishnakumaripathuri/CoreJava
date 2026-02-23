package MultiThread;

public class Airtel extends Thread{  // extend the class //
	// multi - threading //
	
	// overriding the run method //
	
	@Override
	public void run() {
		System.out.println("run method ...");
		}
	
	public static void main(String[] args) {
		Airtel a1=new Airtel();  // we have create object of our customs class //
		// a1.run();
		
		Thread t1=new Thread(a1); // we have to create thread class object //
		// we are passed our custome object reference into thread object //
		t1.start();  // to start the thread we are used start(); method from thread class //
		// then thread will start and calls the run(); //
		
		
	}

}
