package sorting;

import java.util.Arrays;
import java.util.Comparator;

//	We have a list A of points (x, y) on the plane. Find the B closest points to the origin (0, 0).
//	Here, the distance between two points on a plane is the Euclidean distance.
//	You may return the answer in any order. 
//	The answer is guaranteed to be unique (except for the order that it is in.)
//	NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2 ).
public class BclosestPointsToOrigin {
	public int[][] solve(int[][] A, int B) {
		int res[][] = new int[B][2];
		Arrays.sort(A, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				int x = (a[0] * a[0]) + (a[1] * a[1]);
				int y = (b[0] * b[0]) + (b[1] * b[1]);
				return x - y;
			}
		});

		for (int i = 0; i < B; i++) {
			res[i][0] = A[i][0];
			res[i][1] = A[i][1];
		}
		return res;

	}

}
