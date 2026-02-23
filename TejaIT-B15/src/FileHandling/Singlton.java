package FileHandling;

public class Singlton {    // IT CREATE SINGLE OBJECT FOR MULTIPLE REQUESTS 

	public static Singlton singltonObj = null;

	public static Singlton getInstance() {
		if (singltonObj == null) {
			singltonObj = new Singlton();
		}
		return singltonObj;
	}

	public static void main(String[] args) {
		Singlton s1 = Singlton.getInstance();
		Singlton s2 = Singlton.getInstance();
		Singlton s3 = Singlton.getInstance();
		Singlton s4 = Singlton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}