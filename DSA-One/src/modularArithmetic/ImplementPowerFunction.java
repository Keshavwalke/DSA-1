package modularArithmetic;

//		Implement pow(A, B) % C.
//		In other words, given A, B and C, Find (AB % C).
//		Input: A = 2, B = 3, C = 3
//		Output: 2
public class ImplementPowerFunction {

	public int pow(int A, int B, int C) {
		if (A == 0) return 0;
		if (B == 0) return 1;				//base case anthing raised to 0 equals 1
		long ans = pow(A, B / 2, C);
		ans = (ans * ans) % C;
		if (B % 2 == 1) {
			ans = (ans * A) % C;
		}
		ans = (ans + C) % C;
		return (int) ans;
	}

}
