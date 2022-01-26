package week1.program.assignments.completed;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// Second Smallest Number in an Array
		
		int[] arr = {1,5,4,3,9,2};
		
		Arrays.sort(arr); // [1,2,3,4,5,9] >> [0,1,2,3,4,5]
		
		System.out.println("The 2nd Smallest Number in an Array is = " + arr[1]);

	}

}
