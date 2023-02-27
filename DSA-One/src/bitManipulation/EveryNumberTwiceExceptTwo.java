package bitManipulation;

//		Given an array of positive integers A, two integers appear only once, 
//		and all the other integers appear twice.
//		Find the two integers that appear only once.
//		Note: Return the two numbers in ascending order.
//		Input :							Output:
//		A = [1, 2, 3, 1, 2, 4]				[3, 4]
public class EveryNumberTwiceExceptTwo {
	public int[] solve(int[] A) {
		int N = A.length;
		int set = 0; // created variables to store unique values
		int unset = 0;
		int value = 0;
		for (int i = 0; i < N; i++) {
			value = (value ^ A[i]); // took zor so that i can find first set bit
		}
		int index = 0;
		for (int i = 1; i < 32; i++) {
			if (((value >> i) & 1) == 1) { // bit is set means both unique element must have different bit value
				index = i;
				break; // any index will work but we stopped at first set index only
			}
		}
		for (int i = 0; i < N; i++) {
			if (((A[i] >> index) & 1) == 1) { // if set then part of first unique
				set = (set ^ A[i]);
			} else {
				unset = (unset ^ A[i]); // else part of unset
			}
		}
		int ans[] = new int[2]; // insetted in array and returned
		ans[0] = Math.min(set, unset);
		ans[1] = Math.max(set, unset);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
