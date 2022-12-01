package sorting;

public class InsertionSort {
	public static int[] solve(int A[]) {
		int N=A.length;
		for(int i=1;i<N;i++) {
			for(int j=i-1;j>=0;j--) {
				if(A[j]>A[j+1]) {
					int temp=A[j];
					A[j]=A[j+1];
					A[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int A[]= {1,4,2,5,3};
		int[] ans=solve(A);
		for(int i: ans) {
			System.out.print(i+" ");
		}

	}

}
