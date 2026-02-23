package Oops;

public class SavingsAccount extends Account implements ATMService,OnlineService {
	
	// single + multiple = hybride inheritance //
	
	public void AccountType() {
		System.out.println("savings account type ");
	}
	
	@Override
	public void FundsTransfer() {
		 System.out.println("funds transfer for online service");
		
	}

	@Override
	 public void WithDraw() {
		System.out.println("withdraw amount on atmservice");
		
	}
	
	public static void main(String[] args) {
		SavingsAccount SA=new SavingsAccount();
		
		SA.AccountType();
		SA.Dispute();
		
	}
	

}

