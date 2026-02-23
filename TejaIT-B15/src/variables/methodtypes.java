package variables;

public class methodtypes {

	
	public int m1() {
		return 123;
	}
	
	public static int m2() {
		return 1456;
	
	}
	
	
	public static void main(String[] args) {
		
		methodtypes mt=new methodtypes();
		
		System.out.println(mt.m1());
		
		System.out.println(methodtypes.m2());
		
	}
}
