package Functional;

@FunctionalInterface
public interface KrishnaIT {

	public abstract String tagline(String val);

	public static void main(String[] args) {

		// ananomous inner type

		KrishnaIT t = new KrishnaIT() {

			@Override
			public String tagline(String val) {

				return "krishnaIT".concat("  " + val);
			}
		};
		String tagline = t.tagline("your java stop !");
		System.out.println(tagline);

		System.out.println("======================================");

		// *** // lambda //

		KrishnaIT t1 = val -> "krishnaIT".concat("   " + val);

		String tagline1 = t1.tagline("your java stop !");
		System.out.println(tagline1);

		System.out.println("*****************************************");

		KrishnaIT t2 = val -> "krishnaIT".concat("  " + val);

		String tagline2 = t.tagline("your java stop !");
		System.out.println(tagline2);

	}

}
