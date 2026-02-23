package variables;

import javax.security.auth.login.Configuration.Parameters;

public class methods55 {

	// parameterized method //
	
	public void m1() {
		System.out.println("zero parameter");
	}
	
	public void m2(int id) {
		System.out.println("one parameter...int val::"+id);
	}
	
	public void m3(String name) {
		System.out.println("one parameter  string name::"+name);
	}
	
	public void m4(int id,String name) {
		System.out.println("two parameters ..."+id+"  "+name);
	}
	
	public void m5(int val,int num,long mobile) {
		System.out.println("three parameters..."+val+"  "+num+"  "+mobile);
		}
	
	
	public void m6(float miles,double balance,char grade,int val) {
		System.out.println("four parameters..."+miles+"  "+balance+"  "+grade+"   "+val);
	}
	
	public void m7(String name,int val,int balance,char grade,int amt,float miles) {
		System.out.println("six parameters..."+name+"  "+val+"  "+balance+"  "+grade+"  "+amt+"  "+miles);
	}
	
	
	public static void main(String[] args) {
		methods55 m55=new methods55();
		
		m55.m1();
		m55.m2(15);
		m55.m3("krisshna");
		m55.m4(20,"joshna");
		m55.m5(20,1234,74165);
		m55.m6(12.5f,7415.00, 'a', 25);
		m55.m7("krishna", 35, 1500, 's', 159,15.5f);
		
		
		
	}

}