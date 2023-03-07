package gcd;

//		Given an integer array A of size N. 
//		You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.
//		Find the maximum value of GCD.
//		Input :							Output:
//			 A = [12, 15, 18]				6

public class DeleteOne {
	public int solve(int[] A) {
		int N = A.length;
		if (N == 1)
			return A[0]; // if one or 2 element then max of them
		if (N == 2) {
			return Math.max(A[0], A[1]);
		}
		int ans = 0;
		int prefix[] = new int[N];
		for (int i = 0; i < N; i++) { // created prefix gcd array
			ans = gcd(ans, A[i]);
			prefix[i] = ans;
		}

		int value = 0;
		int suffix[] = new int[N];
		for (int i = N - 1; i >= 0; i--) { // created suffix gcd array
			value = gcd(value, A[i]);
			suffix[i] = value;
		}

		int fans = Math.max(prefix[N - 2], suffix[1]); // Initializing for edge cases, (1 to N-1---sf[1]) (0 to N-2
														// ----- pf[N-2])

		for (int i = 1; i < N - 1; i++) {
			int left = prefix[i - 1];
			int right = suffix[i + 1];
			int val = gcd(left, right); // taking gcd removing ith element
			if (val > fans)
				fans = val;
		}
		return fans;
	}

	private int gcd(int A, int B) {
		if (B == 0)
			return A; // function to calculate gcd
		return gcd(B, A % B);
	}

}
