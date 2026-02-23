package loops;

public class shopping3 {

	public int mobiles() {
		int realme = 14000;
		int iphone = 13000;
		int total = realme + iphone;
		int gstbill = gst("mobiles", total);
		int totalamountwithgst = total + gstbill;
		return totalamountwithgst;
	}

	public int dresses() {
		int tops = 1000;
		int dupatas = 1200;
		int total = tops + dupatas;
		int gstbill = gst("dresses", total);
		int totalamountwithgst = total + gstbill;
		return totalamountwithgst;
	}

	public int electronics() {
		int tv = 20000;
		int laptops = 15000;
		int total = tv + laptops;
		int gstbill = gst("electronics", total);
		int totalamountwithgst = total + gstbill;
		return totalamountwithgst;
	}

	public int tooys() {
		int teedybear = 500;
		int doll = 100;
		int spiderman = 200;
		int houseset = 500;
		int total = teedybear + doll + spiderman + houseset;
		int gstbill = gst("tooys", total);
		int totalamountwithgst = total + gstbill;
		return totalamountwithgst;
	}

	public int vegetables() {
		int tomatos = 120;
		int potatos = 150;
		int ladysfingers = 180;
		int total = tomatos + potatos + ladysfingers;
		int gstbill = gst("vegetables", total);
		int totalamountwithgst = total + gstbill;
		return totalamountwithgst;
	}

	public int gamings() {
		int candycrush = 500;
		int chess = 600;
		int carroms = 700;
		int total = candycrush + chess + carroms;
		int gstbill = gst("gamings", total);
		int totalamountwithgst = total + gstbill;
		return totalamountwithgst;
	}

	public int gst(String catg, int bill) {
		int gstamt = 0;
		if (catg.equals("mobiles")) {
			gstamt = (bill * 10) / 100;
			System.out.println("gstamount on mobiles::" + gstamt);
		} else if (catg.equals("electronics")) {
			gstamt = (bill * 18) / 100;
			System.out.println("gstamount on electronics::" + gstamt);
		} else if (catg.equals("tooys")) {
			gstamt = (bill * 20) / 100;
			System.out.println("gstamount on tooys::" + gstamt);
		} else if (catg.equals("vegetables")) {
			gstamt = (bill * 8) / 100;
			System.out.println("gstamount on vegetables::" + gstamt);
		} else {
			gstamt = (bill * 15) / 100;
			System.out.println("gstamount ::" + gstamt);
		}
		return gstamt;
	}

	public int discount(int totalbill) {
		int discount = 0;
		if (totalbill > 5000 && totalbill < 10000) {
			discount = (totalbill * 5) / 100;
		} else if (totalbill > 10000 && totalbill < 50000) {
			discount = (totalbill * 10) / 100;
		} else if (totalbill > 50000 && totalbill < 75000) {
			discount = (totalbill * 15) / 100;
		} else if (totalbill > 75000 && totalbill < 100000) {
			discount = (totalbill * 20) / 100;
		} else if (totalbill > 100000) {
			discount = (totalbill * 30) / 100;
		} else {
			discount = (totalbill * 2) / 100;
		}
		return discount;

	}

	public void totalbill() {
		int mobilesbill = mobiles();
		System.out.println("mobilesbill::" + mobilesbill);
		int dressesbill = dresses();
		System.out.println("dressesbill::" + dressesbill);
		int electronicsbill = electronics();
		System.out.println("electronicsbill::" + electronicsbill);
		int tooysbill = tooys();
		System.out.println("tooysbill::" + tooysbill);
		int vegetablesbill = vegetables();
		System.out.println("vegetablesbill::" + vegetablesbill);
		int gamingbill = gamings();
		System.out.println("gamingbill::" + gamingbill);
		int finaltotalbill = mobilesbill + dressesbill + electronicsbill + tooysbill + vegetablesbill;
		System.out.println("finaltotalbill::" + finaltotalbill);
		int discount=discount(finaltotalbill);
		System.out.println("discount::"+discount);

	}

	public static void main(String[] args) {
		shopping3 s3 = new shopping3();
		s3.totalbill();
	}
}
