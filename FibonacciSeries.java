package week1.program.assignments.completed;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series
		
		int n = 9; // 1,1,2,3,5,8,13,21,34
		
		int f=1;
		int s=1;
		int t;
		
		System.out.println(f);
		System.out.println(s);
		
		for(int i=3; i<=n; i++) {
			
			t = f+s;
			System.out.println(t);			
			
			// Swap
			
			f = s;
			s = t;
			
		}

	}

}
