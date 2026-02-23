package loops;

public class student {
	
	public void results(int marks) {
		if(marks>35 && marks<=50) {
			System.out.println("student in 3rd class...");
		}else if(marks>51 && marks<=75) {
			System.out.println("student in 2nd class...");
		}else if(marks>76 && marks<=100) {
			System.out.println("student in 1st class...");
		}else {
			System.out.println("student failed...");
		}
	}
	
	public static void main(String[] args) {
		student s1 = new student();
		s1.results(95);

		
		
		
	}

}
