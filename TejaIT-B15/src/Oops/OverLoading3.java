package Oops;

public class OverLoading3 {

	
	// same class,same method names and same parameters but parameters order should be a different //
	
	
	public void M1(int id ,String name) {
		System.out.println(" id::"+id+"name"+name);
	}
	
	public void M1(String name,int id) {
		System.out.println("name"+name+"id::"+id);
	}
	
	public void M1(int id,double amt,String name) {
		System.out.println("id::"+id+"amt::"+amt+"name::"+name);
	}
	
	public static void main(String[] args) {
		OverLoading3 ol3=new OverLoading3();
		
		ol3.M1(25,"krishna");
		ol3.M1("krishna", 25);
		ol3.M1(50, 12.52,"krishna");
	}
}
