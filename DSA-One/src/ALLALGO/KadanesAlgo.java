package ALLALGO;
//Program to find maxsum of subarray
public class KadanesAlgo {
	public static int solve(int[] A) {
		int N = A.length;
		int maxsum = Integer.MIN_VALUE;
		int currentsum = A[0];
		for (int i = 0; i < N; i++) {
			currentsum += A[i];
			if(currentsum<0) currentsum=0;
			if (currentsum > maxsum)maxsum = currentsum;
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int A[] = { -20, 10, -20, -12, 6, 5, -3, 8, -2 };
		System.out.println(solve(A));
	}
}
