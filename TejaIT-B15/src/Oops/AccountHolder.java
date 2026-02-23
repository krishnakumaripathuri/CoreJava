package Oops;

public class AccountHolder {
	
	// encapsulation means protect the data & save the data //

	// we can't access private access modifiers another & other class //
	
	// we can access only within the class //
	
	// if you need private modifiers access another class , use getters&setters methods //
	
	// setters - use to initilization // - write , update , update ..
	
	// getters - use to read //
	
	private String holdername;
	private int accountnumber;
	private String ifsccode;
	private int balance;
	
	
	
	public String getHoldername() {
		return holdername;
	}



	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}



	public int getAccountnumber() {
		return accountnumber;
	}



	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}



	public String getIfsccode() {
		return ifsccode;
	}



	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public static void main(String[] args) {
		AccountHolder AH=new AccountHolder();
		System.out.println(AH.accountnumber+"     "+AH.holdername+"     "+AH.balance+"      "+AH.ifsccode+"    ");
	}
}
