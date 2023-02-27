package bitManipulation;
//		Given an array of integers A of size, N. Find the longest subsequence of A, which is odd-even.

//		A subsequence is said to be odd-even in the following cases:
//		The first element of the subsequence is odd; the second element is even,
//		the third element is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]
//		The first element of the subsequence is even, the second element is odd, 
//		the third element is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]
//		Return the maximum possible length of odd-even subsequence.
//		Note: An array B is a subsequence of an array A if B can be obtained from A 
//		by deleting several (possibly, zero, or all) elements.
//		Input :
//		    A = [1, 2, 2, 5, 6]
//		Output :
//		    4
//		    Explanation :
//		        Maximum length odd even subsequence is [1, 2, 5, 6]

public class OddEvenSubsequence {
	public int solve(int[] A) {
		int N = A.length;
		if (N == 1)
			return 1;
		int count = 0;
		int state = 0;
		if (A[0] % 2 == 1) {
			state = 0;
			count++;
		} else {
			state = 1;
			count++;
		}

		for (int j = 1; j < N; j++) {
			int val = A[j] % 2;
			if (val == state) {
				count++;
				state = 1 - val;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
