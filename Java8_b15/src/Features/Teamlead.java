package Features;

public interface Teamlead {

	public String Company();

	public default String Role() {
		return "Human Resources";
	}

	public  static void location() {
		 System.out.println("benguloore...");
	 }
}
