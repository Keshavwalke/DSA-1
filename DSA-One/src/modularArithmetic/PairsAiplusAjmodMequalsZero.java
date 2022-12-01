package modularArithmetic;
//	Given and array of size N , int M calculate the no of pairs i,j such that
//	(A[i]+A[j])%M=0
//	Note: i!=j and pair (i,j) is same as (j,i) (consider pair only once)

public class PairsAiplusAjmodMequalsZero {
	//Brute force approach
	public static int solve(int []A,int M) {
		int N=A.length;
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if((A[i]+A[j])%M==0 && i!=j)count++;
			}
		}
		return count;
	}

	//using storing frequency approach
	
	
	public static void main(String[] args) {
		int []A= {4,7,6,5,5,3};
		int M=3;
		System.out.println(solve(A,M));

	}

}
