package PracticeClasses;

public class BB extends AA {

	// different classes same method , same parameters it can be Override //
	
	@Override
	public void M1() {
		System.out.println("parent class m1 method ..");
	}
	
	@Override
	public void M2() {  // private methods we can't override //
		System.out.println("parent class m2 method ..");
	}
	
	@Override
	public void M3() {  // final methods we can't override //
		System.out.println("parent class m3 method ..");
	}
	
	@Override
	public void M4() { // static methods we can't override //
		System.out.println("parent class m4 method ..");
	}


}
