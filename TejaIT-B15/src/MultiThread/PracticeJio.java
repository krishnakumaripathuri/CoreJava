package MultiThread;

public class PracticeJio implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("thread id - "+Thread.currentThread().getId());
		}
		
	}
	
	public static void main(String[] args) {
		PracticeJio pj=new PracticeJio();
		Thread t1=new Thread(pj);
		t1.start();
		
		Thread t2=new Thread(pj);
		t2.start();
		
		Thread t3=new Thread(pj);
		t3.start();
	}

}
