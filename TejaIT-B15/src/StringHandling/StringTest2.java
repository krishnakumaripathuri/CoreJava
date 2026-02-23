package StringHandling;

public class StringTest2 {
public static void main(String[] args) {
	// scp - doesn't allow duplicate objects
	// before creating a new object in scp,the object will compare with.equals methods
	// if the same object available in scp,new object won't create
	// but in heap always create new object,it doesn't consider duplication,bcz it doesn't
	// literal - scp  (String constant pool )
	String s1=new String("krishna");   // object - heap
	String s2="daniyelu";
	String s3=new String("krishna");
	String s4="daniyelu";
	String s5="krishna";
	String s6=new String("daniyelu");
	String s7="bhargavi";
	String s8="daniyelu";
	String s9=new String("daniyelu");
	
	// ==  compares the object references (address)
	System.out.println(s1==s2);
	System.out.println(s2==s4);
	System.out.println(s4==s1);
	System.out.println(s8==s6);
	System.out.println(s9==s6);
	
	System.out.println("==========================");
	
	// .equals compare the content , dosn't compare address , and memory location
	System.out.println(s1.equals(s9));
	System.out.println(s3.equals(s6));
	System.out.println(s9.equals(s8));
	System.out.println(s4.equals(s9));
}
}
