package Functional;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {

			}
		};
		
		r1.run();
		System.out.println("run()....");
		
		System.out.println("==========================");
		
		Runnable r =()-> r1.run();
		System.out.println("run()2....");

	}
}
