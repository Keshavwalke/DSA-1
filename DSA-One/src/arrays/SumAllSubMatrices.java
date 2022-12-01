package arrays;
//	Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
//		Example Input			Example Output
//		A = [ [1, 1]				16
//		      [1, 1] ]
//	Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
//	Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
//	Number of submatrices with 3 elements = 0
//	Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
//	Total Sum = 4+8+4 = 16
public class SumAllSubMatrices {

	public static int solve(int[][] A) {
		int sum = 0;
		int N = A.length;
		int M = A[0].length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int cont = ((i + 1) * (N - i) * (j + 1) * (M - j));
				sum += A[i][j] * cont;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int A[][] = { { 1, 1 }, { 1, 1 } };
		System.out.println(solve(A));

	}

}
