package bitManipulation;

//		Given an array of integers A, every element appears twice except for one.
//		Find that integer that occurs once.
//		Input :								Output:
//			 A = [1, 2, 2, 3, 1]				3
public class EveryNumberTwiceExceptOne {

	public static int singleNumber(final int[] A) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) { // since numbers are repeating twice they'll cancel out each other
			ans = (ans ^ A[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 2, 3, 1 };
		System.out.println(singleNumber(A));

	}

}
