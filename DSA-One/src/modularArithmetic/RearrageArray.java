package modularArithmetic;

import java.util.ArrayList;

//	Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.
//	Example :
//	Input : [1, 0]
//	Return : [0, 1]
public class RearrageArray {
	public void arrange(ArrayList<Integer> A) {
		int N = A.size();
		for (int i = 0; i < N; i++) {
			A.set(i, A.get(i) * N); // made value A[i]*N for all cells
		}

		for (int i = 0; i < N; i++) {
			int ans = A.get(A.get(i) / N) / N; // accessing old values (A[i]/N)
			A.set(i, A.get(i) + ans); // adding to current value
		}

		for (int i = 0; i < N; i++) {
			A.set(i, A.get(i) % N); // marking the new values (A[i]%N)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
