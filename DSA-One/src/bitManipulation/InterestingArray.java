package bitManipulation;
//		You have an array A with N elements. We have two types of operation available on this array :

//		We can split an element B into two elements, C and D, such that B = C + D.
//		We can merge two elements, P and Q, to one element, R, 
//		such that R = P ^ Q i.e., XOR of P and Q.
//		You have to determine whether it is possible to convert array A to size 1, 
//		containing a single element equal to 0 after several splits and/or merge?
//				Input :							Output:Yes
//					 A = [9, 17]

public class InterestingArray {
	public String solve(int[] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum ^= A[i];
		}
		if (sum % 2 == 0)
			return "Yes";
		return "No";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
