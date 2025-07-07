class Solution {
    boolean solution(String s) {
    	int cnt = 0;
    	char[] charArr = s.toCharArray();
    	for(char ch : charArr) {
    		if(ch == '(') cnt++;
    		if(ch == ')') cnt--;
    		if(cnt <0) return false;
    	}
    	return cnt==0;
    }
}