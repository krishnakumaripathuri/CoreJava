package Oops;

public class Dhan extends NSE {

	@Override
	public void brokeragecharges() {
	System.out.println("dhan charges are 10/-");
		
	}
	
	public static void main(String[] args) {
		Dhan dn=new Dhan();
		
		dn.StockInfo();
		dn.IPO();
		dn.Holidays();
		dn.brokeragecharges();
	}

}

