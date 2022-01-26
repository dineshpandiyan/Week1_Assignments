package week1.program.assignments.completed;

public class AmstrongNumber {

	public static void main(String[] args) {
		// Given Number is Amstrong Number or Not
		
		int input = 153; // (1*1*1)+(5*5*5)+(3*3*3) = 1+125+27 = 153
		int orgNum = input;
		int sum = 0;
		
		while(input > 0) {
			
			int temp = input % 10;
			sum = sum+(temp*temp*temp);
			input = input/10;			
			
		}
		
		if(sum==orgNum) {
			
			System.out.println(orgNum + " is Amstrong Number");
			
		}else {
			
			System.out.println(orgNum + " is not Amstrong Number");
			
		}

	}

}
