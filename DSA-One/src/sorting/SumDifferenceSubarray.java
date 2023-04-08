package sorting;

import java.util.Arrays;

//	Given an integer array, A of size N.
//	You have to find all possible non-empty subsequences of the array of numbers and then, 
//	for each subsequence, find the difference between the largest and smallest numbers in that subsequence. 
//	Then add up all the differences to get the number.
//	As the number may be large, output the number modulo 1e9 + 7 (1000000007).
//	NOTE: Subsequence can be non-contiguous.
public class SumDifferenceSubarray {

	public int solve(int[] A) {
		Arrays.sort(A);
		long mod = 1000000007;
		long maxSum = 0, minSum = 0, n = A.length;
		for (int i = 0; i < n; i++) {
			maxSum += A[i] * (Math.pow(2, (i % mod)) % mod);
			minSum += A[i] * (Math.pow(2, ((n - 1) - i) % mod) % mod);
		}
		return (int) ((maxSum - minSum) % mod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
