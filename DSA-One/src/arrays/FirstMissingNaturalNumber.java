package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//		Given an unsorted integer array, A of size N. Find the first missing positive integer.
//		Input 1:		Output 1:			Input 2:					Output 2:
//		[1, 2, 0]			3					[3, 4, -1, 1]				2
public class FirstMissingNaturalNumber {

	public static int bruteForce(int[] A) {
		int N = A.length;
		for (int i = 1; i < N + 1; i++) {
			int flag = 0;
			for (int j = 0; j < N; j++) {
				if (A[j] == i)
					flag = 1;
			}
			if (flag == 0)
				return i;
		}
		return N + 1;
	}

	// Optimized Approach TC:O(N) SC:O(1)
	public static int solve(int A[]) {
		int N = A.length;
		int i = 0;
		while (i < N) {
			if (A[i] <= 0 || A[i] > N || A[i] == i + 1)
				i++;
			else {
				int cindex = A[i] - 1;
				if (A[i] == A[cindex])
					i++;
				else {
					int temp = A[i];
					A[i] = A[cindex];
					A[cindex] = temp;
				}
			}
		}
		for (int k = 0; k < N; k++) {
			if (A[k] != k + 1)
				return k + 1;
		}
		return N + 1;
	}

	// Using set TC:O(N) SC:O(N)
	public static int hashing(int A[]) {
		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			if (A[i] > 0)
				set.add(A[i]);
		}
		for (int i = 1; i <= N; i++) {
			if (!set.contains(i))
				return i;
		}
		return N + 1;
	}

	// Using Sorting NLogN
	public static int sorting(int[] A) {
		int N = A.length;
		Arrays.sort(A);
		int start = -1;
		for (int i = 0; i < N; i++) {
			if (A[i] > 0) {
				start = i;
				break;
			}
		}
		if (start == -1)
			return 1;
		int count = 0;
		for (int i = start; i < N; i++) {
			if (A[i] != count + 1) {
				return count + 1;
			}
			count++;
		}
		return count + 1;
	}

	public static void main(String[] args) {
		int A[] = { 1, 2, 0 };
//		int A[] = { 3, 4, -1, 1 };

		System.out.println(bruteForce(A));
		System.out.println(sorting(A));
		System.out.println(hashing(A));
		System.out.println(solve(A));
	}

}
