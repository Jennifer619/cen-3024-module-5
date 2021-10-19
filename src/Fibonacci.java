
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
}
