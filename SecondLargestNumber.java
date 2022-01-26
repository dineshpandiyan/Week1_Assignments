package week1.program.assignments.completed;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// Second Largest Number in an Array
		
		int[] arr = {5,2,6,9,10};
		
		Arrays.sort(arr); // [2,5,6,9,10] >> [0,1,2,3,4]
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		int len = arr.length;
		System.out.println("Array Length is = " + len);
		
		System.out.println("The Second Largest Value in an Array is = " + arr[len-2]); // len-2 = 5-2 = 3 >> index of 3 = 9

	}

}
