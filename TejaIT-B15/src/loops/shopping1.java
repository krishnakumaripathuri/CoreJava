package loops;

public class shopping1 {

	public int mobiles() {
		int realme=13000;
		int iphone=12000;
		int total=realme+iphone;
		return total;
	}
	
	public void totalbill() {
		int mobilesbill=mobiles();
		System.out.println("mobiles bill::"+mobilesbill);
	}
	public static void main(String[] args) {
		shopping1 sp1=new shopping1();
		sp1.totalbill();
	}
}
