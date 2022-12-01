package modularArithmetic;
//	Given A, B and A>B find the number of M>0 such that A%M==B%M

public class AmodMequalsBmodM {

	// Brute force Approach  TC: O(A)
	public static int solve(int A, int B) {
		int count = 0;
		for (int i = 1; i <= A; i++) {
			if (A % i == B % i)count++;		
		}
		return count;
	}
	
	//Using factor method TC: O(sqrt(A-B))
//	A%M=B%M  --> A%M -B%M=0  ---> (A%M -B%M + M)=M  --->(A%M - B%M +M)%M=0  --->(A-B)%M
	public static int solve2(int A, int B) {
		int count = 0;
		int N = (int) Math.sqrt(A - B);
		for (int i = 1; i <= N; i++) {
			if (i == N / i)count++; 		// refer notes if not clear	
			else count += 2;	
		}
		return count;
	}
	
	public static void main(String[] args) {
		int A = 10;
		int B = 4;
		System.out.println(solve(A, B));
		System.out.println(solve2(A,B));
	}

}
