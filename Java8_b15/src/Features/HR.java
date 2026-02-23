package Features;

public interface HR {

	public String Company();

	public default String Role() {
		return "Human Resources";
	}

	public default void Attendence() { // by using default keyword doen't disturbed the child classes programme
		System.out.println("HR Team attendence  must be 75%...");
	}

	public static void location() {
		System.out.println("Hyderabad...");
	}
}
