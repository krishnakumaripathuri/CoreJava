package Oops;

public class Cred extends BillDesk {

	
	public void Loons() {
		System.out.println("cred gives loons..");
	}
	
	public void Cards() {
		System.out.println("cred gives cards...");
	}
	
	public void UpiPayments() {
		System.out.println("cred gives upipayments...");
	}
	
	public void CibilScore() {
		System.out.println("cred app provide will check cibilscore");
	}
	public static void main(String[] args) {
		
		Cred c=new Cred();
		
		c.Loons();
		c.Cards();
		c.UpiPayments();
		c.CibilScore();
		c.PaymentProcessGateWay();
		
	}
}
