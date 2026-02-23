package Oops;

public class AccountHolderTest {

	public static void main(String[] args) {
		// AccountHolder AH=new AccountHolder();
		// System.out.println(AH.accountnumber+" "+AH.holdername+" "+AH.balance+"
		// "+AH.ifsccode+" ");

		AccountHolder ah = new AccountHolder();
		ah.setHoldername("krishna");
		ah.setHoldername("krishna kumari");
		System.out.println(ah.getHoldername());

		ah.setAccountnumber(11245685);
		System.out.println(ah.getAccountnumber());

		ah.setBalance(1000);
		System.out.println(ah.getBalance());

		ah.setIfsccode("sbi1258");
		System.out.println(ah.getIfsccode());
	}

}
