
public class Fibonacci {
	// recursive method
	public static int fibonaccir (int n) { 
		if (n <= 1) {
			return 1;
		} else {
			return fibonaccir (n - 1) + fibonaccir (n - 2);
		}
	}
	// iterative method
	public static int fibonaccii (int n) {
		if (n <= 1) {
			return 1;
		}
		int r = 0, p = 1, pp = 1, i;
		for (i = 2; i <= n; i++) {
			r = p + pp;
			pp = p;
			p = r;
		}
		return r;
	}
	// table
	public static void main (String[] args) {
		int i, n = 40, f1, f2;
		System.out.print("n\tIterative\tRecursive\n");
		System.out.print("==\t=========\t=========\n");
		long startTime, endTime;
		int difference, difference2;
		//loop from 20 to 40 
		for (i = 20; i <= n; i++) { 
			// initial time
			startTime = System.nanoTime(); 
			// fibonacci using iterative method
			f1 = fibonaccii(i); 
			// end time
			endTime = System.nanoTime(); 
			// difference
			difference = (int)((endTime - startTime) / 1e6); 
			// initial time
			startTime = System.nanoTime(); 
			// fibonacci using recursive method
			f2 = fibonaccir(i); 
			// end time
			endTime = System.nanoTime(); 
			// difference
			difference2 = (int)((endTime - startTime) / 1e6); 
			// output
			System.out.print(i + "\t\t" + difference + "\t\t" + difference2 + "\t\n"); 
		}
	}
}
