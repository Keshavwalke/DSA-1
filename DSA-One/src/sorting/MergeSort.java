package sorting;

//		Given an integer array A, sort the array using Merge Sort.
//		Input 1:-							Output 1:
//		A = [1, 4, 10, 2, 1, 5]				[1, 1, 2, 4, 5, 10]
public class MergeSort {
	public int[] solve(int[] A) {
		int left = 0;
		int right = A.length - 1;
		mergeSort(A, left, right);
		return A;
	}

	public static void mergeSort(int[] A, int left, int right) {

		if (left == right) {
			return;
		}
		int mid = (left + right) / 2; // Devide array in two halves
		mergeSort(A, left, mid); // merge first half
		mergeSort(A, mid + 1, right); // merge second half
		merge(A, left, mid, right);
	}

	public static void merge(int[] A, int left, int mid, int right) {
		int length = right - left + 1;
		int[] c = new int[length];
		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right) {
			if (A[i] < A[j]) {
				c[k] = A[i];
				i++;
				// k++;
			} else {
				c[k] = A[j];
				j++;
				// k++;
			}
			k++;
		}
		while (i <= mid) {
			c[k] = A[i];
			i++;
			k++;
		}
		while (j <= right) {
			c[k] = A[j];
			j++;
			k++;
		}
		for (int m = left; m <= right; m++) {
			A[m] = c[m - left];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
