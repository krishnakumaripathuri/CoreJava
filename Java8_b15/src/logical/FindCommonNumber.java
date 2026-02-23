package logical;

public class FindCommonNumber {
	public static void main(String[] args) {
		int arr1[] = { 10, 30, 40, 80, 90 };
		int arr2[] = { 20, 30, 60, 10, 70, 50, 80 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.println(arr1[i]);
					break;

				}

			}

		}
	}
}
