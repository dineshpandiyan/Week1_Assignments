package week1.program.assignments.completed;

public class SumOfDigits {

	public static void main(String[] args) {
		// Sum of Digits
		
		int n = 234;
		int sum = 0;
		
		while(n > 0 ) {
			
			int temp = n % 10;
			
			sum = sum + temp;
			
			n = n / 10;			
			
		}
		
		System.out.println("The Sum of Digits is = " + sum);

	}

}
