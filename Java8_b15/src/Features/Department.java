package Features;

public class Department implements Teamlead,HR{

	@Override
	public String Company() {
		return "keerthi";
	}

	@Override
	public String Role() {
		return Teamlead.super.Role();
	}

	
}
