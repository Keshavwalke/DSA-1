package modularArithmetic;

//		Given two integers A and B. Find the value of A-1 mod B where B is a prime number and gcd(A, B) = 1.
//		A-1 mod B is also known as modular multiplicative inverse of A under modulo B.
//		Input :				Output:
//			 A = 3				2
//			 B = 5
public class PrimeModInverse {

	public int solve(int A, int B) {
		if (A == 0)  return 0;
		// fermats theorem ==> (A^-1)= A^(B-2) mod B
		// question is to calculate (A^-1) mod B
		// by substituting above equation we get ==> (A^(B-2) mod B ) mod B;
		return pow(A, B - 2, B);
	}

	public int pow(int A, int B, int C) {
		if (A == 0)
			return 0;
		if (B == 0)
			return 1;
		long ans = pow(A, B / 2, C);
		ans = (ans * ans) % C;
		if (B % 2 == 1)
			ans = (ans * A) % C;
		ans = (ans + C) % C;
		return (int) ans;
	}

}
