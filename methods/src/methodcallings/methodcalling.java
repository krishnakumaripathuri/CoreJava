package methodcallings;

public class methodcalling {
 
	int total;
	     
			
	public int mobiles() {
		int samsung=15000;
		int realme=14000;
		 total=samsung+realme;
		return total;
	}
	
	
	public int electronics() {
		int laptops=20000;
		int tv=15000;
		 total=laptops+tv;
		return total;
	}
	
	public int applience() {
		int fridge=18000;
		int ac=20000;
		total=fridge+ac;
		return total;
	}
	
	
	public  void totalbill() {
		
		int mobilebill=mobiles();
	    int electronicbill=electronics();
	    int appliencebill=applience();
		int totalbill=mobilebill+electronicbill+appliencebill;
		System.out.println(totalbill);
		
		
		
	}
	
	public static void main(String[] args) {
		methodcalling mc=new methodcalling();
		mc.totalbill();
	}
}
