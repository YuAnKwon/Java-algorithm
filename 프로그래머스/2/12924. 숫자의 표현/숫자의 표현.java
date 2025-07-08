class Solution {
public static int solution(int n) {
		// 1부터 n 까지 수 배열 생성
		int start = 1;
		int end = 1;
		int cnt = 0;
		int sum =start;
		while(start <= n) {
			if(sum == n) {
				cnt++;
				sum -= start;
				start++;
			} else if(sum < n) {
				end++;
				sum += end;
			} else {
				sum -= start;
				start++;
			}
		}
    return cnt;
}
}