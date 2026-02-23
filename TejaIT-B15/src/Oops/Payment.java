package Oops;

public class Payment {
	
	//  cash payment  //

	public void Pay(String paymenttype, int amount) {
		System.out.println("paymenttype::" + paymenttype + "   amount" + amount);
	}

	// card payment //
	
	public void Pay(String paymenttype, int amount, long cardnumber) {
		
		System.out.println("paymenttype::" + paymenttype + "   amount::" + amount + "   cardnumber::" + cardnumber);
	}

	// upi payment //
	
	public void Pay(String paymenttype, int amount, String upiid) {
		System.out.println("paymenttype::" + paymenttype + "   amount" + amount + "   upiid::" + upiid);
	}

	public static void main(String[] args) {
		Payment p1 = new Payment();

		p1.Pay("cash", 600);
		p1.Pay("card payment", 50, 123456789L);
		p1.Pay("upi payment", 5, "krishna@741");

	}
}
