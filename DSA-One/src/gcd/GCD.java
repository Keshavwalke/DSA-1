package gcd;

//		Given 2 non-negative integers A and B, find gcd(A, B)
//		GCD of 2 integers A and B is defined as the greatest integer 'g' 
//		such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
//			Input :				Output:
//			A = 4					2
//			B = 6
public class GCD {
	public int gcd(int A, int B) {
		if (B == 0)
			return A;
		return gcd(B, A % B);
	}

}
