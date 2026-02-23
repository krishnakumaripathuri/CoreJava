package logical;

public class FindVowelsandConsonentsCount {
	// aeiou

	public static void main(String[] args) {
		String name = "your java stop";
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("vowels::" + ch);
				count1++;

			} else if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				System.out.println("consonents::" + ch);
				count2++;
			}

		}
		System.out.println("vowelcount::  " + count1);
		System.out.println("consonentscount:: " + count2);
	}
}

