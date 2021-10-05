package week1.day2;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	 * 
	 * Declare a String String text1 = "stops"; Declare another String String text2
	 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
	 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
	 * the arrays has same value
	 * 
	 */
	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {
			System.out.println("Both Strings Length are same " + text1.length() + " = " + text2.length());
		} else {
			System.out.println("Both Strings Length are different " + text1.length() + " = " + text2.length());
		}

		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		for (int i = 0; i < charArray1.length; i++) {
			for (int j = i; j < charArray2.length; j++) {
				if (charArray1[i] == charArray2[j]) {
					System.out.println("Both Arrays are same " + charArray1[i] + " = " + charArray2[j]);
					break;
				}

			}

		}
	}

}
