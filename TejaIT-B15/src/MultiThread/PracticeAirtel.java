package MultiThread;

public class PracticeAirtel extends Thread {
	
	public void run() {
		System.out.println("run method");
	}
	
	public static void main(String[] args) {
		PracticeAirtel pj=new PracticeAirtel();
		// pj.run();
		
		Thread td=new Thread(pj);
		td.start();
	}

}
