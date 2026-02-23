package loops;

public class methodcalling2 {
	
	
	public int mobiles() {
		int samsung=15000;
		int iphone=14000;
		int total=samsung+iphone;
		System.out.println("total mount of mobiles::"+total);
		int gst=gst("mobiles",total);
		System.out.println("gst amount on mobiles::"+gst);
		int totalwithgst=total+gst;
		System.out.println("total with gst::"+totalwithgst);
		return totalwithgst;
	}
	
	public int electronics() {
		int tv=20000;
		int laptops=25000;
		int total=tv+laptops;
		System.out.println("total amount of electronis::"+total);
		int gst=gst("electronics",total);
		System.out.println("gst amount on electronics::"+gst);
		int totalwithgst=total+gst;
		System.out.println("total with gst::"+totalwithgst);
		return totalwithgst;
	}
	
	public int tooys() {
		int carroms=1500;
		int chees=800;
		int total=carroms+chees;
		System.out.println("total amount of tooys::"+total);
		int gst=gst("tooys",total);
		System.out.println("gst amount on tooys::"+gst);
		int totalwithgst=total+gst;
		System.out.println("total with gst::"+totalwithgst);
		return totalwithgst;
		
	}
	
	public int gst(String catg,int bill) {
		if(catg.equals("mobiles")) {
		    int gstamount=(bill*10)/100;
		}else if(catg.equals("electronics")) {
			int gstamount=(bill*5)/100;
		}else if(catg.equals("tooys")) {
			int gstamount=(bill*8)/100;
		}else {
			System.out.println("nothing");
		}
		int gstamount=(bill*18)/100;
		
		return gstamount;
		
	}


	public void totalbill() {
		int mobilesbill=mobiles();
		int electronicsbill=electronics();
		int tooysbill=tooys();
		int finaltotalbill=mobilesbill+electronicsbill+tooysbill;
		
	}
public static void main(String[] args) {
	methodcalling2 mc2 = new methodcalling2();

	//mc2.gst("electronics",5);
	
	mc2.totalbill();
	
	
}
}


