package logical;

public class Stringparilimdam {
	public static void main(String[] args) {

		String name ="madam";
		String reverse ="";
		for (int i=name.length()-1;i>=0;i--) {
			 System.out.println(name.charAt(i));
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
			 
      if (name.equals(reverse)) {
			 System.out.println("Stringparilimdam is true....");
		} else {
			
			System.out.println("stringparilimdam is false....");
		}
	}
}

