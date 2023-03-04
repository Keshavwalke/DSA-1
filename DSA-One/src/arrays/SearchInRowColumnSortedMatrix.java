package arrays;

//		Given a matrix of integers A of size N x M and an integer B.
//		In the given matrix every row and column is sorted in non-decreasing order. 
//		Find and return the position of B in the matrix in the given form:
//		If A[i][j] = B then return (i * 1009 + j)
//		If B is not present return -1.
//		Note: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
//		Input :-				Output:
//		A = [[1, 2, 3]				1011
//		     [4, 5, 6]
//		     [7, 8, 9]]
//		B = 2
public class SearchInRowColumnSortedMatrix {
	public int solve(int[][] A, int B) {
		int N = A.length;
		int M = A[0].length;
		int x = 0; 		// x for row
		int y = M - 1; // y for column
		int ans = -1;

		while (x < N && y >= 0) {
			if (A[x][y] < B) { // Starting from first row last column
				x++;
			} else if (A[x][y] > B) { // if coming value greater---> eliminating col
				y--; // If coming value smaller---> eliminating row
			} else {				//that means we at least found one value, now finding the min indexed value
				for (int k = y; k >= 0; k--) { // Iterating over that entire row from back side
					if (A[x][k] == B) {
						ans = ((x + 1) * (1009) + (k + 1));
					}
				}
				break; // breaking the flow so that we get first occurring value
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
