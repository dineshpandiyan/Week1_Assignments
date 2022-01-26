package week1.program.assignments.completed;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number or Not
		
		int n = 9; // 1  2,3,4,5,6,7,8  9
		boolean prime=true; // assumption
		
		for(int i=2; i<n; i++) {
			
			if(n % i == 0) {
				
				prime = false;
				break;				
			}			
			
		}
		
		System.out.println(n + " is a prime number ? : " + prime);

	}

}
