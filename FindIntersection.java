package week1.day2;

public class FindIntersection {
	/*
	 * Pseudo Code
	 * 
	 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
	 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
	 * a nested for another array from 0 to array length e) Compare Both the arrays
	 * using a condition statement
	 * 
	 * f) Print the first array (shoud match item in both arrays)
	 */

	public static void main(String[] args) {

		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		int count = 0;
		String duplicateArrays = "";

		for (int i = 0; i < array1.length; i++) {
			count = 0;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					count++;
					duplicateArrays = duplicateArrays + array1[i] + ",";
				}
			}
		}
		if (count > 0) {
			String substring = duplicateArrays.substring(0, duplicateArrays.length() - 1);
			System.out.println("First Array matched in Both Arrays :" + substring);
		}
	}
}
