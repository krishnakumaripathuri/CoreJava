package Functional;

@FunctionalInterface
public interface RazoPay {

	public abstract String payment();

	public static void main(String[] args) {
		
		// anonumus inner type //
		
		RazoPay r = new RazoPay() {

			@Override
			public String payment() {
				return "payment success...";
			}

		};
		String status = r.payment();
		System.out.println(status);
		System.out.println("===================");

		// lambda //
		
		RazoPay r1 = () -> "payment success...";
		String status1 = r.payment();
		System.out.println(status1);

	}
}
