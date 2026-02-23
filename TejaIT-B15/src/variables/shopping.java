package variables;

public class shopping {

	int total;
	int billwithtax;
	
	public int mobiles() {
		int realme=12000;
		int iphone=16000;
		total =realme+iphone;
		int billwithtax=tax(total);
		return billwithtax;
		
	}
	
	public int electronics() {
		int tv=20000;
		int laptop=50000;
		total=tv+laptop;
		int billwithtax=tax(total);
		return billwithtax;
	}
	
	public int tax(int bill) {
		int withtax=bill+1000;
		return withtax;
	}
	
	public void totalbill() {
		int mobilebill=mobiles();
		System.out.println("mobile bill::"+mobilebill);
		int electronicsbill=electronics();
		System.out.println("electronics bill::"+electronicsbill);
		int finaltotalbill=mobilebill+electronicsbill;
		System.out.println("finaltotalbill::"+finaltotalbill);
	}
	public static void main(String[] args) {
		shopping s1=new shopping();
		s1.totalbill();
	}
}
