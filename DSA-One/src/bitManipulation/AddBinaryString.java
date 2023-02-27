package bitManipulation;

public class AddBinaryString {
	public String addBinary(String A, String B) {
		int i = A.length() - 1;
		int j = B.length() - 1;
		int carry = 0;

		StringBuilder sb = new StringBuilder();

		while (i >= 0 || j >= 0) { // Iterating till any index is available
			int sum = carry; // adding previous carry to sum
			if (i >= 0) {
				sum += A.charAt(i) - '0'; // if i index available adding value from that index to sum
			}
			if (j >= 0) {
				sum += B.charAt(j) - '0'; // if j index available adding value from that index to sum
			}
			sb.append(sum % 2); // digit will be sum%2
			carry = sum / 2; // carry is always sum/2
			i--;
			j--;
		}
		if (carry != 0) {
			sb.append(carry); // if at last carry is left adding to sb
		}

		return sb.reverse().toString(); // returning reverse fo sb
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
