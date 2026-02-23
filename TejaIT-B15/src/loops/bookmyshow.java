package loops;

public class bookmyshow {

	public void ticketbooking(String categary) {
		if(categary.equals("platinum")) {
			System.out.println("your seat is allocated in platinum categary");
		}else if(categary.equals("gold")) {
			System.out.println("your seat is allocated in gold category ");
		}else if(categary.equals("silver")) {
			System.out.println("your seat is allocated in silver category");
		}else {
			System.out.println("your seat is allocated in nela ticket");
		}
	}
	
	public static void main(String[] args) {
		bookmyshow bms=new bookmyshow();
		bms.ticketbooking("nothig");
	}
}
