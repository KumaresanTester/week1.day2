package week1.day2;

public class Palindrome {
	/*
	 * Pseudo Code
	 * 
	 * a) Declare A String value as"madam"
	 * 
	 * b) Declare another String rev value as "" c) Iterate over the String in
	 * reverse order d) Add the char into rev e) Compare the original String with
	 * the reversed String, if it is same then print palinDrome
	 * 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		char[] charArray = str.toCharArray();
		int length = charArray.length;

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		if (str.equals(rev)) {
			System.out.println(str + " is a PalinDrome");
		} else {
			System.out.println(str + " is not a PalinDrome");
		}
	}

}
