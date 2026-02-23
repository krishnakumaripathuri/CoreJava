package EXCEPT;

public class InsufficientFundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// with use throw key word we can create our custom exception //
	// create exception class //
	// create extends to parent exception class //
	// create zero argument constructor for no detail message //
	// create argument constructor for specified detail message //
	// super -  { super() constructor } 

	public InsufficientFundsException() {
		super();
		
	}

	public InsufficientFundsException(String s) {
		super(s);
	}

}
