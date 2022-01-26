package week1.program.assignments.completed;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// Print Duplicate Numbers in an Array
		
		int[] arr = {5,4,3,2,1,2,5,4,9,6,9,6};
		
		Arrays.sort(arr); // [1,2,2,3,4,4,5,5,6,6,9,9] >> [0,1,2,3,4,5,6,7,8,9,10,11]
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i] == arr[i+1]) {
				
				System.out.println("The Duplicate Numbers are = " + arr[i]);				
				
			}			
			
		}

	}

}
