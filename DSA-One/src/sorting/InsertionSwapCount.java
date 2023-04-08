package sorting;
//	Given an integer array A of size N, sort the elements in increasing order using Insertion Sort.
//	You are asked to return the total number of shifts/swaps done.
public class InsertionSwapCount {

	public int solve(int[] A) {
		int N = A.length;
		int count = 0;

		for (int i = 1; i < N; i++) { // considered 0-0 sorted
			for (int j = i - 1; j >= 0; j--) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp; // similar to bubble sort only pushing min element to start
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
