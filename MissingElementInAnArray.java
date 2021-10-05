package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 8 };

		Arrays.sort(arr);

		int counter = 0;
		for (int i = arr[0]; i <= arr.length; i++) {

			if (i != arr[counter]) {
				System.out.println("Missing Element in Array is : " + i);
				break;
			}
			counter++;
		}
	}

}
