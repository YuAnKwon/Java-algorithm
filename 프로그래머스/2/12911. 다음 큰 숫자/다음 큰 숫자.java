class Solution {
    public int solution(int n) {
        
        // 1의 개수
        int count = Integer.bitCount(n);
        
        int answer =n+1;
        while(true) {
        	if(count == Integer.bitCount(answer)) {
        		return answer;
        	}
        	answer++;
        }
    }
}