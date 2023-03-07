package modularArithmetic;

//		Given an array of integers A and an integer B, 
//		find and return the number of pairs in A whose sum is divisible by B.
//		Since the answer may be large, return the answer modulo (109 + 7).
//				Input :								Output:
//					 A = [1, 2, 3, 4, 5]				4
//					 B = 2
public class PairSumDivisibleByM {

	public int solve(int[] A, int B) {
		int N = A.length;
		long[] count = new long[B];    // Step 1 Create the count array and store the frequency of A[i]%m in count

		for (int i = 0; i < N; i++) {
			int rem = A[i] % B;
			count[rem]++;
		}

		long ans = 0;
		long x = count[0];						// Step 2 find the number of pairs and handle edge cases
		ans += (x * (x - 1)) / 2;				// Edge Case for rem =0

		if (B % 2 == 0) {
			long y = count[B / 2];				// Edge case for rem = B/2 only valid if B is even in odd case not valid
			ans += (y * (y - 1)) / 2;
		}

		int i = 1;						// normal cases
		int j = B - 1;

		while (i < j) {
			ans += count[i] * count[j];
			i++;
			j--;
		}
		return (int) (ans % 1000000007);
	}

}
