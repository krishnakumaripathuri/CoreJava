package Oops;

public class AliceBlue extends NSE{

	@Override
	public void brokeragecharges() {
		System.out.println("aliceblue charges are 15/-");
		
	}
	
	public static void main(String[] args) {
		AliceBlue ab=new AliceBlue();
		ab.StockInfo();
		ab.IPO();
		ab.Holidays();
		ab.brokeragecharges();
	}

}
