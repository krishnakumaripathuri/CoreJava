package Collect;

public class CampareTest {
public static void main(String[] args) {
	Integer a =10;
	Integer b =20;
	Integer c =30;
	
	System.out.println(a.compareTo(b));  //  less than -1
	System.out.println(b.compareTo(a));  //  greater than  +1
	System.out.println(c.compareTo(c));  //  equal 0  
}
}
