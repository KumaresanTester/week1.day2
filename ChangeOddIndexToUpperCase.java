package week1.day2;

public class ChangeOddIndexToUpperCase {
	/*
	 * Pseudo Code
	 * 
	 * Declare String Input as Follow
	 * 
	 * String test = "changeme";
	 * 
	 * a) Convert the String to character array
	 * 
	 * b) Traverse through each character (using loop)
	 * 
	 * c)find the odd index within the loop (use mod operator)
	 * 
	 * d)within the loop, change the character to uppercase, if the index is odd
	 * else don't change
	 * 
	 */

	public static void main(String[] args) {

		String test = "changeme";

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (i % 2 != 0) {

				char upperCase = Character.toUpperCase(charArray[i]);

				System.out.print(upperCase);

			} else {
				System.out.print(charArray[i]);

			}

		}

		System.out.println("\n" + "\nAnotherway to Change Odd Index To UpperCase_____________________________ ");

		String str = "";
		for (int j = 0; j < charArray.length; j++) {

			if (j % 2 != 0) {

				char upperCase2 = Character.toUpperCase(charArray[j]);
				str = str + upperCase2;

			} else {
				str = str + charArray[j];
			}
		}
		System.out.println(str);
	}

}
