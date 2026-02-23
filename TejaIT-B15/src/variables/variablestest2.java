package variables;

public class variablestest2 {

	int id =10;
	
	
	public int xyz() {
		int id=10;
		System.out.println("id::"+id);
		
		
		 id=14;
		 id=25;
		this.id=50;
		System.out.println("id::"+id);
		this.id=65;
		
		System.out.println("id::"+id);
		System.out.println("this.id::"+id);
		
		
		
		return 0;
				
	}
	public static void main(String[] args) {
		
		variablestest2 vt2=new variablestest2();
		vt2.xyz();
		
	}
}
