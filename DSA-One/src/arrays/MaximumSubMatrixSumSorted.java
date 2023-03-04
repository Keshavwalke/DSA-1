package arrays;

//		Given a row-wise and column-wise sorted matrix A of size N * M.
//		Return the maximum non-empty submatrix sum of this matrix.
//		Input :-			Output:
//			-5 -4 -3				12
//		A = -1  2  3
//			 2  2  4
public class MaximumSubMatrixSumSorted {
	public long solve(int[][] A) {
		int R = A.length;
		int C = A[0].length;
		long ans = Integer.MIN_VALUE;
		long pf[][] = new long[R][C];
		// we need to iterate from bottom right to top left
		// since rows and columns are sorted( max val will be at bottom)
		for (int i = R - 1; i >= 0; i--) {
			for (int j = C - 1; j >= 0; j--) { // filled row wise
				pf[i][j] = A[i][j];
				if (j < C - 1)
					pf[i][j] += pf[i][j + 1];
			}
		}

		for (int i = C - 1; i >= 0; i--) {
			for (int j = R - 1; j >= 0; j--) {
				if (j < R - 1)
					pf[j][i] += pf[j + 1][i]; // filled column wise
				ans = Math.max(ans, pf[j][i]);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
