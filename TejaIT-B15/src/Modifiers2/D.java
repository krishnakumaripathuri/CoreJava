package Modifiers2;

public class D {
	public int id;

	public void m1() {
		System.out.println("d class m1 method...");
	}

	public static void main(String[] args) {
		D d = new D();

		System.out.println(d.id);
		d.m1();

	}

}
