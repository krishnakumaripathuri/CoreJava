package Oops;

public class Grow extends NSE{

	@Override
	public void brokeragecharges() {
		System.out.println("grow charges are 20/-");
		
	}
	
	public static void main(String[] args) {
		Grow g=new Grow();
		g.StockInfo();
		g.IPO();
		g.Holidays();
		g.brokeragecharges();
	}

}
