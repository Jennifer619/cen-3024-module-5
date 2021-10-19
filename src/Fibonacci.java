
public class Fibonacci {
	// recursive method
	public static int fibonaccir (int n) { 
		if (n <= 1) {
			return 1;
		} else {
			return fibonaccir (n - 1) + fibonaccir (n - 2);
		}
	}
}
