class Solution {
    public int[] solution(int n, int m) {
		int big = (n > m) ? n : m;
		int small = (n > m) ? m : n;

		int gcd = 0;
		// 최대공약수
		for (int i = 1; i <= small; i++) {
			if (big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}

		// 최소공배수
		int lcm = (n * m) / gcd;
		return new int[] { gcd, lcm };
	
    }
}