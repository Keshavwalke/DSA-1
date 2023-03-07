package gcd;

//		You are given two positive numbers A and B . You need to find the maximum valued integer X such that:
//		X divides A i.e. A % X = 0
//		X and B are co-prime i.e. gcd(X, B) = 1
//		Input :					Output:
//			 A = 30					5
//			 B = 12

public class LargestCoPrimeDivisor {
	public int cpFact(int A, int B) {
		while (GCD(A, B) != 1) {
			A = A / GCD(A, B);
		}
		return A;
	}

	public int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
