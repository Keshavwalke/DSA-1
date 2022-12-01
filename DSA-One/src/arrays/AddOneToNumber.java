package arrays;

import java.util.ArrayList;

//	Given a non-negative number represented as an array of digits, add 1 to the number
//	( increment the number represented by the digits ).
//	The digits are stored such that the most significant digit is at the head of the list.
//	NOTE: Certain things are intentionally left unclear in this question which 
//	you should practice asking the interviewer. For example: for this problem, 
//	the following are some good questions to ask :
//	Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
//	A: For the purpose of this question, YES
//	Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
//	A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
//	Input 1:			Output 1:
//	[1, 2, 3]				[1, 2, 4]
public class AddOneToNumber {
public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

	int size=A.size();
	int carry = 1;
	int num;
	for (int i = size - 1; i >= 0; i--) {
		num = A.get(i);
		num += carry;
		carry = 0;
		if (num == 10) {
			num = 0;
			carry = 1;
		}
		A.set(i, num);
	}
	ArrayList<Integer> res = new ArrayList<Integer>();
	if (carry == 1)
		res.add(1);
	for (int x : A) {
		if (x == 0 && res.size() == 0)
			continue;
		res.add(x);
	}
	return res;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
