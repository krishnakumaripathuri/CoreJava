package variables;

public class meesho {

	int total;
	int billwithtax;
	int withGst;
	
	public int mobiles() {
		int iphone=15000;
		int realme=20000;
		int oppo=18000;
		 total=iphone+realme+oppo;
		 billwithtax=tax(total);
		 withGst=Gst(billwithtax);
		return withGst;
	}
	
	public int electronics() {
		int laptops=20000;
		int tv=15000;
		total=laptops+tv;
		billwithtax=tax(total);
		
		withGst=Gst(billwithtax);
		return withGst;
	}
	
	public int tax (int bill) {
		int withtax=bill+5000;
		return withtax;
	}
	
	public int Gst(int bill) {
		int withGst=bill+25;
		return withGst;
	}
	
	public void totalbill() {
		int mobilesbill=mobiles();
		System.out.println("mobiles bill::"+mobilesbill);
		
		int electronicsbill=electronics();
		System.out.println("electronics bill::"+electronicsbill);
		
		int finaltotalbill=mobilesbill+electronicsbill;
		System.out.println("finaltotalbill::"+finaltotalbill);
	}
	public static void main(String[] args) {
		meesho ms=new meesho();
		ms.totalbill();
	}
}
