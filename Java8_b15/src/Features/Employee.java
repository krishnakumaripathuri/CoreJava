package Features;

public class Employee implements HR, Teamlead {


	@Override
	public String Company() { // we don't say the method in which parent class
		return "TCL";
	}

	@Override
	public String Role() {
		return HR.super.Role();
	}

	@Override
	public void Attendence() {
		System.out.println("hr attendence must and should 75%..");

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.Company());
		System.out.println(e.Role());
		e.Attendence();

		HR.location();
		Teamlead.location();

	}

}
