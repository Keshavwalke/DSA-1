package arrays;
//		Given a binary array ( all elements are 0's and 1's) yout are allowed to 
//		perform atmost 1 flip operation on any subarray
//		return max no of 1's that can be achieved after performing the operation

public class Max1sAfterFlipping {
	// convert 1 to -1 then 0 to 1
	// apply kadane and get subarray max sum
	// count the no of 1's after flipping subarray from s to e
public static int solve(int A[]) {
	for(int i=0;i<A.length;i++) {
		if(A[i]==1)  A[i]=-1;
		if(A[i]==0) A[i]=1;
	}
	int maxsum=Integer.MIN_VALUE;
	int cursum=0;
	for(int i=0;i<A.length;i++) {
		cursum=A[i];
		if(cursum<0) cursum=0;
		if(cursum>maxsum) maxsum=cursum;
	}
	return maxsum;
}


	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 1, 0, 0, 1, 1 };

		System.out.println(solve(A));
	}

}
