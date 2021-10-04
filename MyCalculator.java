package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
//		Created an Object
		Calculator obj = new Calculator();
		
//		Called the add method from Calculator class
		int addition = obj.add(10, 20, 50);	
		
//		Called sub method from Calculator class
		int subtract = obj.sub(5000, 2500);
		
//		Called multipl method from Calculator class
		long multiply = obj.multipl(200, subtract);
		
//		Called divide method from Calculator class
		float div = obj.divide(multiply, 15);
		
//		Printing the Results
		System.out.println("add method returns: "+addition);
		System.out.println("sub method returns: "+subtract);
		System.out.println("multipl method returns: "+multiply);
		System.out.println("divide method returns: "+div);
		
	}

}
