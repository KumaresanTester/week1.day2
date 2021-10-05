package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";

		int count = 0;
		char find = 'e';

		char[] charArray = str.toCharArray();

		int length = charArray.length;

		for (int i = 0; i < length; i++) {

			if (charArray[i] == find) {
				count++;
			}
		}
		System.out.println("Number of Occurance of a char (" + find + ") in a String is " + count);
	}

}
