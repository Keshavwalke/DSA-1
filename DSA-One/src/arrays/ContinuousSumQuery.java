package arrays;
//		There are A beggars sitting in a row outside a temple. 
//		Each beggar initially has an empty pot. When the devotees come to the temple, 
//		they donate some amount of coins to these beggars. Each devotee gives a fixed amount 
//		of coin(according to their faith and ability) to some K beggars sitting next to each other.
//		Given the amount P donated by each devotee to the beggars ranging from L to R index, 
//		where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at 
//		the end of the day, provided they don't fill their pots by any other means.
//		For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B
//		Input 1:-										Output 1:-
//		A = 5												10 55 45 25 25
//		B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

public class ContinuousSumQuery {
	public static int[] solve(int A, int[][] B) {
		int ans[] = new int[A];
		for (int i = 0; i < B.length; i++) {
			int x = B[i][0] - 1; // start index in 0 based index
			int y = B[i][1]; // accessed end index made sure it is i+1
			int z = B[i][2];
			ans[x] = ans[x] + z; // simply adding value to the start index
			if (B[i][1] < A) {
				ans[y] = ans[y] - z; // corner case means it should no do this for last index
			}

		}
		int presum[] = new int[A];
		presum[0] = ans[0];
		for (int i = 1; i < A; i++) {
			presum[i] = presum[i - 1] + ans[i]; // took prefix sum and returned
		}
		return presum;
	}

	public static void main(String[] args) {
		int A = 5;
		int B[][] = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };

		int[] ans = solve(A, B);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
