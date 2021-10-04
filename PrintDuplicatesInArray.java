package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

//		My Own Way of Code to Print Duplicates Array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Array are Below: " + arr[i]);
				}
			}

		}
		
		System.out.println("\n"+"As per Assignment Pseudo Code--------------------------");

//		Below Codes as per Assignment Pseudo Code
		int arrlength = arr.length;
		int count;
		for (int i = 0; i < arrlength; i++) {
			count = 0;
			for (int j = i + 1; j < arrlength; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Duplicate Array are Below: " + arr[i]);
			}
		}
	}

}
