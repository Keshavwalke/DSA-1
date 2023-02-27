package bitManipulation;

//		Given an integer array A of N integers, find the pair of integers in the array 
//		which have minimum XOR value. Report the minimum XOR value.
//		Input :						Output:
//			 A = [0, 2, 5, 7]			2
public class MinXorValue {
	public int findMinXor(int[] A) {
		int ans = Integer.MAX_VALUE;
		int N = A.length;
		
		for (int i = 0; i < N; i++) {					//I think this is bruteforce
			for (int j = i + 1; j < N; j++) {
				int val = (A[i] ^ A[j]);
				if (val < ans)
					ans = val;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
