package week1.program.assignments.completed;

public class PostiveOrNegativeNumber {

	public static void main(String[] args) {
		// Given Number is +ve or -ve
		
		int num = -50;
		
//		String n1 ="+ve";
//		String n2 = "-ve";
//		String result = (num < 0) ?  n1 : n2;
		
		if(num < 0) {
			
			System.out.println( num + " is a Negative Number");
			
		}else {
			
			System.out.println(num + " is a Positive Number");
			
		}

	}

}
