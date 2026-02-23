package variables;

public class lulumall {

	public int mobiles() {
		int realme=12000;
		int oppo=15000;
		int total=realme+oppo;
		return total;
	}
	
	public int appliances() {
		int ac=20000;
		int fridge=18000;
		int total=ac+fridge;
		return total;
	}
	
	public static void main(String[] args) {
		
		lulumall lm=new lulumall();
		int totalmobilebill=lm.mobiles();
		
		
		
		System.out.println("total bill::"+totalmobilebill);
		
		
		int totalappliancesbill=lm.appliances();
		System.out.println("total bill::"+totalappliancesbill);
		
		
		int totalbill=totalmobilebill+totalappliancesbill;
		System.out.println("total bill::"+totalbill);
		
		
		
		
		
	}
}
