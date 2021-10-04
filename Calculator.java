package week1.day2;

public class Calculator {

	/*--  Create a class "Calculator" with below methods
	(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	(b) sub(int num1, int num2), it should return subtraction of of num1-num2
	(c) mul(double num1, double num2), it should return product of num1 * num2
	(d) divide(float num1, float num2), it should return division of num1 / num2

	-- Create another class as MyCalculator and call all the methods from Calculator and print the results*/

	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public int sub(int num1, int num2) {
		int subtraction = num1 - num2;
		return subtraction;
	}

	public long multipl(long num1, long num2) {		
		long product = num1*num2;		
		return product;
	}
	
	public float divide(float num1,float num2) {		
		float division = num1/num2;		
		return division;		
	}
	

}
