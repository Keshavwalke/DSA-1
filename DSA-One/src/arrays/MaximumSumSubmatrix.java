package arrays;
//	Given a N * M 2D matrix A. Find the maximum sum sub-matrix from the matrix A. Return the Sum.

public class MaximumSumSubmatrix {
	public int solve(int[][] A) {
		int N = A.length;
		int M = A[0].length;
		int ans = Integer.MIN_VALUE;
		for (int row1 = 0; row1 < N; row1++) {
			long[] pf = new long[M];
			for (int row2 = row1; row2 < N; row2++) {
				for (int col = 0; col < M; col++) {
					pf[col] = pf[col] + (long) A[row2][col];
				}
				long currsum = 0;
				long maxsum = Integer.MIN_VALUE;
				for (int i = 0; i < M; i++) {
					currsum = Math.max(currsum + pf[i], pf[i]);
					maxsum = Math.max(currsum, maxsum);
					ans = Math.max((int) maxsum, (int) ans);
				}
				ans = Math.max((int) maxsum, (int) ans);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
