package sorting;

//		Find the Bth smallest element in given array A .
//		NOTE: Users should try to solve it in less than equal to B swaps.
//		Input 1:					Output 1:
//		A = [2, 1, 4, 3, 2]				2
//		B = 3
public class KthSmallestElement {
	public static int kthsmallest(int[] A, int B) {
		for (int i = 0; i < B; i++) {
			int min = A[i];
			int pos = i;
			for (int j = i; j < A.length; j++) {
				if (A[j] < min) {
					min = A[j];
					pos = j;
				}
			}
			int temp = A[i];
			A[i] = min;
			A[pos] = temp;
		}
		return A[B - 1];
	}

	public static void main(String[] args) {
		int A[] = { 2, 1, 4, 3, 2 };
		int B = 3;
		System.out.println(kthsmallest(A, B));

	}

}
