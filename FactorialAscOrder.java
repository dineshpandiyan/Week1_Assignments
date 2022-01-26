package week1.program.assignments.completed;

public class FactorialAscOrder {

	public static void main(String[] args) {
		// 5! ASC = 1*2*3*4*5 = 120;
		
		int num = 5;
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			
			fact = fact * i;		
			
		}
		
		System.out.println("The 5! ASC Value is = " + fact);

	}

}
