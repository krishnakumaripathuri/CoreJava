package MultiThread;

public class Customer {   // waiting();

	int BankBal = 2000;

	public synchronized void WithDraw(int WithDrawAmount) throws InterruptedException {
		System.out.println("customer came to withdraw amount ....");
		if (BankBal < WithDrawAmount) {
			System.out.println("sorry sir,we don't have enough amount,please wait...");
			wait();
		}

		System.out.println("customer withdraw amount successfully...");
		BankBal = BankBal - WithDrawAmount;
	}

	public synchronized void Deposite(int DepositeAmount) {
		System.out.println("customer came to deposite amount...");
		BankBal = BankBal + DepositeAmount;
		System.out.println("customer deposit successfully...");
		System.out.println("notifying.......");
		notify();
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();

	}
}
