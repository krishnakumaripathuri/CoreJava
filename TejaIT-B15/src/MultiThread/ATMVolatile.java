package MultiThread;

public class ATMVolatile {
	// volatile is a key word
	// this volatile variables is read the data from main memory always
	// it is don't fetch the catche data
	// generally we will use this volatile variables for flag values
	 //   flag values - true,false

	volatile boolean maintanancemode = false;

	public void transactionprocess() {
		System.out.println("customer came to transaction process...");
		while (!maintanancemode) {
			// transactions process is going on ...
			//System.out.println("while loop is running...");
		}
		System.out.println("ATM is stopped for maintenance..");
	}

	public void maintanance() {
		System.out.println("Admin changing maintanance mode..");
		maintanancemode = true;
	}

	public static void main(String[] args) throws InterruptedException {
		ATMVolatile atm = new ATMVolatile();
		Thread atmtransaction = new Thread(new Runnable() {
			@Override
			public void run() {
				atm.transactionprocess();

			}
		});
		atmtransaction.start();
		
		Thread.sleep(3000);
		atm.maintanance();
		

	}

}
