package com.practise.string;

public class LexicographCompareStrings {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Javac";
		String s3 = "Javavd";

		System.out.println(StringCompare(s1, s1));
		System.out.println(StringCompareTo(s1, s1));
		
		System.out.println(StringCompare(s2, s3));
		System.out.println(StringCompareTo(s2, s3));
		
		System.out.println(StringCompare(s1, s2));
		System.out.println(StringCompareTo(s1, s2));
		
		System.out.println(StringCompare(s3, s1));
		System.out.println(StringCompareTo(s3, s1));

	}

	private static int StringCompare(String s1, String s2) {

		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i))
				continue;
			return s1.charAt(i) - s2.charAt(i);
		}
		if (s1.length() < s2.length()) {
			return s1.length()-s2.length();
		}
		if (s1.length() > s2.length()) {
			return s1.length()-s2.length();
		} else
			return 0;
	}

	private static int StringCompareTo(String s1, String s2)
	{
		return s1.compareTo(s2);
	}
}
