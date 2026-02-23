package Oops;

public  class Abhibus implements Phonepay {

	// classes allows to write normal methods //
	
	
@Override
	public void TicketBooking() {
		String from="guntur";
		String to="hyderabad";
		String name="krishna";
		int ticketprice=1000;
		
		System.out.println("from::   "  +from);
		System.out.println("to::   "+to);
		System.out.println("name::   "+name);
		System.out.println("ticketprice::   "+ ticketprice);
		
		
		
		
	}
	
	public static void main(String[] args) {
		 
		Abhibus ab=new Abhibus();
		ab.TicketBooking();
		
	System.out.println(Abhibus.id);
		
	}
		
	
}
