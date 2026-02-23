package variables;

public class Dmart {
	
int total;
int billwithtax;

	public int cloths() {
		int sarees=1000;
		int tops=2000;
		total=sarees+tops;
	    billwithtax=tax(total);
		return billwithtax;
		
	}
	
	public int cookingitems() { 
		int cookwear=10000;
		int dinnerset=2500;
		 total=cookwear+dinnerset;
		 billwithtax=tax(total);
		return total;
	}
	
	public int appliences() {
		int fridge=18000;
		int cooler=5000;
		total=fridge+cooler;
		billwithtax=tax(total);
		return total;
	}
	
	public int tax(int bill) {
		 int withtax=bill+2500;
		 return withtax;
		
	}
	
	public void totalbill() {
		int clothsbill=cloths();
		System.out.println("cloths bill::"+clothsbill);
		
		int cookingitemsbill=cookingitems();
		System.out.println("cookingitems bill::"+cookingitemsbill);
		
		int appliencesbill=appliences();
		System.out.println("appliences bill::"+appliencesbill);
	}
	
	public static void main(String[] args) {
		Dmart Dm=new Dmart();
		Dm.totalbill();
	}
}
