package week1.day2;

public class SumOfDigitsFromString2 {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int sum = 0;
		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				int numericValue = Character.getNumericValue(charArray[i]);
				sum = sum + numericValue;
			}
		}
		System.out.println("Sum of Digits is :" + sum);
	}

}
