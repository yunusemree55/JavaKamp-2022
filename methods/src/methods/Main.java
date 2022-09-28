package methods;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchNumber = 1;

		System.out.println(findNumber(numbers, searchNumber));

		String message = showMessage(searchNumber, findNumber(numbers, searchNumber));
		
		System.out.println(message);
		
		
		int total = Sum(12,3);
		System.out.println(total);
		
		total = Sum(10,5,2);
		System.out.println(total);
		
		total = Sum2(2,5,8,1,0,3,44,23);
		System.out.println(total);
		
		

	}

	
	static boolean findNumber(int[] numbers, int findNumber) {

		for (int number : numbers) {

			if (number == findNumber) {
				
				return true;
			}
		}
		return false;
	}

	
	static String showMessage(int number, boolean situation) {

		if (situation == true) {

			return number + " is found";

		} else {

			return number + " is not found";

		}
	}
	
	
	static int Sum(int number1,int number2) {
		
		return number1 + number2 ;
		
	}
	
	
	//Method Overloading
	
	static int Sum(int number1,int number2,int number3) {
		
		return number1 + number2 + number3;
		
	}
	
	
	static int Sum2(int... numbers) {
		
		int total = 0;
		
		for(int number : numbers) {
			
			total += number;
			
		}
		
		return total;
		
	}

}
