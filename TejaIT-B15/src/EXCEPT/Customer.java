package EXCEPT;

public class Customer {

	int bill=500;
	public void payment(int amount) {
		
		if(bill<amount) {    // 500<1000
		System.out.println("payment successfull...");
		}else {
			System.out.println("transaction failed...");
			//throw new InsufficientFundsException();
			throw new InsufficientFundsException(" / added funds");
		}
	}
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.payment(100);
	}
}
