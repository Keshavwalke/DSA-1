package bitManipulation;
//		Given two strings A and B, find if A is a subsequence of B.

//		Return "YES" if A is a subsequence of B, else return "NO".
//				Input :
//				    A = "bit"
//				    B = "dfbkjijgbbiihbmmt"
//				Output :
//				    YES

public class FindSubsequence {
	public String solve(String A, String B) {
		int len1 = A.length();
		int len2 = B.length();
		if (len1 > len2)
			return "NO";

		int count = 0;
		int ind = 0;
		for (int i = 0; i < len1; i++) {
			char x = A.charAt(i);
			for (int j = ind; j < len2; j++) {
				char y = B.charAt(j);
				if (x == y) {
					ind = j;
					count++;
					break;
				}
			}
		}
		return count == len1 ? "YES" : "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
