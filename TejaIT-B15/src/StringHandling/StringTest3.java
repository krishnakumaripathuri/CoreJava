package StringHandling;

public class StringTest3 {
	public static void main(String[] args) {
		String s = "keerthi keerthana";
		System.out.println(s.charAt(12));
		System.out.println(s.compareTo(s));
		System.out.println(s.concat(" full depend on jesus "));
		System.out.println(s.contains("kee"));
		System.out.println(s.endsWith("ana"));
		System.out.println(s.startsWith("kee"));
		System.out.println(s.equals("keerthi"));
		System.out.println(s.equalsIgnoreCase("KEertHI KEERthaNA"));
		System.out.println(s.hashCode());
		System.out.println(s.indent(6));
		System.out.println(s.indexOf("i"));
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.replace("k", "d"));
		char[] charArr = s.toCharArray();
		System.out.println(charArr);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("================");
		String s2 = "PATHURI KEERTHI KEERTHANA";
		String[] strarr = s2.split("   ");
		for (String words : strarr) {
			System.out.println(words);
		}

	}
}
