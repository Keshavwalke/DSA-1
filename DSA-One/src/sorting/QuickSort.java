package sorting;
//	Given an integer array A, sort the array using QuickSort.

public class QuickSort {

	public int[] solve(int[] A) {
		quickSort(A, 0, A.length - 1); // Ran quickSort function
		return A;
	}

	public void quickSort(int A[], int s, int e) {
		if (e <= s)
			return; // if e is less than equal to start stopped
		int k = rearrage(A, s, e); // every time s and e will change by below statement so it'll make array sorted
		quickSort(A, s, k - 1); // sorted left part
		quickSort(A, k + 1, e); // sorted right part

	}

	public int rearrage(int A[], int s, int e) {
		int p1 = s + 1; // Two pointer , one at start+1 and one at end
		int p2 = e;

		while (p1 <= p2) {
			if (A[p1] <= A[s]) { // if element is lesser means its at his correct position
				p1++; // Increased starting pointer
			} else if (A[p2] > A[s]) { // else if element if greater, and at correct index
				p2--; // Minimized right pointer
			} else {
				swap(A, p1, p2); // means left and right pointer need swap
				p1++;
				p2--; // updated the pointer
			}
		}

		swap(A, s, p2); // finally swapped starting element with right pointer
		return p2;
	}

	public void swap(int A[], int x, int y) { // Normal swap function
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
