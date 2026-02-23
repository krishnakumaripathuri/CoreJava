package loops;

public class ChennaiShoppingMall {

	public int kidsToyStore() {
		int doll = 500;
		int spiderMan = 400;
		
		int totalAmount = doll + spiderMan;
		return totalAmount;
	}

	public static void main(String[] args) {

		ChennaiShoppingMall chennaiShoppingMall = new ChennaiShoppingMall();

		System.out.println(chennaiShoppingMall.kidsToyStore());
	}
}
