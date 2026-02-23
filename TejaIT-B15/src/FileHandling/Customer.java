package FileHandling;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	int cid;
	String name;
	long cardnumber;
	transient int cvv; // cannot serialize
	static int pin; // cannot serialize

	public Customer(int cid, String name, long cardnumber, int cvv) {
		super();
		this.cid = cid;
		this.name = name;
		this.cardnumber = cardnumber;
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cardnumber=" + cardnumber + ", cvv=" + cvv + "]";
	}

}
