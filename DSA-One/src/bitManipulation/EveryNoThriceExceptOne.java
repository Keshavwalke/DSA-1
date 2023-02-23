package bitManipulation;

//		Given an array of integers, every element appears thrice except for one, which occurs once.
//		Find that element that does not appear thrice.
//		Input :											Output:
//			 A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]				4
public class EveryNoThriceExceptOne {
	public static int singleNumber(final int[] A) {
		int N = A.length;
		int ans = 0;

		for (int i = 0; i < 32; i++) { // TC O(32N)
			int set = 0;
			for (int j = 0; j < N; j++) {
				if (checkbit(i, A[j]) == 1) {
					set++;
				}
			}
			// Every digit is repeating thrice means set bits will be in multiple of 3
			if (set % 3 != 0) { // if not multiple means this extra bit is of unique number
				ans += (1 << i); // adding this to answer
			}
		}
		return ans;
	}

	public static int checkbit(int i, int N) {
		return ((N >> i) & 1);
	}

	public static void main(String[] args) {
		int A[] = { 1, 2, 4, 3, 3, 2, 2, 3, 1, 1 };
		System.out.println(singleNumber(A));

	}

}
