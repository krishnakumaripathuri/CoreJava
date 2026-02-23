package StringHandling;

public final class Employee {

	private final int id;
	private final String name;
	private final String city;

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;                                                             
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public static void main(String[] args) {
		Employee em = new Employee(101, "keerthi", "chennai");
		// em.id=201;
		System.out.println(em.id + "  " + em.name + "   " + em.city);

	}
}
