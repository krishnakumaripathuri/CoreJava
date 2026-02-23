package Oops;

public interface Phonepay {
	
	// data hiding - abstract method //

	// data implementation - normal methods //
	
	
	// interface allows only  abstract methods //
	
	public static final int id=10;
	 
	 public void TicketBooking(); // declaration - abstract method //
	
	 
	public Phonepay() {
		// we can't create constructor //
	}
	
	{
		// we can't create instance blocks //
	}
	
	static{
		// we can't create static blocks //
	}
	
	public static void main(String[] args) {
		Phonepay ph=new Phonepay(); // we can't create object //
	}
		
	
		
		
			
		
	
	}


