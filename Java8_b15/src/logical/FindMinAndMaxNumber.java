package logical;

public class FindMinAndMaxNumber {
	public static void main(String[] args) {

		int arr[] = { 12, 9, 27, 34, 25, 7, 15, 55, 5, 3 };
		int min = arr[0];  // 12,9
		int max = arr[0];  // 12,27,34,
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
         // 12>9=true; 9>27=false; 9>34=false; 9>25=false; 
				min = arr[i];
			} else if (max < arr[i]) {
             // 12<9=false; 12<27=true;			
				max = arr[i];
			}
		}

		System.out.println(min);
		System.out.println(max);
	}
}
