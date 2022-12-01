package arrays;
//	Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, 
//	compute how much water it is able to trap after raining.
//	Input 1:			Output 1:			Input 2:			Output 2:
//	A = [0, 1, 0, 2]		1					A = [1, 2]			0

public class RainWaterTrapped {
	public static int trap(final int[] A) {
		int N = A.length;
		int lmax[] = new int[N];
		lmax[0] = A[0];
		for (int i = 1; i < N; i++) {
			lmax[i] = Math.max(lmax[i - 1], A[i]);
		}
		int rmax[] = new int[N];
		rmax[N - 1] = A[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			rmax[i] = Math.max(rmax[i + 1], A[i]);
		}
		int ans = 0;
		for (int i = 1; i < N - 1; i++) {
			int level = Math.min(lmax[i - 1], rmax[i + 1]);
			int water = level - A[i];
			if (water > 0)
				ans += water;
		}
		return ans;
	}

	public static void main(String[] args) {
		int A[] = { 0, 1, 0, 2 };
		System.out.println(trap(A));
	}

}
