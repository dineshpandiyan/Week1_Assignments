package week1.program.assignments.completed;

public class FactorialDscOrder {

	public static void main(String[] args) {
		// 5! DSC = 5*4*3*2*1 = 120;
		
		int num = 5;
		int fact = 1;
		
		for(int i=num; i>=1; i--) {
			
			fact = fact * i;			
			
		}
		
		System.out.println("The 5! DSC Value is = " + fact);

	}

}
