package Features;

public enum Week {
	// it is multiple values but fixed values in specific values
	// it is used to same static variables access in same to same Enum - {Enumtype.Enumvariable}
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday, 
	Friday, 
	Saturday;

	public static void main(String[] args) {
		System.out.println(Sunday);
		System.out.println(Monday);
		System.out.println(Tuesday);
		System.out.println(Wednesday);
		System.out.println(Thursday);
		System.out.println(Friday);
		System.out.println(Saturday);

	}
}
