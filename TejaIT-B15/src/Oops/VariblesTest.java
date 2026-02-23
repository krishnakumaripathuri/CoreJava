package Oops;

public class VariblesTest extends VaribleParent {

	int id =25;  //instance varible //
	
	
	public void Test() {
		int id=20;  //local varible //
		id=15;
	
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
		
	}
	public static void main(String[] args) {
		
		VariblesTest vt=new VariblesTest();
		
		vt.Test();
	}
}
