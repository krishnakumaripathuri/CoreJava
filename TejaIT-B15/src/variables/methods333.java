package variables;

public class methods333 {

	
	public int mobile() {
		System.out.println("mobile method called");
		return 113;
	}
	
	public int amount() {
		System.out.println("amount method called");
		return 1500;
	}
	
	public static void main(String[] args) {
		methods333 m3=new methods333();
		
		int mobile=m3.mobile();
		System.out.println(m3.mobile());
		int amount=m3.amount();
		System.out.println(m3.amount());
		
		
		
		int salaryamount=m3.amount();
		System.out.println(salaryamount);
		
		
		int salaryamountwithbonus=salaryamount+500;
		System.out.println(salaryamountwithbonus);
		
		
		
	}
}
