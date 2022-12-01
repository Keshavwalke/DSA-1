package arrays;

public class MaxSumSubArrayKandane {
	public static int solve(int[] A) {
		int N = A.length;
		int maxsum = Integer.MIN_VALUE;
		int currentsum = A[0];
		for (int i = 0; i < N; i++) {
			currentsum += A[i];
			if (currentsum > maxsum) {
				maxsum = currentsum;
			}
			if (currentsum < 0) {
				currentsum = 0;
			}
		}
		return maxsum;
	}

	//also finding starting and ending index of the sub array
	public static int[] solve2(int[] A) {
		int N = A.length;
		int maxsum = Integer.MIN_VALUE;
		int currentsum = A[0];
		int start=-1;
		int end=-1;
		for (int i = 0; i < N; i++) {
			currentsum += A[i];
			if (currentsum > maxsum) {
				maxsum = currentsum;
				if(start!=-1) end=i;
			}
			if (currentsum < 0) {
				currentsum = 0;
				if(i<N) start=i+1;
			}
			
		}
		int ans[]=new int[end-start+1];			//size of that subarray would be end-start+1
		int x=start;
		for(int i=0;i<ans.length;i++) {
			ans[i]=A[x];
			x++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int A[] = { -20, 10, -20, -12, 6, 5, -3, 8, -2 };
		
		
		System.out.println(solve(A));			//printed kadane algorithm
		
		int ans[]=solve2(A);
		for(int i: ans) {						//printed that array
			System.out.print(i+" ");
		}
	}

}
