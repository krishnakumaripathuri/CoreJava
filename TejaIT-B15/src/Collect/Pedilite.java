package Collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pedilite {
	Integer pid;
	String pname;
	Double price;

	public Pedilite(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pedilite [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Pedilite p1 = new Pedilite(101, "fevicol", 10.5);
		Pedilite p2 = new Pedilite(102, "m-seal", 5.5);
		Pedilite p3 = new Pedilite(103, "fevikwik", 12.5);
		Pedilite p4 = new Pedilite(104, "anabond", 40.5);

		List<Pedilite> list = Arrays.asList(p1, p2, p3, p4);
		String property = "pid";
		String ordertypes = "ASC";
		

		BasedOnID onid = new BasedOnID();
		
		Collections.sort(list, new BasedOnID());
		// Collections.sort(list, new BasedOnPrice());
		// Collections.sort(list, new BasedOnNAME());

		if (property.equals("onid")) {
			Collections.sort(list, new BasedOnID());
		} else if (property.equals("onname")) {
			Collections.sort(list, new BasedOnNAME());
		} else if (property.equals("onprice")) {
			Collections.sort(list, new BasedOnPrice());

		}

		if (ordertypes.equals("DESC")) {
			Collections.reverse(list);
		}

		for (Pedilite Pedilite : list) {
			System.out.println(Pedilite);
		}

	}
}
