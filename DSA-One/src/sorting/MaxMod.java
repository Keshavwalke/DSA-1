package sorting;

//		Given an array A of size N, Groot wants you to pick 2 indices i and j such that	1 <= i, j <= N
//		A[i] % A[j] is maximum among all possible pairs of (i, j).
//		Help Groot in finding the maximum value of A[i] % A[j] for some i, j.
//		Input 1:						Output 1:
//			 A = [1, 2, 44, 3]					3
public class MaxMod {
	public static int solve(int[] A) {
		int N = A.length;
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		// This question is nothing but finding out max and second max and returning
		// second max
		for (int i = 0; i < N; i++) {
			if (A[i] > max)
				max = A[i];
		}
		for (int i = 0; i < N; i++) {
			if (A[i] > smax && A[i] < max)
				smax = A[i];
		}
		if (smax == Integer.MIN_VALUE)
			return 0; // corner case if all elements are same

		return smax;
	}

	public static void main(String[] args) {
		int A[]= {1, 2, 44, 3};
		System.out.println(solve(A));

	}

}
