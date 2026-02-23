package loops;

public class Trends {

	public int vegetables() {
		int tomatos = 250;
		System.out.println("total tomatos::" + tomatos);
		int bringals = 450;
		System.out.println("total bringals::" + bringals);
		int total = tomatos + bringals;
		System.out.println("total vegetables::" + total);
		int gst = gst("vegetables", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int appliences() {
		int fridge = 18000;
		System.out.println("total fridge::" + fridge);
		int cooler = 6000;
		System.out.println("total cooler::" + cooler);
		int total = fridge + cooler;
		System.out.println("total appliences::" + total);
		int gst = gst("appliences", total);
		int totalwithgst = total + gst;
		return totalwithgst;

	}

	public int cloths() {
		int sarees = 2000;
		System.out.println("total sarees::" + sarees);
		int dresses = 3000;
		System.out.println("total dress::" + dresses);
		int total = sarees + dresses;
		System.out.println("total cloths::" + total);
		int gst = gst("cloths", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int gst(String catg, int bill) {
		if (catg.equals("vegetables")) {
			int sgstamount = (bill * 7) / 100;
			System.out.println("sgstamount on vegetables::" + sgstamount);
			int cgstamount = (bill * 13) / 100;
			System.out.println("cgstamount on vegetables::" + cgstamount);
			int discountamount = (bill * 8) / 100;
			System.out.println("discountamount on vegetables::" + discountamount);
			int totalgstamountwithdiscountamount = sgstamount + cgstamount;
			System.out.println("totalgstamount after discount on vegetables::" + sgstamount + cgstamount);
			return totalgstamountwithdiscountamount;
		} else if (catg.equals("appliences")) {
			int sgstamount = (bill * 10) / 100;
			System.out.println("sgstamount on appliences::" + sgstamount);
			int cgstamount = (bill * 8) / 100;
			System.out.println("cgstamount on appliences::" + cgstamount);
			int discountamount = (bill * 5) / 100;
			System.out.println("discountamount on appliences::" + discountamount);
			int totalgstamountwithdiscountamount = sgstamount + cgstamount;
			System.out.println("totalgstamount after discount on appliences::" + sgstamount + cgstamount);
			return totalgstamountwithdiscountamount;
		} else if (catg.equals("cloths")) {
			int sgstamount = (bill * 10) / 100;
			System.out.println("sgstamount on cloths::" + sgstamount);
			int cgstamount = (bill * 15) / 100;
			System.out.println("cgstamount on cloths::" + cgstamount);
			int discountamount = 55;
			System.out.println("discountamount on cloths::" + discountamount);
			int gsttotalamountwithdiscountamount = sgstamount + cgstamount;
			System.out.println("gsttotalamount after discountamount on cloth::" + sgstamount + cgstamount);
			return gsttotalamountwithdiscountamount;
		} else {
			System.out.println("nothing");
			int sgstamount = (bill * 28) / 100;
			int cgstamount = (bill * 25) / 100;
			int gsttotalamount = sgstamount + cgstamount;
			return gsttotalamount;
		}

	}

	public void totalbill() {
		int vegetablesbill = vegetables();
		int appliencesbill = appliences();
		int clothsbill = cloths();
		int finaltotalbill = vegetablesbill + appliencesbill + clothsbill;
		System.out.println("finaltotalbill::" + finaltotalbill);
	}

	public static void main(String[] args) {
		Trends ts = new Trends();
		ts.totalbill();

	}
}
