package week1.program.assignments.completed;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		// Convert -ve Number to +ve Number
		
		int num = -50;
		
		if(num < 0) {
			
			int y = Math.abs(num);
			System.out.println(num + " is converted into : " + y);
			
		}

	}

}
