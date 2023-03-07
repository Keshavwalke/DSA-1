package gcd;

//		There are N players, each with strength A[i]. 
//		when player i attack player j, player j strength reduces to max(0, A[j]-A[i]).
//		When a player's strength reaches zero, it loses the game, 
//		and the game continues in the same manner among other players until only 1 survivor remains.
//		Can you tell the minimum health last surviving person can have?

public class PubG {

	public int solve(int[] A) {
		int ans = A[0];
		for(int i=0;i<A.length;i++) {
			ans=gcd(ans,A[i]);
		}
		return ans;
	}

	// This would the GCD of all numbers
	int gcd(int A, int B) {
		if (B == 0) return A;
		
		return gcd(B, A%B);
	}

}
