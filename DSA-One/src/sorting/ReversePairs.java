package sorting;
//	Given an array of integers A,we call(i,j)an important reverse pair if i<j and A[i]>2*A[j].
//	Return the number of important reverse pairs in the given array A.

public class ReversePairs {

	int c = 0;

	public int solve(int[] A) {
		c = 0;
		mergeSort(A, 0, A.length - 1);
		return c;

	}

	public void mergeSort(int A[], int s, int e) {
		if (s >= e)
			return; // Base case
		int m = (e + s) / 2;
		mergeSort(A, s, m); // first half sorted
		mergeSort(A, m + 1, e); // second half sorted
		merge(A, s, m, e); // merged them
	}

	public void merge(int A[], int s, int m, int e) {
		int One[] = new int[m - s + 1]; // created two arrays from 0 to m and m+1 to end
		int Two[] = new int[e - m];
		int P = One.length;
		int Q = Two.length;

		for (int i = 0; i < P; i++) { // filled first array
			One[i] = A[i + s];
		}
		for (int i = 0; i < Q; i++) { // filled second array
			Two[i] = A[i + m + 1];
		}

		int p1 = 0; // Using two pointer approach to fill A
		int p2 = 0;
		int p3 = s;
		int q1 = s;
		int q2 = m + 1;

		while (q1 <= m && q2 <= e) {
			if ((long) A[q1] > 2 * ((long) A[q2])) {
				c += m - q1 + 1;
				q2++;
			} else
				q1++;
		}

		while (p1 < P && p2 < Q) {
			if (One[p1] <= Two[p2]) { // if first array's element lesser filled to A
				A[p3] = One[p1];
				p1++;
				p3++;

			} else {
				A[p3] = Two[p2]; // that means second array's element is lesser
				p2++;
				p3++;

			}
		}

		while (p1 < P) {
			A[p3] = One[p1];
			p1++;
			p3++;
		} // Either of this loop will run
		while (p2 < Q) {
			A[p3] = Two[p2];
			p2++;
			p3++;
		}
	}

}
