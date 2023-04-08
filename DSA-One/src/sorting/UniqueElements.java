package sorting;

import java.util.Arrays;

//You are given an array A of N elements.You have to make all elements unique.
//To do so,in one step you can increase any number by one.Find the minimum number of steps.
//	Input :						Output:
//		 A = [1, 1, 3]				1
public class UniqueElements {

	public int solve(int[] A) {
		Arrays.sort(A);
		int count = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1]) {
				count++;
				A[i + 1]++;
			} else if (A[i] > A[i + 1]) {
				count = count + A[i] - A[i + 1] + 1;
				A[i + 1] = A[i] + 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
