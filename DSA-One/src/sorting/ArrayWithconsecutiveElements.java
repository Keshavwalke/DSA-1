package sorting;
//		Given an array of positive integers A, check and return 
//		whether the array elements are consecutive or not.
//		NOTE: Try this with O(1) extra space.
//		Input 1:						Output 1:
//			 A = [3, 2, 1, 4, 5]			1

public class ArrayWithconsecutiveElements {
	public static int solve(int[] A) {
		int N = A.length;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			min = Math.min(min, A[i]); // found the min in array
		}
		int expmax = min + N - 1; // as these are consecutive nos so max must be in this range

		for (int i = 0; i < N; i++) {
			int element = Math.abs(A[i]);
			if (element >= min && element <= expmax) { // element must be inside this range (min to max)
				int index = element - min;
				A[index] = -1 * A[index]; // just made its correct index -(minus)
			}
		}
		for (int i = 0; i < N; i++) {
			if (A[i] > 0)
				return 0; // if any element is left positive that means it was not part of range so returned 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int A[]= {3, 2, 1, 4, 5};
		System.out.println(solve(A));
		
	}

}
