package week1.program.assignments.completed;

public class Intersection {

	public static void main(String[] args) {
		// Intersection of 2 Arrays
		
		int[] arr1 = {1,2,3,9};
		int[] arr2 = {5,2,4,6};
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i] == arr2[j]) {
					
					System.out.println("The Instersection of 2 Arrays = " + arr1[i]);					
					
				}				
				
			}			
			
		}

	}

}
