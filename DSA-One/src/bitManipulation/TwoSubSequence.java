package bitManipulation;

//		Little Ponny has been given a string A, and he wants to find out 
//		the lexicographically minimum subsequence from it of size >= 2. Can you help him?
//		A string a is lexicographically smaller than string b, 
//		if the first different letter in a and b is smaller in a. 
//		For example, "abc" is lexicographically smaller than "acc" because 
//		the first different letter is 'b' and 'c' which is smaller in "abc".
//		Input :							Output:
//			 A = "abcdsfhjagj"				"aa"
public class TwoSubSequence {

	public String solve(String A) {
		int N = A.length();

		char min1 = 'z';
		int ind = 0;
		for (int i = 0; i < N - 1; i++) {
			if (A.charAt(i) < min1) { // found out the min char from 1 to N-2
				min1 = A.charAt(i);
				ind = i; // found out index at which this char is present
			}
		}

		char min2 = 'z';
		for (int i = ind + 1; i < N; i++) { // found out the next min char from string
			if (A.charAt(i) < min2) { // since we require subsequence; increasing order of sequence
				min2 = A.charAt(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min1);
		sb.append(min2);
		return sb.toString(); // returning those both indexes
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
