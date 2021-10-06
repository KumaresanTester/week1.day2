package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		String reverseEvenWords = "";
		int count;

		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();
				count = 0;
				for (int j = charArray.length - 1; j >= 0; j--) {
					reverseEvenWords = reverseEvenWords + charArray[j];
					count++;
					if (count == charArray.length) {
						reverseEvenWords = reverseEvenWords + " ";
					}
				}
			} else {
				count = 0;
				reverseEvenWords = reverseEvenWords + split[i];
				for (int j = 0; j < split.length; j++) {
					count++;
					if (count == split.length) {
						reverseEvenWords = reverseEvenWords + " ";
					}

				}
			}
		}
		System.out.println("Reversed Words are: "+reverseEvenWords);
	}
}
