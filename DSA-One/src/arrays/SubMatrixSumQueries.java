package arrays;
//	Given a matrix of integers A of size N x M and multiple queries Q, for each query, 

//	find and return the submatrix sum.
//	Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.
//	NOTE:
//	Rows are numbered from top to bottom, and columns are numbered from left to right.
//	Sum may be large, so return the answer mod 109 + 7.
//		Input 1:							Output 1:
//			 A = [   [1, 2, 3]					 [12, 28]
//			         [4, 5, 6]
//			         [7, 8, 9]   ]
//					 B = [1, 2]
//					 C = [1, 2]
//					 D = [2, 3]
//					 E = [2, 3]

public class SubMatrixSumQueries {

	public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
		int Rlen = A.length;
		int Clen = A[0].length;
		int m = 1000000007;

		long presum[][] = new long[Rlen][Clen];

		for (int i = 0; i < Rlen; i++) {
			for (int j = 0; j < Clen; j++) {
				presum[i][j] = A[i][j];
				if (j > 0)
					presum[i][j] += presum[i][j - 1]; // filled row sum;
			}
		}

		for (int i = 0; i < Clen; i++) {
			for (int j = 0; j < Rlen; j++) {
				if (j > 0) { // filled column sum
					presum[j][i] += presum[j - 1][i];
				}
			}
		}

		int ans[] = new int[B.length]; // created result array
		for (int i = 0; i < B.length; i++) {
			int x1 = B[i] - 1; // (TL-x1,y1) //also made them in 0 based index
			int y1 = C[i] - 1;
			int x2 = D[i] - 1; // (BR-x2,y2)
			int y2 = E[i] - 1;

			long sum = presum[x2][y2];

			if (x1 > 0)
				sum -= presum[x1 - 1][y2];
			if (y1 > 0)
				sum -= presum[x2][y1 - 1];
			if (x1 > 0 && y1 > 0)
				sum += presum[x1 - 1][y1 - 1];

			sum = sum % m;
			if (sum < 0)
				sum = sum + m; // if sum is negative edge case

			ans[i] = (int) sum;
		}

		return ans;
	}

//	public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
//        int ans[] =new int[B.length];
//        int N=A.length;
//        int M=A[0].length;
//        int pre[][]=new int[N][M];
//        for(int i=0;i<N;i++){
//            for(int j=0;j<M;j++){
//                if(j==0) pre[i][j]=A[i][j];
//                else pre[i][j]=pre[i][j-1]+A[i][j];
//            }
//        }
//        for(int i=0;i<M;i++){
//            for(int j=1;j<N;j++){
//                pre[j][i]=pre[j-1][i]+pre[j][i];
//            }
//        }
//        for(int i=0;i<B.length;i++){
//            int p=B[i]-1; int q=C[i]-1;
//            int r=D[i]-1; int s=E[i]-1;
//            int value=pre[r][s];
//            if(q>0){
//                value=value-pre[r][q-1];
//            }
//            if(p>0){
//                value=value-pre[p-1][s];
//            }
//            if(p>0 && q>0){
//                value=value+pre[p-1][q-1];
//            }
//            
//            ans[i]=value;
//
//        }
//        return ans;
//    }

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] B = { 1, 2 };
		int[] C = { 1, 2 };
		int[] D = { 2, 3 };
		int[] E = { 2, 3 };
		int ans[] = solve(A, B, C, D, E);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
