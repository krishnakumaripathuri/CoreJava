package Oops;

public class NagaChaitanya extends Nagarjuna {
	
	// inheritance //
	

	public void car() {
		System.out.println("nagachaitanya car..");
	}

	public void resturent() {
		System.out.println("nagachaitanya resturent...");
	}

	public void gold() {
		System.out.println("nagachaitanya gold");
	}

  //
	
	@Override //
	public void house() {
		System.out.println("chaitanya  house ");
	}

	public static void main(String[] args) {
		NagaChaitanya n1 = new NagaChaitanya();

		n1.car();
		n1.resturent();
		n1.land();
		n1.house();
		n1.annapurnastudio();
		n1.cycle();
		n1.gold();
		n1.house();

	}
}
