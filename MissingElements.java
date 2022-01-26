package week1.program.assignments.completed;

public class MissingElements {

	public static void main(String[] args) {
		// Missing Elements in an Array
		
		int[] arr = {1,2,4,5};
		
		int sum1 = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum1 = sum1+arr[i];
						
		}
		
		System.out.println("Sum1 >> Iteration Based on Index = " + sum1);
		
		int sum2 = 0;
		
		for(int i=1; i<=5; i++) {
			
			sum2 = sum2 + i;
						
		}
		
		System.out.println("Sum2 >> Iteration Based on Length = " + sum2);
		
		System.out.println("The Missing Element in an Array is = " + (sum2-sum1));
	}

}
