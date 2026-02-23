package Oops;

public class Hdfc extends Cred {

	// @Override //

	public void Loons() {
		System.out.println("loons provide hdfc");
	}

	// @Override //

	public void Cards() {
		System.out.println("cards provide hdfc");
	}

	// @Override //

	public void UpiPayments() {
		System.out.println("hdfc will provide upipayments");
	}

	public void Cheques() {
		System.out.println("hdfc check the cheques");
	}

	public static void main(String[] args) {

		Hdfc HC = new Hdfc();

		HC.Loons();
		HC.Cards();
		HC.UpiPayments();
		HC.Cheques();
		HC.PaymentProcessGateWay();
		HC.CibilScore();
	}
}
