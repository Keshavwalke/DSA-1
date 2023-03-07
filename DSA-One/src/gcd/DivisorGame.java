package gcd;

//		Scooby has 3 three integers A, B, and C.
//		Scooby calls a positive integer special if it is divisible by B and it is divisible by C. 
//		You need to tell the number of special integers less than or equal to A.
//		Input :					Output:
//			 A = 12					2
//			 B = 3
//			 C = 2
public class DivisorGame {
	public int solve(int A, int B, int C) {
		int lcm = B * C / gcd(B, C);
		return A / lcm;
	}

	int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

}
