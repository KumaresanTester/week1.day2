package week1.day2;

public class ReverseEvenWords2 {

	public static void main(String[] args) {

		String test = "I am a software tester";

		String[] split = test.split(" ");
		String reverseEvenWords = "";
		int count = 0;

		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();

				if (charArray.length % 2 == 0) {
					count = 0;
					for (int j = charArray.length - 1; j >= 0; j--) {
						reverseEvenWords = reverseEvenWords + charArray[j];
						count++;
					}
				}

				if (count == charArray.length) {
					reverseEvenWords = reverseEvenWords + " ";
				}

			} else {
				reverseEvenWords = reverseEvenWords + split[i];
				if (count == i) {
					reverseEvenWords = reverseEvenWords + " ";
				}
			}
		}
		System.out.println("Reversed Even Words are: "+reverseEvenWords);
	}

}
