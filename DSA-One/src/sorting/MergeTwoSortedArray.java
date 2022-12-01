package sorting;

//	Given two sorted integer arrays A and B, 
//	merge B and A as one sorted array and return it as an output.
//			Input 1:					Output 1:
//				A = [4, 7, 9 ]				[2, 4, 7, 9, 11, 19]
//				B = [2, 11, 19 ]
public class MergeTwoSortedArray {
	public static int[] solve(final int[] A, final int[] B) {
		int N = A.length;
		int M = B.length;
		int arr[] = new int[N + M]; // created array of size N+M
		int a = 0, b = 0, c = 0;
		while (a < N && b < M) {
			if (A[a] <= B[b]) { // if element of first array is lesser then added to result
				arr[c] = A[a];
				a++;
				c++;
			} else {
				arr[c] = B[b]; // else this added
				b++;
				c++;
			}
		}
		while (a < N) {
			arr[c] = A[a]; // there must be case where one array is over
			a++; // then we'll add next array
			c++;
		}
		while (b < M) {
			arr[c] = B[b]; // either of those loop will run
			b++;
			c++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int A[]= {4,7,9};
		int B[]= {2, 11, 19 };
		
		int ans[]=solve(A,B);
		for(int i: ans) {
			System.out.print(i+" ");
		}

	}

}
