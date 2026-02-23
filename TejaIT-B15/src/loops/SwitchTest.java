package loops;

public class SwitchTest {
	public static void main(String[] args) {
		int i = 5;
                //expression
		switch (i) {
		case 7:
			System.out.println("condition 7....");
			break;
		case 5:
			System.out.println("condition 5...");
			break;
		case 15:
			System.out.println("condition 15....");
			break;
		case 25:
			System.out.println("condition 25....");
		default:
			System.out.println("by default condition apply..");
			break;
		}
	}
}
